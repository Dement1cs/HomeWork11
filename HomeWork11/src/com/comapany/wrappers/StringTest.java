package com.comapany.wrappers;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        String str = "������� ";
        String str2 = new String();
        char data[] = {'a', 'b', 'c' };
        String str3 = new String(data);
        String str4 = "abc";
        String str5 = new String(str4.getBytes());
        StringBuilder builder = new StringBuilder("abc");
        String str6 = builder.toString();

        String fruit = "��������,������,������,�����";
        String[] arr = fruit.split(",");

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                fruit = arr[i];
            }
        }
        System.out.println(fruit.substring(0, 3));

        String str7 = "   �_�����_������      ";
        str7 = str7.trim();
        str7 = str7.replace('_', ' ');
        System.out.println(str7);

        Scanner scan = new Scanner(System.in);
        System.out.println("������� �����: ");
        String str8 = scan.nextLine();

        if (str8 == "������") {
            System.out.println("��������� ������� ");
        } else if (str8 == "��������") {
            System.out.println("������� ��������� ");
        } else if (str8 == "������") {
            System.out.println("��������� ������ ");
        } else {
            System.out.println("�� ����� " + str8);
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str)
                .append(str2)
                .append(str3)
                .append("\n")
                .append(str4)
                .append(str5)
                .append(str6)
                .append("\n").reverse();
        System.out.println(stringBuilder);
    }
}
