package com.killvetrov.bankcrab.models;

/**
 * Created by Killvetrov on 26-Oct-15.
 */
public class CurrencyModel {

    private long _id;
    private String code;
    private String name;

    public CurrencyModel() {
    }

    public CurrencyModel(long _id, String code, String name) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
