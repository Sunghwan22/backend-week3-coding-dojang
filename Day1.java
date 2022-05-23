import java.util.Scanner;

public class Day1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int number = scanner.nextInt();

        String answer = "";
        while(number > 0) {
            answer = (number % 5) + answer;
           number /= 5;
        }
        System.out.println("5 진수: "+answer);

    }
}