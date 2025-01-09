package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 객체 생성
        Calculator calculator = new Calculator();

        boolean start = true;

        // 반목문 시작
        while (start) {
            System.out.println("숫자를 입력해주세요");
            int fristNum = sc.nextInt();

            System.out.println("연산자를 입력해주세요 [ + , - , * , / ]");
            char operator = sc.next().charAt(0);

            System.out.println("숫자를 입력해주세요");
            int secondNum = sc.nextInt();

            // 계산 시작
            // 나눗셈 분모에 0이 들거가거나 연산자를 잘못입력하면 처음으로 이동
            try {
                // 계산 종료 후 추가 계산이나 기록, 삭제
                System.out.println("더 계산하시겠습니까? (yes 입력 시 추가 계산,exit 입력 시 종료, record 입력 시 계산기록 출력, remove 입력 시 계산기록 삭제)");
                String outText = sc.next();

                if (outText.equals("exit")) {
                    System.out.println("계산을 종료합니다.");
                    break;
                } else if (outText.equals("record")) {
                    System.out.println("저장된 계산 기록:");
                    for (String record : calculator.getRecord()) {
                        System.out.println(record);
                    }
                    // 맨 처음 계산기록을 삭제
                } else if (outText.equals("remove")) {
                    calculator.removeRecord(0);
                    System.out.println("기록 삭제 후:");
                    for (String record : calculator.getRecord()) {
                        System.out.println(record);
                    }
                } else if (outText.equals("yes")) {
                    continue;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}