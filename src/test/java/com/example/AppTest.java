package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetingShouldBeCorrect() {
        assertEquals("Hello, DevOps CI/CD Pipeline!", App.greet());
    }
}
