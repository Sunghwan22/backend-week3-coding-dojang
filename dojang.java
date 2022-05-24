import java.util.Scanner;

public class dojang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");

        int num = scanner.nextInt();

        if(num < 2) {
            System.out.println("소수 아님");

        }

        for(int i = 2; i < num; i+=1) {
            if (num % i == 0) {
                System.out.println("소수 아님");
                break;
            }
            System.out.println("소수");
        }
    }
}

