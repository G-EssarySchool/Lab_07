import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Example 1:");
        for(int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nExample 2:");
        for(int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nExample 3:");
        for(int i = 0; i <= 18; i++) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\nExample 4:");
        for(int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
            i += -1;
        }
    }
}