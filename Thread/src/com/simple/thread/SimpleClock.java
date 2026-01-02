package com.simple.thread;

import java.time.LocalTime;

public class SimpleClock {
    public static void main(String[] args) {

        while (true) {
            LocalTime now = LocalTime.now();
            System.out.println(now);
            // 1초 쉬었다가 출력해
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
