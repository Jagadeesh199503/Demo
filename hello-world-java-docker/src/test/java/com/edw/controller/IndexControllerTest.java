package com.edw.controller;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexControllerTest {

    @Test
    void index_ReturnsExpectedMap() {
        // Arrange
        IndexController indexController = new IndexController();

        // Act
        Map<String, Object> actualResponse = indexController.index();

        // Assert
        assertTrue(actualResponse.containsKey("success"));
        assertTrue(actualResponse.containsKey("hello"));
        assertTrue(actualResponse.containsKey("new-message"));
        assertEquals(true, actualResponse.get("success"));
        assertEquals("world", actualResponse.get("hello"));
        assertEquals("adding a new msg", actualResponse.get("new-message"));
    }
}
