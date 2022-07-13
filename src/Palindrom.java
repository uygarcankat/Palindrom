import java.util.Scanner;

public class Palindrom {

    static boolean palindrom (int n){

        int last_number;
        int revers_number=0;
         int temp = n;

        while(temp!=0) {

            last_number = temp % 10;

            revers_number = (revers_number * 10) + last_number;

            temp /= 10;

        }

      if (revers_number==n){

          return true;
      }

      else{
          return false;

      }

    }

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        int n = input.nextInt();

        System.out.println( palindrom(n));



    }
}
