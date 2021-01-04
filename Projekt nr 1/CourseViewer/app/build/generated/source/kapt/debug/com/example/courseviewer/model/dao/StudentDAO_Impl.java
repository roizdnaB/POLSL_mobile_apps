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
import com.example.courseviewer.model.StudentModel;
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
public final class StudentDAO_Impl implements StudentDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StudentModel> __insertionAdapterOfStudentModel;

  private final EntityDeletionOrUpdateAdapter<StudentModel> __deletionAdapterOfStudentModel;

  private final EntityDeletionOrUpdateAdapter<StudentModel> __updateAdapterOfStudentModel;

  public StudentDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStudentModel = new EntityInsertionAdapter<StudentModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `studentTable` (`idStudent`,`firstName`,`lastName`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StudentModel value) {
        stmt.bindLong(1, value.getIdStudent());
        if (value.getFirstName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastName());
        }
      }
    };
    this.__deletionAdapterOfStudentModel = new EntityDeletionOrUpdateAdapter<StudentModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `studentTable` WHERE `idStudent` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StudentModel value) {
        stmt.bindLong(1, value.getIdStudent());
      }
    };
    this.__updateAdapterOfStudentModel = new EntityDeletionOrUpdateAdapter<StudentModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `studentTable` SET `idStudent` = ?,`firstName` = ?,`lastName` = ? WHERE `idStudent` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StudentModel value) {
        stmt.bindLong(1, value.getIdStudent());
        if (value.getFirstName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastName());
        }
        stmt.bindLong(4, value.getIdStudent());
      }
    };
  }

  @Override
  public Object createStudent(final StudentModel studentModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStudentModel.insert(studentModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteStudent(final StudentModel studentModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStudentModel.handle(studentModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateStudent(final StudentModel studentModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfStudentModel.handle(studentModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<StudentModel>> readAllStudents() {
    final String _sql = "SELECT * FROM studentTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"studentTable"}, false, new Callable<List<StudentModel>>() {
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
  public StudentModel readStudentById(final int idStudent) {
    final String _sql = "SELECT * FROM studentTable WHERE idStudent=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idStudent);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIdStudent = CursorUtil.getColumnIndexOrThrow(_cursor, "idStudent");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
      final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
      final StudentModel _result;
      if(_cursor.moveToFirst()) {
        final int _tmpIdStudent;
        _tmpIdStudent = _cursor.getInt(_cursorIndexOfIdStudent);
        final String _tmpFirstName;
        _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        final String _tmpLastName;
        _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
        _result = new StudentModel(_tmpIdStudent,_tmpFirstName,_tmpLastName);
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
