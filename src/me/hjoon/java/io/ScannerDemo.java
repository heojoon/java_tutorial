package me.hjoon.java.io;

import java.util.Scanner;	// java.util 이라는 패키지의 Scanner 라는 객체(클래스)를 가져온다.

public class ScannerDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
    }
}