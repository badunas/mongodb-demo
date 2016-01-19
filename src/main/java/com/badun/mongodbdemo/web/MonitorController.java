package com.badun.mongodbdemo.web;

import com.badun.mongodbdemo.model.HeartBeat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Artsiom Badun.
 */

@RestController
@RequestMapping("/monitor")
public class MonitorController {

    @RequestMapping("heartbeat")
    HeartBeat home() {
        return new HeartBeat("LIVE");
    }
}
