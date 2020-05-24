package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String countOff() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isDivisibleBy(3)) {
            stringBuilder.append("Fizz");
        }

        if (isDivisibleBy(5)) {
            stringBuilder.append("Buzz");
        }

        if (isDivisibleBy(7)) {
            stringBuilder.append("Whizz");
        }

        if (stringBuilder.length() != 0) {
            return String.valueOf(stringBuilder);
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int divisor) {
        return number % divisor == 0;
    }
}
