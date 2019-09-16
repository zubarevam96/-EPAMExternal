package com.zubarevam.option4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class CheckBracketCorrectnessWithStack implements ICheckBracketCorrectnessWithStack {

    @Override
    public Boolean execute(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        try {
            for (Character symbol : s.toCharArray()) {
                if (symbol == '[' || symbol == '{' || symbol == '(')
                    stack.push(symbol);
                else if (!isCorrect(stack.pop(), symbol)) {
                    return false;
                }
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        return stack.isEmpty();
    }
    // проверяет правильную расстановку двух скобок
    private Boolean isCorrect(Character cLeft, Character cRight) {
        if (cLeft == '(' && cRight == ')') return true;
        else if (cLeft == '{' && cRight == '}') return true;
        else return cLeft == '[' && cRight == ']';
    }
}
