package org.example.lv1;

import org.example.lv2.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num1;
        int num2;
        String operator;
        String exitCalc = "";

        do {
            while (true) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = sc.nextInt();

                    if (num1 < 0) {
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

            while (true) {
                try {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = sc.nextInt();

                    if (num2 < 0) {
                        System.out.println("양수만 입력 가능합니다. 다시 입력하세요.");
                        continue;
                    } else if (num2 == 0) {
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
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }

            System.out.println("결과: " + result +
                    " ( " + num1 + " " + operator + " " + num2 + " = " + result + " ) ");

            System.out.println("더 계산 시 아무거나 입력하세요. (exit 입력 시 종료 ) ");
            exitCalc = sc.nextLine();
        } while (!exitCalc.equals("exit"));
    }

    private static boolean operatorCheck(String operator) {
        return operator.equals("+") ||
                operator.equals("-") ||
                operator.equals("*") ||
                operator.equals("/");
    }
}
