import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("1 Найти факториал числа \n2 Вывести все чётные числа от 0 до 100 \n3 Найти сумму цифр числа \n4 Найти большее из трёх чисел \nВыберите номер задачи или введите 0 для выхода: ");
            int act = scan.nextInt();

            if(act == 1) {
                System.out.print("Введите число: ");
                int n = scan.nextInt();
                int fact = factorial(n);
                System.out.println("Факториал числа " + n + " равен " + fact);
            }

            if(act == 2) printEvenNums();

            if(act == 3) {
                System.out.print("Введите число: ");
                int n = scan.nextInt();
                int summ = sumDigits(n);
                System.out.println("Сумма цифр числа " + n + " равна " + summ);
            }

            if(act == 4) {
                System.out.print("Введите первое число: ");
                int а = scan.nextInt();
                System.out.print("Введите второе число: ");
                int b = scan.nextInt();
                System.out.print("Введите третье число: ");
                int c = scan.nextInt();
                System.out.println("Большим является число " + findMaxOfThree(а, b, c));
            }
            
            if(act == 0) System.exit(0);
        }

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

    public static int findMaxOfTwo (int a, int b) {

        if (a >= b) return(a);
        else return(b);

    }

    public static int findMaxOfThree(int a, int b, int c) {
        return(findMaxOfTwo(a, findMaxOfTwo(c, b)));
    }
}
