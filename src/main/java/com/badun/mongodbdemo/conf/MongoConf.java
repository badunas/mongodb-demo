package com.badun.mongodbdemo.conf;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Artsiom Badun.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com/badun/mongodbdemo/data/repo")
public class MongoConf extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "userEvents";
    }

    @Override
    public Mongo mongo() throws Exception {
        Mongo mongo = new MongoClient("192.168.99.100", 32777);
        mongo.setWriteConcern(WriteConcern.SAFE);
        return mongo;
    }
}
