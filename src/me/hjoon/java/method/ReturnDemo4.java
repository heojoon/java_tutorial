package me.hjoon.java.method;

public class ReturnDemo4 {
	 
    public static String[] getMembers() {
        String[] members = { "������", "������", "���̶�" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        System.out.println(members[0]);
    }
 
}