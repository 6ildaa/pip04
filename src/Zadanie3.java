import java.util.Scanner;


public class Zadanie3 {
    public static void main(String [] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        getWzor(n);
        System.out.println();
        getWzor2(n);

    }

    public static void getWzor(int n){
        if( n % 2 == 0){
            n--;
        }
        for(int i = 1; i <= n; i++){
            String star = String.valueOf(i);
            star = "*";
            System.out.println(star.repeat(i));

            }
        }


    // Zadanie dodatkowe

    public static void wzor (int n, char gwiazdka)
    {
        for (int i=0; i<n; i++)
            System.out.print(gwiazdka);
    }
    public static void getWzor2 (int n)
    {
        for (int i=0; i<n-2; i++)
        {
            wzor(n - i - 1,' ');
            wzor(2*i+1,'*');
            System.out.println();
        }
    }

        }







    





