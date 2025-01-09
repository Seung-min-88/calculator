package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;

        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;

        while (start) {
            System.out.println("숫자를 입력해주세요");
            firstNumber = sc.nextInt();

            System.out.println("연산자를 입력해주세요 [ + , - , * , / ]");
            String operator = sc.next();

            System.out.println("숫자를 입력해주세요");
            secondNumber = sc.nextInt();

            switch (operator) {
                case ("+"):
                    result = firstNumber + secondNumber;
                    break;
                case ("-"):
                    result = firstNumber - secondNumber;
                    break;
                case ("*"):
                    result = firstNumber * secondNumber;
                    break;
                case ("/"):
                    if (secondNumber == 0) {
                        System.out.println("나눗셈의 분모에는 0이 들어갈 수 없습니다.\n");
                        System.out.println("다시 입력해주세요");
                        continue;
                    }
                    result = firstNumber / secondNumber;
                    break;
            }
            double answer = result;
            System.out.println("결과는 : " + answer);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String outText = sc.next();

            if (outText.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }
        }
    }
}
