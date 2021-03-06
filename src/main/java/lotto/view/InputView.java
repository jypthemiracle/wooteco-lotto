package lotto.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int inputPrice() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String inputWinningNumber() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        return SCANNER.nextLine();
    }


    public static int inputSelfCount() {
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        return Integer.parseInt(SCANNER.nextLine());
    }


    public static List<String> inputSelfLottos(int countOfSelf) {
        List<String> selfLottos = new ArrayList<>();
        System.out.println("수동으로 구매할 번호를 입력해 주세요.");
        for (int i = 0; i < countOfSelf; i++) {
            selfLottos.add(SCANNER.nextLine());
        }
        return selfLottos;
    }

    public static int inputBonusBall() {
        System.out.println("보너스볼을 입력해 주세요.");
        return Integer.parseInt(SCANNER.nextLine());
    }
}
