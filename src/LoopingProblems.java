public class LoopingProblems {
    public static void main(String[] args) {
        // PART A

        // Problem 1
        System.out.println("Problem 1:"); // Output that this is problem 1
        for(int i = 0; i < 31; i++) { // Loop: Create a variable i and initialize it to 0, make the stopping point 30 with i < 31, and then use i++ to repeatedly increase i by 1
            System.out.println(i); // Output i (this will be repeated as there is a loop)
        }

        // Problem 2
        System.out.println("\nProblem 2:"); // Output that this is problem 2
        for(int i = 30; i >= 0; i--) { // Loop: Create a variable i and initialize it to 30, make the stopping point 0 with i >= 0, and then use i-- to repeatedly decrease i by 1
            System.out.println(i); // Output i (this will be repeated as there is a loop)
        }

        // Problem 3
        System.out.println("\nProblem 3:"); // Output that this is problem 3
        for(int i = 0; i < 19; i += 3) { // Loop: Create a variable i and initialize it to 0, make the stopping point 18 with i < 19, and then use i += 3 to repeatedly increase i by 3
            System.out.println(i); // Output i (this will be repeated as there is a loop)
        }

        // Problem 4
        System.out.println("\nProblem 4:"); // Output that this is problem 4
        for(int i = 10; i >= 0; i -=2 ) { // Loop: Create a variable i and initialize it to 10, make the stopping point 0 with i >= 0, and then use i -= 2 to repeatedly decrease i by 2
            System.out.println(i); // Output i (this will be repeated as there is a loop)
        }

        // PART B

        // Problem 5
        System.out.println("\nProblem 5:"); // Output that this is problem 5
        for(int i = 1; i < 6; i++) { // Loop: Create a variable i and initialize it to 1, make the stopping point 5 with i < 6 (this will be for the rows), and use i++ to repeatedly increase i by 1
            for(int j = 1; j <= i; j++) { // Loop: Create a variable j and initialize it to 1, make the stopping point j <= i (this is so the loop outputs the same number of stars as the row number and the last number of stars printed will be 5), and use j++ to repeatedly increase j by 1
                System.out.print("*"); // Output a star (with two loops this creates a pattern of increasing stars)
            }
            System.out.println(); // Print a new line after a row of stars are printed
        }

        // Problem 6
        System.out.println("\nProblem 6:"); // Output that this is problem 6
        for(int i = 1; i < 6; i++) { // Loop: Create a variable i and initialize it to 1, make the stopping point 5 with i < 6 (this will be for the rows), and use i++ to repeatedly increase i by 1
            for(int j = 5; j >= i; j--) { // Loop: Create a variable j and initialize it to 5, make the stopping point j >= i (this is so the last number of stars printed will be 1), and use j-- to repeatedly decrease j by 1
                System.out.print("*"); // Output a star (with two loops this creates a pattern of decreasing stars)
            }
            System.out.println(); // Print a new line after a row of stars are printed
        }

        // Problem 7
        System.out.println("\nProblem 7:"); // Output that this is problem 7
        for(int i = 1; i < 6; i++) { // Loop: Create a variable i and initialize it to 1, make the stopping point 5 with i < 6 (this will be for the rows), and use i++ to repeatedly increase i by 1
            for(int j = 1; j < 6; j++) { // Loop: Create a variable j and initialize it to 1, make the stopping point j < 6 (this is so the number of stars printed on each line will be 5), and use j++ to repeatedly increase j by 1
                System.out.print("*"); // Output a star (with two loops this creates a pattern of 5 stars each line)
            }
            System.out.println(); // Print a new line after a row of stars are printed
        }
    }
}
