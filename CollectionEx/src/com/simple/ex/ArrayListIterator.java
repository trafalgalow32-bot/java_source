package com.simple.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // list[0] = "우유";
        list.add("사과");
        list.add("우유");
        list.add("빵");
        list.add("사과");
        list.add("사과");
        list.add("사과");

//        System.out.println(" 현재 박스 상태"+list);
        // 반복자 iterator
        Iterator e = list.iterator();
        String eating;
        while (e.hasNext()) {
            eating = (String) e.next();
            System.out.println(" "+ eating);
        }
        System.out.println("\n-----------------------------");

        System.out.println(" 먹을 거 몇 개 :"+list.size());
        System.out.println(" 먹을 거 몇 개 :"+list.size());

        String bread = list.get(1);
        System.out.println(" 꺼낸 거 :"+bread);

        list.remove(1);
        System.out.println("현재 박스 상태 :"+list);

        list.add(1,"빵");
        System.out.println("현재 박스 상태 :"+list);

        list.set(1,"포도");
        System.out.println("현재 박스 상태 :"+list);

        // 사과가 있는지 확인
        boolean isApple = list.contains("사과");
        System.out.println("사과가 "+(isApple?"있다":"없다"));

        int count = Collections.frequency(list,"사과");
        System.out.println("사과의 수 : "+count);

        int countApples = 0;
        for (String item : list) {
            if(item.equals("사과")){
                countApples++;
            }
        }
        System.out.println("사과의 수 :"+countApples);
    }
}
