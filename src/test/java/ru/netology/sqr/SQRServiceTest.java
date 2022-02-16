package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void threeSquares() {
        SQRService service = new SQRService();
        int excepted  = 3;
        int actual = service.squareQuantyCalc(200, 300);
        assertEquals(excepted, actual);
    }

    @Test
    void zeroSquare() {
        SQRService service = new SQRService();
        int excepted  = 0;
        int actual = service.squareQuantyCalc(1, 5);
        assertEquals(excepted, actual);
    }

    @Test
    void tenSquares() {
        SQRService service = new SQRService();
        int excepted  = 10;
        int actual = service.squareQuantyCalc(1, 370);
        assertEquals(excepted, actual);
    }

}