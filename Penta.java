import java.util.Scanner;

public class Penta {
    public static void main(String[] args) {
        //준비

        Scanner scanner = new Scanner(System.in);
        String result = "";

        //입력
        System.out.print("Input: ");
        int accumulator = scanner.nextInt();

        //처리
        //처음나오는 나머지가 나중에 나와야 해서 result를 문자열로 바꿔줌
        // accumlator = 137 이면 처음 5로 나눴을때 나머지가 문자열 "2"로나옴
        while (accumulator > 0) {
            result = accumulator % 5 + result; //137이 들어가면 문자열 "2""2" .....
            accumulator /= 5;
        }
        // 문자열을 다시 정수향으로 바꿔줌
        System.out.print("5진수: ");
        System.out.println(Integer.parseInt(result));
    }
}
