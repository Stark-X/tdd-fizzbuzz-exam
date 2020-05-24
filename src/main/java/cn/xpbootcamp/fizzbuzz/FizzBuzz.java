package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String countOff() {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
