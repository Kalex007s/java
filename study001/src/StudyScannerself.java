import java.util.Scanner;

public class StudyScannerself {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("당신은 방금 시험을 마쳤습니다. 현재 당신의 기분이 좋다면 1, 기분이 좋지 않다면 2를 입력해주세요.");

    int  emotion = scanner.nextInt();

    if (emotion == 1) {
        System.out.println("그동안의 노력이 빛을 바랬군요, 축하드립니다.");
    } else if (emotion == 2) {
        System.out.println("아쉽지만 더 노력해야 할 것같아요. 다음번엔 좋은 결과가 있길 바래요.");
    } else
        System.out.println("당신은 지금 매우 우울하군요. 하지만 괜찮아요. 흔들리지 않고 피는 꽃이 어디있겠어요. 당신을 항상 응원합니다.");

    }

}

