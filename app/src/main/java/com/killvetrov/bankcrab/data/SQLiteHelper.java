package com.killvetrov.bankcrab.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Killvetrov on 28-Oct-15.
 */
public class SQLiteHelper extends SQLiteOpenHelper {

    // Main data
    public static final String DATABASE_NAME = "bank_dataset.db";
    private static final int DATABASE_VERSION = 3;

    // Table buy
    public static final String TABLE_ORGANIZATIONS = "organizations";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_SERVERID = "server_id";
    public static final String COLUMN_ORGTYPE = "org_type";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_LINK = "link";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_REGIONID = "region_id";
    public static final String COLUMN_CITYID = "city_id";
    public static final String COLUMN_PHONE = "phone";

    private static final String CREATE_TABLE_ORGANIZATIONS = "create table " + TABLE_ORGANIZATIONS + " (" +
            COLUMN_ID + " integer primary key AUTOINCREMENT," +
            COLUMN_SERVERID + " TEXT, " +
            COLUMN_ORGTYPE + " integer, " +
            COLUMN_TITLE + " TEXT, " +
            COLUMN_REGIONID + " TEXT, " +
            COLUMN_CITYID + " TEXT, " +
            COLUMN_PHONE + " TEXT, " +
            COLUMN_ADDRESS + " TEXT, " +
            COLUMN_LINK + " TEXT)";

    private static final String DROP_TABLE_ORGANIZATIONS = "DROP TABLE IF EXISTS " + TABLE_ORGANIZATIONS;

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_ORGANIZATIONS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE_ORGANIZATIONS);
        onCreate(sqLiteDatabase);
    }

}