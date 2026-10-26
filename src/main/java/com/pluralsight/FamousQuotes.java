package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static String[] quotes = {
            "\"Be yourself; everyone else is already taken.\"",
            "\"I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.\"",
            "\"So many books, so little time.\"",
            "\"Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.\"",
            "\"A room without books is like a body without a soul.\"",
            "\"Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.\"",
            "\"You've gotta dance like there's nobody watching,\n" +
                    "Love like you'll never be hurt,\n" +
                    "Sing like there's nobody listening,\n" +
                    "And live like it's heaven on earth.\"",
            "\"You know you're in love when you can't fall asleep because reality is finally better than your dreams.\"",
            "\"You only live once, but if you do it right, once is enough.\"",
            "\"Be the change that you wish to see in the world.\"",};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in;

        do {
            System.out.print("Please enter a number between 1 and 10 (exit, random): ");
            in = scanner.nextLine();

            if(in.equals("exit")) {
                break;
            } else if (in.equals("random")) {
                System.out.println(quotes[(int) (Math.random() * quotes.length)]);
            } else {
                try {
                    int num = Integer.parseInt(in);
                    System.out.println(quotes[num - 1]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!in.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
