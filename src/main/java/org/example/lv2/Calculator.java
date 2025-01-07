package org.example.lv2;

import java.util.LinkedList;

public class Calculator {
    LinkedList<Integer> resultList = new LinkedList<>();
    int result = 0;

    public int calculate(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            result = num1 + num2;
            resultList.add(result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            resultList.add(result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            resultList.add(result);
        } else if (operator.equals("/")) {
            result = num1 / num2;
            resultList.add(result);
        }

        return result;
    }

    public void removeResult() {
        if (!resultList.isEmpty()) {
            Integer removeNum = resultList.remove();
            System.out.println("기록이 삭제되었습니다.");
        } else {
            System.out.println("계산 기록이 없습니다.");
        }
    }

    /**
     * GETTER / SETTER
     */
    public void setResultList(LinkedList<Integer> resultList) {
        this.resultList = resultList;
    }

    public LinkedList<Integer> getResultList() {
        return resultList;
    }
}
