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
import com.example.courseviewer.model.DateConverters;
import com.example.courseviewer.model.GradeModel;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GradeDAO_Impl implements GradeDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GradeModel> __insertionAdapterOfGradeModel;

  private final DateConverters __dateConverters = new DateConverters();

  private final EntityDeletionOrUpdateAdapter<GradeModel> __deletionAdapterOfGradeModel;

  private final EntityDeletionOrUpdateAdapter<GradeModel> __updateAdapterOfGradeModel;

  public GradeDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGradeModel = new EntityInsertionAdapter<GradeModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `gradeTable` (`idGrade`,`idGStudent`,`idGSubject`,`description`,`grade`,`date`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GradeModel value) {
        stmt.bindLong(1, value.getIdGrade());
        stmt.bindLong(2, value.getIdGStudent());
        stmt.bindLong(3, value.getIdGSubject());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getGrade());
        final Long _tmp;
        _tmp = __dateConverters.convertToLong(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
      }
    };
    this.__deletionAdapterOfGradeModel = new EntityDeletionOrUpdateAdapter<GradeModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `gradeTable` WHERE `idGrade` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GradeModel value) {
        stmt.bindLong(1, value.getIdGrade());
      }
    };
    this.__updateAdapterOfGradeModel = new EntityDeletionOrUpdateAdapter<GradeModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `gradeTable` SET `idGrade` = ?,`idGStudent` = ?,`idGSubject` = ?,`description` = ?,`grade` = ?,`date` = ? WHERE `idGrade` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GradeModel value) {
        stmt.bindLong(1, value.getIdGrade());
        stmt.bindLong(2, value.getIdGStudent());
        stmt.bindLong(3, value.getIdGSubject());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getGrade());
        final Long _tmp;
        _tmp = __dateConverters.convertToLong(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        stmt.bindLong(7, value.getIdGrade());
      }
    };
  }

  @Override
  public Object createGrade(final GradeModel gradeModel, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGradeModel.insert(gradeModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteGrade(final GradeModel gradeModel, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGradeModel.handle(gradeModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateGrade(final GradeModel gradeModel, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfGradeModel.handle(gradeModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<GradeModel>> readAllGrades() {
    final String _sql = "SELECT * FROM gradeTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"gradeTable"}, false, new Callable<List<GradeModel>>() {
      @Override
      public List<GradeModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "idGrade");
          final int _cursorIndexOfIdGStudent = CursorUtil.getColumnIndexOrThrow(_cursor, "idGStudent");
          final int _cursorIndexOfIdGSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "idGSubject");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "grade");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final List<GradeModel> _result = new ArrayList<GradeModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GradeModel _item;
            final int _tmpIdGrade;
            _tmpIdGrade = _cursor.getInt(_cursorIndexOfIdGrade);
            final int _tmpIdGStudent;
            _tmpIdGStudent = _cursor.getInt(_cursorIndexOfIdGStudent);
            final int _tmpIdGSubject;
            _tmpIdGSubject = _cursor.getInt(_cursorIndexOfIdGSubject);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final long _tmpGrade;
            _tmpGrade = _cursor.getLong(_cursorIndexOfGrade);
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverters.convertToDate(_tmp);
            _item = new GradeModel(_tmpIdGrade,_tmpIdGStudent,_tmpIdGSubject,_tmpDescription,_tmpGrade,_tmpDate);
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
  public LiveData<List<GradeModel>> readStudentsGrades(final int idStudent, final int idSubject) {
    final String _sql = "SELECT * FROM gradeTable WHERE (gradeTable.idGStudent = ? AND gradeTable.idGSubject = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idStudent);
    _argIndex = 2;
    _statement.bindLong(_argIndex, idSubject);
    return __db.getInvalidationTracker().createLiveData(new String[]{"gradeTable"}, false, new Callable<List<GradeModel>>() {
      @Override
      public List<GradeModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "idGrade");
          final int _cursorIndexOfIdGStudent = CursorUtil.getColumnIndexOrThrow(_cursor, "idGStudent");
          final int _cursorIndexOfIdGSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "idGSubject");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "grade");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final List<GradeModel> _result = new ArrayList<GradeModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GradeModel _item;
            final int _tmpIdGrade;
            _tmpIdGrade = _cursor.getInt(_cursorIndexOfIdGrade);
            final int _tmpIdGStudent;
            _tmpIdGStudent = _cursor.getInt(_cursorIndexOfIdGStudent);
            final int _tmpIdGSubject;
            _tmpIdGSubject = _cursor.getInt(_cursorIndexOfIdGSubject);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final long _tmpGrade;
            _tmpGrade = _cursor.getLong(_cursorIndexOfGrade);
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverters.convertToDate(_tmp);
            _item = new GradeModel(_tmpIdGrade,_tmpIdGStudent,_tmpIdGSubject,_tmpDescription,_tmpGrade,_tmpDate);
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
  public LiveData<List<GradeModel>> readAllStudentsGrades(final int idStudent) {
    final String _sql = "SELECT * FROM gradeTable WHERE gradeTable.idGStudent = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idStudent);
    return __db.getInvalidationTracker().createLiveData(new String[]{"gradeTable"}, false, new Callable<List<GradeModel>>() {
      @Override
      public List<GradeModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "idGrade");
          final int _cursorIndexOfIdGStudent = CursorUtil.getColumnIndexOrThrow(_cursor, "idGStudent");
          final int _cursorIndexOfIdGSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "idGSubject");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "grade");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final List<GradeModel> _result = new ArrayList<GradeModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GradeModel _item;
            final int _tmpIdGrade;
            _tmpIdGrade = _cursor.getInt(_cursorIndexOfIdGrade);
            final int _tmpIdGStudent;
            _tmpIdGStudent = _cursor.getInt(_cursorIndexOfIdGStudent);
            final int _tmpIdGSubject;
            _tmpIdGSubject = _cursor.getInt(_cursorIndexOfIdGSubject);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final long _tmpGrade;
            _tmpGrade = _cursor.getLong(_cursorIndexOfGrade);
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverters.convertToDate(_tmp);
            _item = new GradeModel(_tmpIdGrade,_tmpIdGStudent,_tmpIdGSubject,_tmpDescription,_tmpGrade,_tmpDate);
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
}
