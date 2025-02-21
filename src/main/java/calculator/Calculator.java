package calculator;

import java.util.*;
import java.util.function.BiFunction;

public class Calculator {
    private List<Integer> numbers = new LinkedList<>();

    public void enter(int i){
        numbers.add(i);
        if (numbers.size() > 2){
            throw new IllegalStateException();
        }
    }

    public void add(){
        this.computeOp((a, b) -> a + b);
    }

    public void mul() {
        this.computeOp((a, b) -> a * b);
    }

    public void div() {
        if (numbers.get(1) == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        this.computeOp((a, b) -> a / b);
    }

    private void checkNumbers() {
        if (numbers.size() != 2){
            throw new IllegalStateException();
        }
    }

    private void computeOp(final BiFunction<Integer, Integer, Integer> op) {
        checkNumbers();
        numbers.set(0, op.apply(numbers.get(0), numbers.get(1)));
        numbers.remove(1);
    }

    public int getResult(){
        if (numbers.size() != 1){
            throw new IllegalStateException();
        }
        return numbers.get(0);
    }
}
