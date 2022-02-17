package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSquareQuantityCalcThreeSquares() {
        SQRService service = new SQRService();
        int excepted = 3;
        int actual = service.squareQuantityCalc(200, 300);
        assertEquals(excepted, actual);
    }

    @Test
    void shouldSquareQuantityCalcZeroSquare() {
        SQRService service = new SQRService();
        int excepted = 0;
        int actual = service.squareQuantityCalc(1, 5);
        assertEquals(excepted, actual);
    }

    @Test
    void shouldSquareQuantityCalcTenSquares() {
        SQRService service = new SQRService();
        int excepted = 10;
        int actual = service.squareQuantityCalc(1, 370);
        assertEquals(excepted, actual);
    }

    @Test
    void shouldSquareQuantityCalcSeventyFourSquares() {
        SQRService service = new SQRService();
        int excepted = 74;
        int actual = service.squareQuantityCalc(1, 7000);
        assertEquals(excepted, actual);
    }
}