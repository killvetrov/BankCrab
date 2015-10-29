package com.killvetrov.bankcrab.models;

import android.content.ContentValues;

import com.killvetrov.bankcrab.data.SQLiteHelper;

/**
 * Created by Killvetrov on 26-Oct-15.
 */
public class OrganizationModel {

    private long _id;
    private String serverId;
    private int orgType;
    private String title;
    private String regionId;
    private String cityId;
    private String phone;
    private String link;
    private String address;

    public OrganizationModel() {
    }

    public OrganizationModel(long _id, String serverId, int orgType, String title, String regionId, String cityId, String phone, String link, String address) {
        this._id = _id;
        this.serverId = serverId;
        this.orgType = orgType;
        this.title = title;
        this.regionId = regionId;
        this.cityId = cityId;
        this.phone = phone;
        this.link = link;
        this.address = address;
    }

    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();

        cv.put(SQLiteHelper.COLUMN_SERVERID, this.serverId);
        cv.put(SQLiteHelper.COLUMN_ORGTYPE, this.orgType);
        cv.put(SQLiteHelper.COLUMN_TITLE, this.title);
        cv.put(SQLiteHelper.COLUMN_REGIONID, this.regionId);
        cv.put(SQLiteHelper.COLUMN_CITYID, this.cityId);
        cv.put(SQLiteHelper.COLUMN_PHONE, this.phone);
        cv.put(SQLiteHelper.COLUMN_ADDRESS, this.address);
        cv.put(SQLiteHelper.COLUMN_LINK, this.link);

        return cv;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public int getOrgType() {
        return orgType;
    }

    public void setOrgType(int orgType) {
        this.orgType = orgType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
