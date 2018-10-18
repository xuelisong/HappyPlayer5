package com.zlm.hp.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zlm.down.entity.DownloadThreadInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOWNLOAD_THREAD_INFO".
*/
public class DownloadThreadInfoDao extends AbstractDao<DownloadThreadInfo, Void> {

    public static final String TABLENAME = "DOWNLOAD_THREAD_INFO";

    /**
     * Properties of entity DownloadThreadInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property TaskId = new Property(0, String.class, "taskId", false, "TASK_ID");
        public final static Property ThreadNum = new Property(1, int.class, "threadNum", false, "THREAD_NUM");
        public final static Property ThreadId = new Property(2, int.class, "threadId", false, "THREAD_ID");
        public final static Property DownloadedSize = new Property(3, int.class, "downloadedSize", false, "DOWNLOADED_SIZE");
    }


    public DownloadThreadInfoDao(DaoConfig config) {
        super(config);
    }
    
    public DownloadThreadInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOWNLOAD_THREAD_INFO\" (" + //
                "\"TASK_ID\" TEXT," + // 0: taskId
                "\"THREAD_NUM\" INTEGER NOT NULL ," + // 1: threadNum
                "\"THREAD_ID\" INTEGER NOT NULL ," + // 2: threadId
                "\"DOWNLOADED_SIZE\" INTEGER NOT NULL );"); // 3: downloadedSize
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOWNLOAD_THREAD_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownloadThreadInfo entity) {
        stmt.clearBindings();
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(1, taskId);
        }
        stmt.bindLong(2, entity.getThreadNum());
        stmt.bindLong(3, entity.getThreadId());
        stmt.bindLong(4, entity.getDownloadedSize());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownloadThreadInfo entity) {
        stmt.clearBindings();
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(1, taskId);
        }
        stmt.bindLong(2, entity.getThreadNum());
        stmt.bindLong(3, entity.getThreadId());
        stmt.bindLong(4, entity.getDownloadedSize());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public DownloadThreadInfo readEntity(Cursor cursor, int offset) {
        DownloadThreadInfo entity = new DownloadThreadInfo();
        readEntity(cursor, entity, offset);
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownloadThreadInfo entity, int offset) {
        entity.setTaskId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setThreadNum(cursor.getInt(offset + 1));
        entity.setThreadId(cursor.getInt(offset + 2));
        entity.setDownloadedSize(cursor.getInt(offset + 3));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(DownloadThreadInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(DownloadThreadInfo entity) {
        return null;
    }

    @Override
    public boolean hasKey(DownloadThreadInfo entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
