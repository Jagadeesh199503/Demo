package com.edw.controller;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


class IndexControllerTest{

    @Test
    void IndexControllertest(){
        HashMap<String, Object> expResponse = new HashMap<>();
        expResponse.put("success", true);
        expResponse.put("hello", "world");
        expResponse.put("new-message", "adding a new msg");

        HashMap actualResponse = IndexController.index();
        assertEquals(expResponse, actualResponse);

    }
}