package com.example.courseviewer.model;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.courseviewer.model.dao.GradeDAO;
import com.example.courseviewer.model.dao.GradeDAO_Impl;
import com.example.courseviewer.model.dao.StudentDAO;
import com.example.courseviewer.model.dao.StudentDAO_Impl;
import com.example.courseviewer.model.dao.StudentSubjectDAO;
import com.example.courseviewer.model.dao.StudentSubjectDAO_Impl;
import com.example.courseviewer.model.dao.SubjectDAO;
import com.example.courseviewer.model.dao.SubjectDAO_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CourseViewerDatabase_Impl extends CourseViewerDatabase {
  private volatile StudentDAO _studentDAO;

  private volatile SubjectDAO _subjectDAO;

  private volatile GradeDAO _gradeDAO;

  private volatile StudentSubjectDAO _studentSubjectDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `studentTable` (`idStudent` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `subjectTable` (`idSubject` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `gradeTable` (`idGrade` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idGStudent` INTEGER NOT NULL, `idGSubject` INTEGER NOT NULL, `description` TEXT NOT NULL, `grade` INTEGER NOT NULL, `date` INTEGER NOT NULL, FOREIGN KEY(`idGStudent`) REFERENCES `studentTable`(`idStudent`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`idGSubject`) REFERENCES `subjectTable`(`idSubject`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `student_subject_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idStudentS` INTEGER NOT NULL, `idSubjectS` INTEGER NOT NULL, FOREIGN KEY(`idStudentS`) REFERENCES `studentTable`(`idStudent`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`idSubjectS`) REFERENCES `subjectTable`(`idSubject`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0329e9d537e97747b51dc019874cb6fa')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `studentTable`");
        _db.execSQL("DROP TABLE IF EXISTS `subjectTable`");
        _db.execSQL("DROP TABLE IF EXISTS `gradeTable`");
        _db.execSQL("DROP TABLE IF EXISTS `student_subject_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsStudentTable = new HashMap<String, TableInfo.Column>(3);
        _columnsStudentTable.put("idStudent", new TableInfo.Column("idStudent", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentTable.put("firstName", new TableInfo.Column("firstName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentTable.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStudentTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStudentTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStudentTable = new TableInfo("studentTable", _columnsStudentTable, _foreignKeysStudentTable, _indicesStudentTable);
        final TableInfo _existingStudentTable = TableInfo.read(_db, "studentTable");
        if (! _infoStudentTable.equals(_existingStudentTable)) {
          return new RoomOpenHelper.ValidationResult(false, "studentTable(com.example.courseviewer.model.StudentModel).\n"
                  + " Expected:\n" + _infoStudentTable + "\n"
                  + " Found:\n" + _existingStudentTable);
        }
        final HashMap<String, TableInfo.Column> _columnsSubjectTable = new HashMap<String, TableInfo.Column>(3);
        _columnsSubjectTable.put("idSubject", new TableInfo.Column("idSubject", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubjectTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubjectTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubjectTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubjectTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubjectTable = new TableInfo("subjectTable", _columnsSubjectTable, _foreignKeysSubjectTable, _indicesSubjectTable);
        final TableInfo _existingSubjectTable = TableInfo.read(_db, "subjectTable");
        if (! _infoSubjectTable.equals(_existingSubjectTable)) {
          return new RoomOpenHelper.ValidationResult(false, "subjectTable(com.example.courseviewer.model.SubjectModel).\n"
                  + " Expected:\n" + _infoSubjectTable + "\n"
                  + " Found:\n" + _existingSubjectTable);
        }
        final HashMap<String, TableInfo.Column> _columnsGradeTable = new HashMap<String, TableInfo.Column>(6);
        _columnsGradeTable.put("idGrade", new TableInfo.Column("idGrade", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGradeTable.put("idGStudent", new TableInfo.Column("idGStudent", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGradeTable.put("idGSubject", new TableInfo.Column("idGSubject", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGradeTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGradeTable.put("grade", new TableInfo.Column("grade", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGradeTable.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGradeTable = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysGradeTable.add(new TableInfo.ForeignKey("studentTable", "CASCADE", "NO ACTION",Arrays.asList("idGStudent"), Arrays.asList("idStudent")));
        _foreignKeysGradeTable.add(new TableInfo.ForeignKey("subjectTable", "CASCADE", "NO ACTION",Arrays.asList("idGSubject"), Arrays.asList("idSubject")));
        final HashSet<TableInfo.Index> _indicesGradeTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGradeTable = new TableInfo("gradeTable", _columnsGradeTable, _foreignKeysGradeTable, _indicesGradeTable);
        final TableInfo _existingGradeTable = TableInfo.read(_db, "gradeTable");
        if (! _infoGradeTable.equals(_existingGradeTable)) {
          return new RoomOpenHelper.ValidationResult(false, "gradeTable(com.example.courseviewer.model.GradeModel).\n"
                  + " Expected:\n" + _infoGradeTable + "\n"
                  + " Found:\n" + _existingGradeTable);
        }
        final HashMap<String, TableInfo.Column> _columnsStudentSubjectTable = new HashMap<String, TableInfo.Column>(3);
        _columnsStudentSubjectTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentSubjectTable.put("idStudentS", new TableInfo.Column("idStudentS", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentSubjectTable.put("idSubjectS", new TableInfo.Column("idSubjectS", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStudentSubjectTable = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysStudentSubjectTable.add(new TableInfo.ForeignKey("studentTable", "CASCADE", "NO ACTION",Arrays.asList("idStudentS"), Arrays.asList("idStudent")));
        _foreignKeysStudentSubjectTable.add(new TableInfo.ForeignKey("subjectTable", "CASCADE", "NO ACTION",Arrays.asList("idSubjectS"), Arrays.asList("idSubject")));
        final HashSet<TableInfo.Index> _indicesStudentSubjectTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStudentSubjectTable = new TableInfo("student_subject_table", _columnsStudentSubjectTable, _foreignKeysStudentSubjectTable, _indicesStudentSubjectTable);
        final TableInfo _existingStudentSubjectTable = TableInfo.read(_db, "student_subject_table");
        if (! _infoStudentSubjectTable.equals(_existingStudentSubjectTable)) {
          return new RoomOpenHelper.ValidationResult(false, "student_subject_table(com.example.courseviewer.model.StudentSubjectModel).\n"
                  + " Expected:\n" + _infoStudentSubjectTable + "\n"
                  + " Found:\n" + _existingStudentSubjectTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "0329e9d537e97747b51dc019874cb6fa", "4a8a9b68dea99f86ab3fb4b37ce21b1e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "studentTable","subjectTable","gradeTable","student_subject_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `studentTable`");
      _db.execSQL("DELETE FROM `subjectTable`");
      _db.execSQL("DELETE FROM `gradeTable`");
      _db.execSQL("DELETE FROM `student_subject_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public StudentDAO studentDAO() {
    if (_studentDAO != null) {
      return _studentDAO;
    } else {
      synchronized(this) {
        if(_studentDAO == null) {
          _studentDAO = new StudentDAO_Impl(this);
        }
        return _studentDAO;
      }
    }
  }

  @Override
  public SubjectDAO subjectDAO() {
    if (_subjectDAO != null) {
      return _subjectDAO;
    } else {
      synchronized(this) {
        if(_subjectDAO == null) {
          _subjectDAO = new SubjectDAO_Impl(this);
        }
        return _subjectDAO;
      }
    }
  }

  @Override
  public GradeDAO gradeDAO() {
    if (_gradeDAO != null) {
      return _gradeDAO;
    } else {
      synchronized(this) {
        if(_gradeDAO == null) {
          _gradeDAO = new GradeDAO_Impl(this);
        }
        return _gradeDAO;
      }
    }
  }

  @Override
  public StudentSubjectDAO studentSubjectDAO() {
    if (_studentSubjectDAO != null) {
      return _studentSubjectDAO;
    } else {
      synchronized(this) {
        if(_studentSubjectDAO == null) {
          _studentSubjectDAO = new StudentSubjectDAO_Impl(this);
        }
        return _studentSubjectDAO;
      }
    }
  }
}
