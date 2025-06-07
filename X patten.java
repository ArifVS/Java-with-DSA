// X Pattern using nested loops in Java
// For example, input: 5
// Output:
// *   *
//  * *
//   *
//  * *
// *   *

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input size of the pattern

        for (int i = 0; i < n; i++) {  // Rows
            for (int j = 0; j < n; j++) {  // Columns
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // New line after each row
        }
    }
}
