package ru.netology.sqr;

public class SqrService {

    public int calcSearchValue(int minRange, int maxRange) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {

            if ((i * i >= minRange) && (i * i <= maxRange)) {
                result++;
            }}
            return result++;

    }
}


