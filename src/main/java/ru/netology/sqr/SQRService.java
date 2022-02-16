package ru.netology.sqr;

public class SQRService {
    public int squareQuantyCalc(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            for (int j = min; j <= max; j++) {
                if (i * i == j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
