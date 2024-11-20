package fr.mathilde;

import java.util.Random;

public class Main {
    // ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String[] COLORS = {
            "\u001B[31m", // Red
            "\u001B[32m", // Green
            "\u001B[33m", // Yellow
            "\u001B[34m", // Blue
            "\u001B[35m", // Magenta
            "\u001B[36m"  // Cyan
    };

    // Check if args is only integer and if it is positive
    public static boolean checkArgs(String[] args) {
        try {
            int size = Integer.parseInt(args[0]);
            return size > 1;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        if(args.length == 0 || !checkArgs(args)) {
            System.out.println("Please provide a size for the tree\n");
            System.out.println("java -jar EpiTree.jar [size >> 1]\n");
            return;
        }
        printTree(Integer.parseInt(args[0]));
    }

    private static void printTree(int size) {
        Random rand = new Random();
        System.out.println("Tree of size " + size);

        for (int i = 0; i < size; i++) {
            int spaces = size - i - 1;
            int stars = 2 * i + 1;

            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            for (int j = 0; j < stars; j++)
                if (rand.nextInt(3) == 0) {
                    String color = COLORS[rand.nextInt(COLORS.length)];
                    System.out.print(color + "*" + RESET);
                } else
                    System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < size - 1; i++)
            System.out.print(" ");
        System.out.print("*");
    }
}