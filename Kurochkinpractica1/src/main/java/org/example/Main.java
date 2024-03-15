package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Курочкин Дмитрий Андреевич РИБО-05-22 Вариант 3");
        System.out.println("Выбери врача: первый или второй");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Vrach vrach = null;
        if (num == 1) {
            vrach = new vrach1();
        } else if (num == 2) {
            vrach = new vrach2();
        }
        System.out.println("Введите текст рецепта:");
        scanner.nextLine();
        String text = scanner.nextLine();
        vrach.writeRecipe(text);
    }
}