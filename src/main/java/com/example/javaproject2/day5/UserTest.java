package com.example.javaproject2.day5;


public class UserTest {
    public static void main(String[] args) {

        User hanbin = new User();
        hanbin.name = "최ㅇㅇ";
        hanbin.phoneNumber = "010-1234-0000";
        hanbin.age = 13;

        User mirang = new User();
        mirang.name = "최ㅁㅁ";
        mirang.phoneNumber = "010-0000-1234";
        mirang.age = 12;

        System.out.printf("이름은 %s %s %d 성인인가? %s\n",hanbin.name,hanbin.phoneNumber,hanbin.age,hanbin.isAdult());
        System.out.printf("이름은 %s %s %d 성인인가? %s",mirang.name,mirang.phoneNumber,mirang.age,mirang.isAdult());
    }

}
