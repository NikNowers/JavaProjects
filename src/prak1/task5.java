package prak1;
import java.lang.*;
import java.util.Scanner;
public class Task5 {
    public static int factorial(int numb){
        int sum=1;
        for(int i=1;i<=numb;i++)
        {
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        n = in.nextInt();
        System.out.print("Факториал числа: "+factorial(n));

    }
}
