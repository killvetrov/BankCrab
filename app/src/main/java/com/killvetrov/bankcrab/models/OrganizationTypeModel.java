package com.killvetrov.bankcrab.models;

/**
 * Created by Killvetrov on 26-Oct-15.
 */
public class OrganizationTypeModel {

    private long _id;
    private int code;
    private String name;

    public OrganizationTypeModel() {
    }

    public OrganizationTypeModel(long _id, int code, String name) {
        this._id = _id;
        this.code = code;
        this.name = name;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
