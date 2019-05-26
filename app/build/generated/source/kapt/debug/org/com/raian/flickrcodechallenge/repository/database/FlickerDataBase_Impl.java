package org.com.raian.flickrcodechallenge.repository.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import org.com.raian.flickrcodechallenge.repository.database.dao.FlickerDao;
import org.com.raian.flickrcodechallenge.repository.database.dao.FlickerDao_Impl;

@SuppressWarnings("unchecked")
public final class FlickerDataBase_Impl extends FlickerDataBase {
  private volatile FlickerDao _flickerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `flicker` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `owner` TEXT, `secret` TEXT, `server` TEXT, `farm` INTEGER, `title` TEXT, `ispublic` TEXT, `isfriend` INTEGER, `isfamily` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"6cce354b4f3628621bd4844248ccc4b8\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `flicker`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFlicker = new HashMap<String, TableInfo.Column>(9);
        _columnsFlicker.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsFlicker.put("owner", new TableInfo.Column("owner", "TEXT", false, 0));
        _columnsFlicker.put("secret", new TableInfo.Column("secret", "TEXT", false, 0));
        _columnsFlicker.put("server", new TableInfo.Column("server", "TEXT", false, 0));
        _columnsFlicker.put("farm", new TableInfo.Column("farm", "INTEGER", false, 0));
        _columnsFlicker.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsFlicker.put("ispublic", new TableInfo.Column("ispublic", "TEXT", false, 0));
        _columnsFlicker.put("isfriend", new TableInfo.Column("isfriend", "INTEGER", false, 0));
        _columnsFlicker.put("isfamily", new TableInfo.Column("isfamily", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFlicker = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFlicker = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFlicker = new TableInfo("flicker", _columnsFlicker, _foreignKeysFlicker, _indicesFlicker);
        final TableInfo _existingFlicker = TableInfo.read(_db, "flicker");
        if (! _infoFlicker.equals(_existingFlicker)) {
          throw new IllegalStateException("Migration didn't properly handle flicker(org.com.raian.flickrcodechallenge.repository.database.model.FlickerDataClass).\n"
                  + " Expected:\n" + _infoFlicker + "\n"
                  + " Found:\n" + _existingFlicker);
        }
      }
    }, "6cce354b4f3628621bd4844248ccc4b8", "3233febb7dc57390fc20a8e76d29e5af");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "flicker");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `flicker`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FlickerDao flickerDao() {
    if (_flickerDao != null) {
      return _flickerDao;
    } else {
      synchronized(this) {
        if(_flickerDao == null) {
          _flickerDao = new FlickerDao_Impl(this);
        }
        return _flickerDao;
      }
    }
  }
}
