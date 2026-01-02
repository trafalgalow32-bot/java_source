package com.simple.thread;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DualClock {
    public static void main(String[] args) {
        // 한국시간 시계 쓰레드
        Thread koreaClock = new Thread(()->{
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("HH:mm:ss");
            while (true) {
                LocalDateTime nowKorea = LocalDatetime.now(
                        ZoneId.of("Asia/Seoul"));
                System.out.println("[한국시간]"+nowKorea.format(formatter));

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


    }
}
