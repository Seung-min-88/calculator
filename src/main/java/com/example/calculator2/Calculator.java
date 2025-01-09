package com.example.calculator2;

import java.util.ArrayList;

public class Calculator {
    // 결과 값 저장을 위한 배열 생성 및
    private ArrayList<String> record = new ArrayList<>();

    // 생성자 (위에서 이미 초기화를 해 기본생성자로 작성해도 이상없음 안적어도 실행은 됨)
    public Calculator() {
    }

    // 계산 기록을 반환
    public ArrayList<String> getRecord() {
        return new ArrayList<>(record);
    }

    // 계산 기록에서 맨 처음 기록을 삭제
    public void getRemoveRecord(int index) {
        if (index >= 0 && index < record.size()) {
            this.record.remove(index);
        }
        
    }

    // 계산 식
    public int calculate(int firstNum, char operator, int secondNum) {
        int result = 0;

        switch (operator) {
            case ('+'):
                result = firstNum + secondNum;
                break;
            case ('-'):
                result = firstNum - secondNum;
                break;
            case ('*'):
                result = firstNum * secondNum;
                break;
            case ('/'):
                if (secondNum == 0) {
                    System.out.println("나눗셈의 분모에는 0이 들어갈 수 없습니다. 다시입력해주세요");
                }
                result = firstNum / secondNum;
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다. 다시 입력해주세요.");

        }
        // 계산이 끝나면 출력
        System.out.println("계산 결과 =" + result);

        // 계산 결과를 배열에 추가
        String calculate = firstNum + " " + operator + " " + secondNum + "= " + result;
        record.add(calculate);
        return result;
    }
}