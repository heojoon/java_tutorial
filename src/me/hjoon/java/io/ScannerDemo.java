package me.hjoon.java.io;

import java.util.Scanner;	// java.util �̶�� ��Ű���� Scanner ��� ��ü(Ŭ����)�� �����´�.

public class ScannerDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
    }
}