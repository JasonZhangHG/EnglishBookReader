package com.aidebar.greendaotest.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.example.jason.examination.data.BookList;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_LIST".
*/
public class BookListDao extends AbstractDao<BookList, Long> {

    public static final String TABLENAME = "BOOK_LIST";

    /**
     * Properties of entity BookList.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property BookName = new Property(1, String.class, "bookName", false, "BookList");
        public final static Property BookIntroduce = new Property(2, String.class, "BookIntroduce", false, "BOOK_INTRODUCE");
        public final static Property BookWriter = new Property(3, String.class, "BookWriter", false, "BOOK_WRITER");
        public final static Property BookValue = new Property(4, String.class, "BookValue", false, "BOOK_VALUE");
        public final static Property BookCover = new Property(5, String.class, "bookCover", false, "BOOK_COVER");
        public final static Property Classification = new Property(6, String.class, "classification", false, "CLASSIFICATION");
    }


    public BookListDao(DaoConfig config) {
        super(config);
    }
    
    public BookListDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_LIST\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BookList\" TEXT," + // 1: bookName
                "\"BOOK_INTRODUCE\" TEXT," + // 2: BookIntroduce
                "\"BOOK_WRITER\" TEXT," + // 3: BookWriter
                "\"BOOK_VALUE\" TEXT," + // 4: BookValue
                "\"BOOK_COVER\" TEXT," + // 5: bookCover
                "\"CLASSIFICATION\" TEXT);"); // 6: classification
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_LIST\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookList entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String bookName = entity.getBookName();
        if (bookName != null) {
            stmt.bindString(2, bookName);
        }
 
        String BookIntroduce = entity.getBookIntroduce();
        if (BookIntroduce != null) {
            stmt.bindString(3, BookIntroduce);
        }
 
        String BookWriter = entity.getBookWriter();
        if (BookWriter != null) {
            stmt.bindString(4, BookWriter);
        }
 
        String BookValue = entity.getBookValue();
        if (BookValue != null) {
            stmt.bindString(5, BookValue);
        }
 
        String bookCover = entity.getBookCover();
        if (bookCover != null) {
            stmt.bindString(6, bookCover);
        }
 
        String classification = entity.getClassification();
        if (classification != null) {
            stmt.bindString(7, classification);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookList entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String bookName = entity.getBookName();
        if (bookName != null) {
            stmt.bindString(2, bookName);
        }
 
        String BookIntroduce = entity.getBookIntroduce();
        if (BookIntroduce != null) {
            stmt.bindString(3, BookIntroduce);
        }
 
        String BookWriter = entity.getBookWriter();
        if (BookWriter != null) {
            stmt.bindString(4, BookWriter);
        }
 
        String BookValue = entity.getBookValue();
        if (BookValue != null) {
            stmt.bindString(5, BookValue);
        }
 
        String bookCover = entity.getBookCover();
        if (bookCover != null) {
            stmt.bindString(6, bookCover);
        }
 
        String classification = entity.getClassification();
        if (classification != null) {
            stmt.bindString(7, classification);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BookList readEntity(Cursor cursor, int offset) {
        BookList entity = new BookList( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bookName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // BookIntroduce
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // BookWriter
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // BookValue
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // bookCover
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // classification
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookList entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBookName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBookIntroduce(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBookWriter(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBookValue(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBookCover(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setClassification(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BookList entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BookList entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookList entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
