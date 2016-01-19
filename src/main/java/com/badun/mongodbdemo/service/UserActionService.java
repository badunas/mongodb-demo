package com.badun.mongodbdemo.service;

import com.badun.mongodbdemo.data.entity.UserAction;
import com.badun.mongodbdemo.data.repo.UserActionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Artsiom Badun.
 */
@Service
public class UserActionService {

    @Autowired
    private UserActionRepo userActionRepo;

    public UserAction findUserAction(String actionId) {
        return userActionRepo.findOne(actionId);
    }

    public UserAction createUserAction(UserAction userAction) {
        userAction.setActionId("USID:UA:" + UUID.randomUUID());
        userAction.setTimestamp(new Date());
        userActionRepo.save(userAction);
        return userAction;
    }
}
