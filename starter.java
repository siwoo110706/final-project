import java.util.Random;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("곱셈 게임을 시작합니다. 틀릴 때까지 문제가 나옵니다.");

        while (true) {
            int num1 = random.nextInt(10) + 1; // 1부터 10까지의 숫자
            int num2 = random.nextInt(10) + 1; // 1부터 10까지의 숫자

            System.out.printf("%d * %d = ?\n", num1, num2);
            int answer = scanner.nextInt();

            if (answer == num1 * num2) {
                System.out.println("정답입니다!");
            } else {
                System.out.printf("틀렸습니다. 정답은 %d입니다.\n", num1 * num2);
                break;
            }
        }

        System.out.println("게임이 종료되었습니다.");
        scanner.close();
    }
}

