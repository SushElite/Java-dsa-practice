package functions;
import java.util.Scanner;
public class PrimeOrNot {

    static boolean CheckPrime(int num){
        if(num <=1){
            return false;
        }

        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = CheckPrime(number);

        if(isPrime){
            System.out.println("Prime Number");
            return;
        }
        System.out.println("Not Prime Number");
    }
}
