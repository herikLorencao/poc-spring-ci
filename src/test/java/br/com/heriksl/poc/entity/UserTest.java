package br.com.heriksl.poc.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    void constructor() {
        assertAll(() -> new User("Test", 10L));
    }

    @Test
    void talkHappyTest() {
        var user = new User("Test", 10L);
        var message = user.talk(true);
        assertEquals("I have a nice day!", message);
    }

    @Test
    void talkBadTest() {
        var user = new User("Test", 10L);
        var message = user.talk(false);
        assertEquals("I have a bad day :", message);
    }
}
