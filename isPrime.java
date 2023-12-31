import java.util.Scanner;

class Solution{
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int number = scan.nextInt();
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int number){
        if(number == 0 || number == 1) return false;
        for(int i = 2; i < number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
