package com.killvetrov.bankcrab.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.killvetrov.bankcrab.models.OrganizationModel;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Killvetrov on 28-Oct-15.
 */
public class SQLiteManager {

    private Context context;
    private SQLiteOpenHelper sqlhelper;
    private SQLiteDatabase database;

    public SQLiteManager(Context context) {
        this.context = context;
        this.sqlhelper = new SQLiteHelper(context);
    }

    public void open() throws SQLException {
        this.database = sqlhelper.getWritableDatabase();
    }

    public void close() {
        if (sqlhelper != null)
            sqlhelper.close();
    }

    public long insertOrganization(OrganizationModel orgModel) {
        return database.insert(SQLiteHelper.TABLE_ORGANIZATIONS, null, orgModel.getContentValues());
    }

    public void insertAllOrganizations(ArrayList<OrganizationModel> orgModelsList) {
        for (OrganizationModel m : orgModelsList) {
            insertOrganization(m);
        }
    }

//    public ArrayList<BuyModel> selectBuys() {
//        Cursor cursor = database.query(SQLiteHelper.TABLE_BUY, new String[] {SQLiteHelper.COLUMN_ID, SQLiteHelper.COLUMN_NAME, SQLiteHelper.COLUMN_COUNT}, null, null, null, null, null);
//        ArrayList<BuyModel> selected = new ArrayList<>();
//
//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            long id = cursor.getLong(cursor.getColumnIndex(SQLiteHelper.COLUMN_ID));
//            String name = cursor.getString(cursor.getColumnIndex(SQLiteHelper.COLUMN_NAME));
//            Double count = cursor.getDouble(cursor.getColumnIndex(SQLiteHelper.COLUMN_COUNT));
//            selected.add(new BuyModel(id, name, count));
//            cursor.moveToNext();
//        }
//
//        return selected;
//    }

    public int deleteOrganization(long orgId) {
        return database.delete(SQLiteHelper.TABLE_ORGANIZATIONS, SQLiteHelper.COLUMN_ID + " = " + orgId, null);
    }

}
