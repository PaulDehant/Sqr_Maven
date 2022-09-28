package ru.netology.sqr;

public class SqrService {

    public int calcSearchValue(int x, int y) {
        int result;
        int result_for_x = 1;
        int result_for_y = 1;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                result_for_x = result_for_x + 1;
                return result_for_x;
            }
            if (i * i <= y) {
                result_for_y = result_for_y + 1;
                return result_for_y;
            }
            result = result_for_x - result_for_y;
        }

}
}
