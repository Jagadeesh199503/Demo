package com.edw.controller;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexControllerTest {

    @Test
    void index_ReturnsExpectedMap() {
        // Arrange
        Map<String, Object> expectedResponse = Map.of(
                "success", true,
                "hello", "world",
                "new-message", "adding a new msg"
        );

        // Act
        Map<String, Object> actualResponse = new IndexController().index();

        // Assert
        assertEquals(expectedResponse, actualResponse);
    }
}
