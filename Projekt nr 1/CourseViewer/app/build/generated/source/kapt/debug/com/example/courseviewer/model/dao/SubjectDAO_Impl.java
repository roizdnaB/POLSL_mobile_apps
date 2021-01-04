package com.example.courseviewer.model.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.courseviewer.model.SubjectModel;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SubjectDAO_Impl implements SubjectDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SubjectModel> __insertionAdapterOfSubjectModel;

  private final EntityDeletionOrUpdateAdapter<SubjectModel> __deletionAdapterOfSubjectModel;

  private final EntityDeletionOrUpdateAdapter<SubjectModel> __updateAdapterOfSubjectModel;

  public SubjectDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubjectModel = new EntityInsertionAdapter<SubjectModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `subjectTable` (`idSubject`,`title`,`description`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubjectModel value) {
        stmt.bindLong(1, value.getIdSubject());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
      }
    };
    this.__deletionAdapterOfSubjectModel = new EntityDeletionOrUpdateAdapter<SubjectModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `subjectTable` WHERE `idSubject` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubjectModel value) {
        stmt.bindLong(1, value.getIdSubject());
      }
    };
    this.__updateAdapterOfSubjectModel = new EntityDeletionOrUpdateAdapter<SubjectModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `subjectTable` SET `idSubject` = ?,`title` = ?,`description` = ? WHERE `idSubject` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubjectModel value) {
        stmt.bindLong(1, value.getIdSubject());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getIdSubject());
      }
    };
  }

  @Override
  public Object createSubject(final SubjectModel subjectModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSubjectModel.insert(subjectModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteSubject(final SubjectModel subjectModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSubjectModel.handle(subjectModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateSubject(final SubjectModel subjectModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSubjectModel.handle(subjectModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<SubjectModel>> readAllSubjects() {
    final String _sql = "SELECT * FROM subjectTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"subjectTable"}, false, new Callable<List<SubjectModel>>() {
      @Override
      public List<SubjectModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "idSubject");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final List<SubjectModel> _result = new ArrayList<SubjectModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubjectModel _item;
            final int _tmpIdSubject;
            _tmpIdSubject = _cursor.getInt(_cursorIndexOfIdSubject);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            _item = new SubjectModel(_tmpIdSubject,_tmpTitle,_tmpDescription);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public SubjectModel readSubjectById(final int idSubject) {
    final String _sql = "SELECT * FROM subjectTable WHERE idSubject=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idSubject);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIdSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "idSubject");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final SubjectModel _result;
      if(_cursor.moveToFirst()) {
        final int _tmpIdSubject;
        _tmpIdSubject = _cursor.getInt(_cursorIndexOfIdSubject);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result = new SubjectModel(_tmpIdSubject,_tmpTitle,_tmpDescription);
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
