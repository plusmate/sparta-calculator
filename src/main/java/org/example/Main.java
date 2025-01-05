package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int operand_1;
        int operand_2;
        String operator;

        while (true){
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                operand_1 = sc.nextInt();

                if (operand_1 < 0){
                    System.out.println("양수만 입력 가능합니다. 다시 입력하세요.");
                    continue;
                }

                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력받을 수 있습니다. 다시 입력하세요. ");
                sc.nextLine();
            }
        }

        System.out.print("사칙연산 기호를 입력하세요: ");
        operator = sc.nextLine();
        while (!operatorCheck(operator)) {
            System.out.print("'" + operator + "' 는 적절한 연산자가 아닙니다. +, -, *, / 중 하나를 입력하세요 : ");
            operator = sc.nextLine();
        }

        while (true){
            try {
                System.out.print("두 번째 숫자를 입력하세요: ");
                operand_2 = sc.nextInt();

                if (operand_2 < 0){
                    System.out.println("양수만 입력 가능합니다. 다시 입력하세요.");
                    continue;
                } else if (operand_2 == 0) {
                    System.out.println(" 0으로는 나눌 수 없습니다. 다시 입력하세요.");
                    continue;
                }

                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력받을 수 있습니다. 다시 입력하세요. ");
                sc.nextLine();
            }
        }

        if (operator.equals("+")) {
            result = operand_1 + operand_2;
        } else if (operator.equals("-")) {
            result = operand_1 - operand_2;
        } else if (operator.equals("*")) {
            result = operand_1 * operand_2;
        } else if (operator.equals("/")) {
            result = operand_1 / operand_2;
        }

        System.out.println("결과: " + result + " ( " + operand_1 + " " + operator + " " + operand_2 + " = " + result + " ) ");
    }

    private static boolean operatorCheck(String operator) {
        return operator.equals("+") ||
                operator.equals("-") ||
                operator.equals("*") ||
                operator.equals("/");
    }
}
