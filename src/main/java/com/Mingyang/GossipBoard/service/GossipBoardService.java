package com.Mingyang.GossipBoard.service;

import org.springframework.stereotype.Service;

@Service
public class GossipBoardService {
    public String getMessage(int userId) {
        return "Hello Message: " + String.valueOf(userId);
    }
}
