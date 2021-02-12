package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите оператор: ");
        var opr = scanner.nextLine();
        while (!opr.equals("+") && !opr.equals("-") && !opr.equals("*") && !opr.equals("/") && !opr.equals("mod") &&
                !opr.equals("div") && !opr.equals("^")) {
            System.out.print("Введен недопустимый оператор, \nвведите допустимый (+, -, *, /, div, mod, ^): ");
            opr = scanner.nextLine();
        }
        System.out.print("Введите первое число: ");
        var var1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        var var2 = scanner.nextDouble();


        switch (opr) {
            case "+":
                System.out.println(var1 + " + " + var2 + " = " + (var1 + var2));
                break;
            case "-":
                System.out.println(var1 + " - " + var2 + " = " + (var1 - var2));
                break;
            case "*":
                System.out.println(var1 + " * " + var2 + " = " + (var1 * var2));
                break;
            case "/":
                if (var2 != 0) System.out.println(var1 + " / " + var2 + " = " + (var1 / var2));
                else System.out.println("Ошибка деления на 0!");
                break;
            case "mod":
                if (var2 != 0) System.out.println(var1 + " mod " + var2 + " = " + (var1 % var2));
                else System.out.println("Ошибка деления на 0!");
                break;
            case "div":
                if (var2 != 0) {
                    System.out.println(var1 + " div " + var2 + " = " + (int) (var1/var2));
                }
                else System.out.println("Ошибка деления на 0!");
                break;
            case "^":
                var result = var1;
                for (int i = 1; i < var2; i++) result *= var1;
                System.out.println(var1 + " ^" + (int) var2 + " = " + result);
                break;
        }

    }
}
