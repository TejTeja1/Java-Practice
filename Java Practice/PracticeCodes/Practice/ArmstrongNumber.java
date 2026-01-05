import java.util.Scanner;

class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;

        // Step 1: Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        // Step 2: Calculate Armstrong sum
        while (temp != 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        // Step 3: Compare
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}
