package racingcar.ui;

public class Output {
    private static final String RECEIVE_CAR_NAMES_MSG = "경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";
    private static final String RECEIVE_COUNT_MSG = "시도할 횟수";

    public static void printReceiveCarNames() {System.out.print(RECEIVE_CAR_NAMES_MSG);}
    public static void printReceiveCount() {System.out.print(RECEIVE_COUNT_MSG);}

    public static void printError(String e) {System.out.print(e);}
    public static void printResult(String result) {System.out.print(result);}
}
