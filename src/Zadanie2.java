import java.util.Scanner;


public class Zadanie2 {
    public static void main(String [] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

       getFibonacci(n);

    }
    public static void getFibonacci(int x){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;


        System.out.print(n1+" "+n2);

        for(int i = 2; i < x; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        }



    }



    





