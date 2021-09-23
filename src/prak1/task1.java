package prak1;
import java.lang.*;
public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int b = 0;
        int j =0;
        int l=0;
        a[0] = 3;
        a[1] = 1;
        a[2] = 8;
        a[3] = 2;
        a[4] = 9;
        for (int i = 0; i < 5; i++) {
            b += a[i];
        }
        System.out.println(b);
        b=0;
        while(j<5){
            b+=a[j];
            j++;
        }
        System.out.println(b);
        b=0;
        do{
            b+=a[l];
            l++;
        }while(l!=5);
        System.out.println(b);
    }
}
