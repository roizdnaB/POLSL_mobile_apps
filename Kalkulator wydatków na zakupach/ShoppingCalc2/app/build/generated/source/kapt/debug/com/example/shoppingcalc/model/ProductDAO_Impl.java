package com.example.shoppingcalc.model;

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
public final class ProductDAO_Impl implements ProductDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductModel> __insertionAdapterOfProductModel;

  private final EntityDeletionOrUpdateAdapter<ProductModel> __deletionAdapterOfProductModel;

  private final EntityDeletionOrUpdateAdapter<ProductModel> __updateAdapterOfProductModel;

  public ProductDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductModel = new EntityInsertionAdapter<ProductModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `product_table` (`idProduct`,`name`,`price`,`quantity`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductModel value) {
        stmt.bindLong(1, value.getIdProduct());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getPrice());
        stmt.bindLong(4, value.getQuantity());
      }
    };
    this.__deletionAdapterOfProductModel = new EntityDeletionOrUpdateAdapter<ProductModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `product_table` WHERE `idProduct` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductModel value) {
        stmt.bindLong(1, value.getIdProduct());
      }
    };
    this.__updateAdapterOfProductModel = new EntityDeletionOrUpdateAdapter<ProductModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `product_table` SET `idProduct` = ?,`name` = ?,`price` = ?,`quantity` = ? WHERE `idProduct` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductModel value) {
        stmt.bindLong(1, value.getIdProduct());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getPrice());
        stmt.bindLong(4, value.getQuantity());
        stmt.bindLong(5, value.getIdProduct());
      }
    };
  }

  @Override
  public Object createProduct(final ProductModel productModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductModel.insert(productModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteProduct(final ProductModel productModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductModel.handle(productModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateProduct(final ProductModel productModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfProductModel.handle(productModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<ProductModel>> readAllProducts() {
    final String _sql = "SELECT * FROM product_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"product_table"}, false, new Callable<List<ProductModel>>() {
      @Override
      public List<ProductModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdProduct = CursorUtil.getColumnIndexOrThrow(_cursor, "idProduct");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final List<ProductModel> _result = new ArrayList<ProductModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductModel _item;
            final int _tmpIdProduct;
            _tmpIdProduct = _cursor.getInt(_cursorIndexOfIdProduct);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final float _tmpPrice;
            _tmpPrice = _cursor.getFloat(_cursorIndexOfPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            _item = new ProductModel(_tmpIdProduct,_tmpName,_tmpPrice,_tmpQuantity);
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
  public ProductModel readProductById(final int idProduct) {
    final String _sql = "SELECT * FROM product_table WHERE idProduct=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idProduct);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIdProduct = CursorUtil.getColumnIndexOrThrow(_cursor, "idProduct");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
      final ProductModel _result;
      if(_cursor.moveToFirst()) {
        final int _tmpIdProduct;
        _tmpIdProduct = _cursor.getInt(_cursorIndexOfIdProduct);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final float _tmpPrice;
        _tmpPrice = _cursor.getFloat(_cursorIndexOfPrice);
        final int _tmpQuantity;
        _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
        _result = new ProductModel(_tmpIdProduct,_tmpName,_tmpPrice,_tmpQuantity);
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
