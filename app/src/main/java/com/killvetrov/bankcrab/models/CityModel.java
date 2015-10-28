package com.killvetrov.bankcrab.models;

/**
 * Created by Killvetrov on 26-Oct-15.
 */
public class CityModel {

    private long _id;
    private String serverId;
    private String name;

    public CityModel() {}

    public CityModel(long _id, String serverId, String name) {
        this._id = _id;
        this.serverId = serverId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
