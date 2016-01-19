package com.badun.mongodbdemo.model;

import java.util.Date;

/**
 * Created by Artsiom Badun.
 */
public class HeartBeat {
    public final String status;
    public final Date time;

    public HeartBeat(String status) {
        this.status = status;
        this.time = new Date();
    }
}
