package javacode;

public class DummyClass {
    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm not on vacation";
    }

    public void printsAnArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number is: " + numbers[i]);
        }
    }

    public void printsCharArray(char[] characters) {
        for (int i = 0; i < characters.length; i++) {
            System.out.println("character is: " + characters[i]);
        }
    }
}