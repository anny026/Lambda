package main;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1 вариант
        String text = "text8 4text 7 text text9 6 text 2";
        Pattern pattern9 = Pattern.compile("9");
        Matcher matcher9 = pattern9.matcher(text);
        Pattern pattern8 = Pattern.compile("8");
        Matcher matcher8 = pattern8.matcher(text);
        Pattern pattern7 = Pattern.compile("7");
        Matcher matcher7 = pattern7.matcher(text);
        Pattern pattern6 = Pattern.compile("6");
        Matcher matcher6 = pattern6.matcher(text);
        Pattern pattern5 = Pattern.compile("5");
        Matcher matcher5 = pattern5.matcher(text);
        Pattern pattern4 = Pattern.compile("4");
        Matcher matcher4 = pattern4.matcher(text);
        Pattern pattern3 = Pattern.compile("3");
        Matcher matcher3 = pattern3.matcher(text);
        Pattern pattern2 = Pattern.compile("2");
        Matcher matcher2 = pattern2.matcher(text);
        Pattern pattern1 = Pattern.compile("1");
        Matcher matcher1 = pattern1.matcher(text);
        if (matcher9.find()) text = text.replace("9", "девять");
        else if (matcher8.find()) text = text.replace("8", "восемь");
        else if (matcher8.find()) text = text.replace("8", "восемь");
        else if (matcher7.find()) text = text.replace("7", "семь");
        else if (matcher6.find()) text = text.replace("6", "шесть");
        else if (matcher5.find()) text = text.replace("5", "пять");
        else if (matcher4.find()) text = text.replace("4", "четыре");
        else if (matcher3.find()) text = text.replace("3", "три");
        else if (matcher2.find()) text = text.replace("2", "два");
        else if (matcher1.find()) text = text.replace("1", "один");
        System.out.println(text);

        //2 вариант
        String text2 = "text8 4text 7 text text9 6 text 2";

        if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("9")))
            text2 = text2.replace("9", "девять");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("8")))
            text2 = text2.replace("8", "восемь");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("7")))
            text2 = text2.replace("7", "семь");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("6")))
            text2 = text2.replace("6", "шесть");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("5")))
            text2 = text2.replace("5", "пять");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("4")))
            text2 = text2.replace("4", "четыре");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("3")))
            text2 = text2.replace("3", "три");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("2")))
            text2 = text2.replace("2", "два");
        else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x->x.toString().equals("1")))
            text2 = text2.replace("1", "один");
        System.out.println(text2);




    }
}