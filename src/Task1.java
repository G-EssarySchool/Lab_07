import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentGrade;
        boolean notDone = true;
        int highestGrade = -1;

        System.out.println("Please enter a number [0 - 100] [-1 to stop]:");
        
        while (notDone) {
            currentGrade = scan.nextInt();
            if (currentGrade >= 0 && currentGrade <= 100) {
                if (currentGrade < highestGrade);
                highestGrade = currentGrade;
            }
            else if (currentGrade == -1){
                notDone = false;
            }
            else {
                System.out.println("Invalid test grade.");
            }
        }
        System.out.println("Your highest test score was : " + highestGrade);
    }
}