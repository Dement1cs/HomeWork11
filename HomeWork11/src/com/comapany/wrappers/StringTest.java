package com.comapany.wrappers;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        String str = "Здрасте ";
        String str2 = new String();
        char data[] = {'a', 'b', 'c' };
        String str3 = new String(data);
        String str4 = "abc";
        String str5 = new String(str4.getBytes());
        StringBuilder builder = new StringBuilder("abc");
        String str6 = builder.toString();

        String fruit = "Апельсин,Яблоко,Гранат,Груша";
        String[] arr = fruit.split(",");

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                fruit = arr[i];
            }
        }
        System.out.println(fruit.substring(0, 3));

        String str7 = "   Я_новая_строка      ";
        str7 = str7.trim();
        str7 = str7.replace('_', ' ');
        System.out.println(str7);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str8 = scan.nextLine();

        if (str8 == "Запуск") {
            System.out.println("Запускаем процесс ");
        } else if (str8 == "Завершен") {
            System.out.println("Процесс звавершен ");
        } else if (str8 == "Ошибка") {
            System.out.println("Произошла ошибка ");
        } else {
            System.out.println("Вы ввели " + str8);
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
