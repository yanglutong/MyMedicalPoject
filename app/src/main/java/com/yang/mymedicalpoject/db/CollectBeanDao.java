package com.yang.mymedicalpoject.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yang.mymedicalpoject.bean.CollectBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COLLECT_BEAN".
*/
public class CollectBeanDao extends AbstractDao<CollectBean, Long> {

    public static final String TABLENAME = "COLLECT_BEAN";

    /**
     * Properties of entity CollectBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TitleName = new Property(1, String.class, "titleName", false, "TITLE_NAME");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
    }


    public CollectBeanDao(DaoConfig config) {
        super(config);
    }
    
    public CollectBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COLLECT_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TITLE_NAME\" TEXT," + // 1: titleName
                "\"NAME\" TEXT);"); // 2: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COLLECT_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CollectBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String titleName = entity.getTitleName();
        if (titleName != null) {
            stmt.bindString(2, titleName);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CollectBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String titleName = entity.getTitleName();
        if (titleName != null) {
            stmt.bindString(2, titleName);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CollectBean readEntity(Cursor cursor, int offset) {
        CollectBean entity = new CollectBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // titleName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // name
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CollectBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitleName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CollectBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CollectBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CollectBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
