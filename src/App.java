import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scan.nextInt();
        // int fact = factorial(n);
        // System.out.println("Факториал числа " + n + " равен " + fact);

        // printEvenNums();

        int summ = sumDigits(n);
        System.out.println("Сумма цифр числа " + n + " равна " + summ);

    }

    public static int factorial(int n) {

        int result = 1 ;
        if(n < 0) result = -1;
        else if (n > 1){
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
        }

        return(result);
    }

    public static void printEvenNums() {

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

    }

    public static int sumDigits(int n) {
        
        int result = 0;
        while(n != 0) {
            result += n % 10;
            n /= 10;
        }

        return(result);
    }
}
