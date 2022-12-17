public class Zadanie4 {
    public static void main(String [] args) {


        int x = 5;
        int y = 3;
        int z = 8;
        method(x, y, z);
    }

    public static void method(int x, int y, int z){
        int max = Math.max(x, y);
        max = Math.max(max, z);

        for(int i = 0; i < max; i++){
            if(x >= max - i)
                System.out.print("*");
            else
                System.out.print(" ");
            if(y >= max - i)
                System.out.print("*");
            else
                System.out.print(" ");
            if(z >= max - i)
                System.out.print("*");
            else
                System.out.print(" ");
            System.out.println();
        }
    }



}