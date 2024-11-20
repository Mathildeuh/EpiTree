package fr.mathilde;

public class Main {

    // Tree of size 6
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    //***********
    //     *

    // Check if args is only integer and if it is positive
    public static boolean checkArgs(String[] args) {
        try {
            int size = Integer.parseInt(args[0]);
            return size > 0;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        if(args.length == 0 && !checkArgs(args)) {
            System.out.println("Please provide a size for the tree\n");
            System.out.println("java -jar EpiTree.jar [size]\n");
            return;
        }
        printTree(Integer.parseInt(args[0]));
    }

    private static void printTree(int size) {
        System.out.println("Tree of size " + size);
        for (int i = 0; i < size; i++) {
            int spaces = size - i - 1;
            int stars = 2 * i + 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}