package org.com.raian.flickrcodechallenge.repository.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import org.com.raian.flickrcodechallenge.repository.database.model.FlickerDataClass;

@SuppressWarnings("unchecked")
public final class FlickerDao_Impl implements FlickerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfFlickerDataClass;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public FlickerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFlickerDataClass = new EntityInsertionAdapter<FlickerDataClass>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `flicker`(`id`,`owner`,`secret`,`server`,`farm`,`title`,`ispublic`,`isfriend`,`isfamily`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FlickerDataClass value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getOwner() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOwner());
        }
        if (value.getSecret() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSecret());
        }
        if (value.getServer() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getServer());
        }
        if (value.getFarm() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getFarm());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.isPublic() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.isPublic());
        }
        if (value.isFriend() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.isFriend());
        }
        if (value.isFamily() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.isFamily());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM flicker";
        return _query;
      }
    };
  }

  @Override
  public void insert(FlickerDataClass flickerDataClass) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFlickerDataClass.insert(flickerDataClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<FlickerDataClass> getAll() {
    final String _sql = "SELECT * FROM flicker ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfOwner = _cursor.getColumnIndexOrThrow("owner");
      final int _cursorIndexOfSecret = _cursor.getColumnIndexOrThrow("secret");
      final int _cursorIndexOfServer = _cursor.getColumnIndexOrThrow("server");
      final int _cursorIndexOfFarm = _cursor.getColumnIndexOrThrow("farm");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfIsPublic = _cursor.getColumnIndexOrThrow("ispublic");
      final int _cursorIndexOfIsFriend = _cursor.getColumnIndexOrThrow("isfriend");
      final int _cursorIndexOfIsFamily = _cursor.getColumnIndexOrThrow("isfamily");
      final List<FlickerDataClass> _result = new ArrayList<FlickerDataClass>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FlickerDataClass _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpOwner;
        _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
        final String _tmpSecret;
        _tmpSecret = _cursor.getString(_cursorIndexOfSecret);
        final String _tmpServer;
        _tmpServer = _cursor.getString(_cursorIndexOfServer);
        final Long _tmpFarm;
        if (_cursor.isNull(_cursorIndexOfFarm)) {
          _tmpFarm = null;
        } else {
          _tmpFarm = _cursor.getLong(_cursorIndexOfFarm);
        }
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpIsPublic;
        _tmpIsPublic = _cursor.getString(_cursorIndexOfIsPublic);
        final Long _tmpIsFriend;
        if (_cursor.isNull(_cursorIndexOfIsFriend)) {
          _tmpIsFriend = null;
        } else {
          _tmpIsFriend = _cursor.getLong(_cursorIndexOfIsFriend);
        }
        final Long _tmpIsFamily;
        if (_cursor.isNull(_cursorIndexOfIsFamily)) {
          _tmpIsFamily = null;
        } else {
          _tmpIsFamily = _cursor.getLong(_cursorIndexOfIsFamily);
        }
        _item = new FlickerDataClass(_tmpId,_tmpOwner,_tmpSecret,_tmpServer,_tmpFarm,_tmpTitle,_tmpIsPublic,_tmpIsFriend,_tmpIsFamily);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public FlickerDataClass getById(String id) {
    final String _sql = "SELECT * FROM flicker WHERE id = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfOwner = _cursor.getColumnIndexOrThrow("owner");
      final int _cursorIndexOfSecret = _cursor.getColumnIndexOrThrow("secret");
      final int _cursorIndexOfServer = _cursor.getColumnIndexOrThrow("server");
      final int _cursorIndexOfFarm = _cursor.getColumnIndexOrThrow("farm");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfIsPublic = _cursor.getColumnIndexOrThrow("ispublic");
      final int _cursorIndexOfIsFriend = _cursor.getColumnIndexOrThrow("isfriend");
      final int _cursorIndexOfIsFamily = _cursor.getColumnIndexOrThrow("isfamily");
      final FlickerDataClass _result;
      if(_cursor.moveToFirst()) {
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpOwner;
        _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
        final String _tmpSecret;
        _tmpSecret = _cursor.getString(_cursorIndexOfSecret);
        final String _tmpServer;
        _tmpServer = _cursor.getString(_cursorIndexOfServer);
        final Long _tmpFarm;
        if (_cursor.isNull(_cursorIndexOfFarm)) {
          _tmpFarm = null;
        } else {
          _tmpFarm = _cursor.getLong(_cursorIndexOfFarm);
        }
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpIsPublic;
        _tmpIsPublic = _cursor.getString(_cursorIndexOfIsPublic);
        final Long _tmpIsFriend;
        if (_cursor.isNull(_cursorIndexOfIsFriend)) {
          _tmpIsFriend = null;
        } else {
          _tmpIsFriend = _cursor.getLong(_cursorIndexOfIsFriend);
        }
        final Long _tmpIsFamily;
        if (_cursor.isNull(_cursorIndexOfIsFamily)) {
          _tmpIsFamily = null;
        } else {
          _tmpIsFamily = _cursor.getLong(_cursorIndexOfIsFamily);
        }
        _result = new FlickerDataClass(_tmpId,_tmpOwner,_tmpSecret,_tmpServer,_tmpFarm,_tmpTitle,_tmpIsPublic,_tmpIsFriend,_tmpIsFamily);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
