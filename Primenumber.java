//숫자를 입력받는다
// 소수는 1과 자신만을 약수로 가진 숫자 1은 소수가 아니다
// 1은 소수가 아니기 떄문에 boolean변수를 사용해 1보다 number가 큰 경우만 처리과정을 거치게 함
// 소수는 자기보다 작은 숫자를 나눴을때 나머지가 0 나누어 떨어지면 소수가 아니다.
// i를 1씩증가시켜서 number보다 작은 숫자로 계속해서 나눠주고 number / i 나눴을때  나오지 않는 수가 있다면 소수가 아님
// number % i == 0 isprime은 false
//그외 숫자들은 모든 숫자는 소수이기 때문에 따로 소수를 걸러내는 처리를  할 필요가 없음.


import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int number = scanner.nextInt();

        boolean isprime = 1 < number;
        for (int i = 2; i < number; i += 1) {
            if (number % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println("소수 ");
        }
        if (!isprime) {
            System.out.println("소수 아님 ");

        }
    }
}


