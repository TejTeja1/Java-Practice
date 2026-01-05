import java.util.Scanner;

class OddEvenCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number kudi : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
