import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean correct = false;

        while(!correct) {
            System.out.println("Enter the number : ");            try {
                int num1 = 40;
                int number = scanner.nextInt();
                if (num1 > number) {
                    System.out.println(" Wrong! Try again, go higher than  " + number);
                } else if (num1 < number) {
                    System.out.println(" wrong ! try aging to low " + number);
                } else {
                    System.out.println(" congratulations! your win game ");
                    correct = true;
                }
            } catch (Exception e) {
                System.out.println("your number is invalid");
                scanner.nextLine();
            }
        }
    }
}

