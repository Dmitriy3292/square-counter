package ru.netology.sqr;

public class sqrService {
    public int squareСounter(int down, int up) {

        int counter = 0;
        for (int i = 10; i <= 99 ; i++) {
            if (i * i >= down && i * i <= up) {
                counter = counter + 1;

            }


        }
return counter;

    }

}