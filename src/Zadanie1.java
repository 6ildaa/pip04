import java.util.Scanner;


public class Zadanie1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        moveMove2(n);

    }

    public static int moveMove2(int x){
        if (x > 0){
            int i = 0;
            while(i <= x){
                System.out.println(i);
                i++;
            }
        } else {
            int i = 0;
            while(i >= x){
                System.out.println(i);
                i--;
            }
        }

        return x;
    }


    //Rozwiązanie z 2 pętlami
    public static int moveMove(int x){
        if (x > 0){
            for (int i = 0; i <= x; i++){
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= x; i--){
                System.out.println(i);
            }
        }


        return x;
    }


}




