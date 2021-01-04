package com.example.courseviewer.model.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.courseviewer.model.StudentModel;
import com.example.courseviewer.model.StudentSubjectModel;
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
public final class StudentSubjectDAO_Impl implements StudentSubjectDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StudentSubjectModel> __insertionAdapterOfStudentSubjectModel;

  private final EntityDeletionOrUpdateAdapter<StudentSubjectModel> __deletionAdapterOfStudentSubjectModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteStudentSubjectByTheirIds;

  public StudentSubjectDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStudentSubjectModel = new EntityInsertionAdapter<StudentSubjectModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `student_subject_table` (`id`,`idStudentS`,`idSubjectS`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StudentSubjectModel value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getIdStudentS());
        stmt.bindLong(3, value.getIdSubjectS());
      }
    };
    this.__deletionAdapterOfStudentSubjectModel = new EntityDeletionOrUpdateAdapter<StudentSubjectModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `student_subject_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StudentSubjectModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteStudentSubjectByTheirIds = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM student_subject_table WHERE (idStudentS = ? AND idSubjectS = ?)";
        return _query;
      }
    };
  }

  @Override
  public Object createStudentSubject(final StudentSubjectModel studentSubjectModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStudentSubjectModel.insert(studentSubjectModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteStudentSubject(final StudentSubjectModel studentSubjectModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStudentSubjectModel.handle(studentSubjectModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteStudentSubjectByTheirIds(final int studentId, final int subjectId,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteStudentSubjectByTheirIds.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, studentId);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, subjectId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteStudentSubjectByTheirIds.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public LiveData<List<StudentModel>> readStudentsInSubject(final int idSubject) {
    final String _sql = "SELECT * FROM studentTable WHERE idStudent IN (SELECT idStudentS FROM student_subject_table WHERE idSubjectS = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idSubject);
    return __db.getInvalidationTracker().createLiveData(new String[]{"studentTable","student_subject_table"}, false, new Callable<List<StudentModel>>() {
      @Override
      public List<StudentModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdStudent = CursorUtil.getColumnIndexOrThrow(_cursor, "idStudent");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final List<StudentModel> _result = new ArrayList<StudentModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StudentModel _item;
            final int _tmpIdStudent;
            _tmpIdStudent = _cursor.getInt(_cursorIndexOfIdStudent);
            final String _tmpFirstName;
            _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            final String _tmpLastName;
            _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            _item = new StudentModel(_tmpIdStudent,_tmpFirstName,_tmpLastName);
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
  public LiveData<List<StudentModel>> readStudentsOutSubject(final int idSubject) {
    final String _sql = "SELECT * FROM studentTable WHERE idStudent NOT IN (SELECT idStudentS FROM student_subject_table WHERE idSubjectS = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idSubject);
    return __db.getInvalidationTracker().createLiveData(new String[]{"studentTable","student_subject_table"}, false, new Callable<List<StudentModel>>() {
      @Override
      public List<StudentModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdStudent = CursorUtil.getColumnIndexOrThrow(_cursor, "idStudent");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final List<StudentModel> _result = new ArrayList<StudentModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StudentModel _item;
            final int _tmpIdStudent;
            _tmpIdStudent = _cursor.getInt(_cursorIndexOfIdStudent);
            final String _tmpFirstName;
            _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            final String _tmpLastName;
            _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            _item = new StudentModel(_tmpIdStudent,_tmpFirstName,_tmpLastName);
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
  public StudentSubjectModel readStudentSubjectObject(final int idSubject, final int idStudent) {
    final String _sql = "SELECT * FROM student_subject_table WHERE (idSubjectS = ? AND idStudentS = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idSubject);
    _argIndex = 2;
    _statement.bindLong(_argIndex, idStudent);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfIdStudentS = CursorUtil.getColumnIndexOrThrow(_cursor, "idStudentS");
      final int _cursorIndexOfIdSubjectS = CursorUtil.getColumnIndexOrThrow(_cursor, "idSubjectS");
      final StudentSubjectModel _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpIdStudentS;
        _tmpIdStudentS = _cursor.getInt(_cursorIndexOfIdStudentS);
        final int _tmpIdSubjectS;
        _tmpIdSubjectS = _cursor.getInt(_cursorIndexOfIdSubjectS);
        _result = new StudentSubjectModel(_tmpId,_tmpIdStudentS,_tmpIdSubjectS);
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
