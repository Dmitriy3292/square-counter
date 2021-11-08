package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sqrServiceTest {

    @Test
    void shouldsquareСounter() {
        sqrService sqrService = new sqrService();

        int expected = 3;
        int actual = sqrService.squareСounter(200, 300);
        assertEquals(expected, actual);
    }
}