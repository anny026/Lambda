package main.java;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberInString("два Один два дватри два три", "два"));
        System.out.println(numberInString("Один два дватри два три", "два"));
    }

    public static int numberInString(String string1, String string2) {
        int number = 0;
        int index = 0;
        while ((index != -1) & index <= string1.length()) {
            if (string1.indexOf(string2, index) == -1) {
                break;
            } else {
                index = string1.indexOf(string2, index) + 1;
                number = number + 1;
            }
        }
        return number;
    }
}