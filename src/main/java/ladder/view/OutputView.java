package ladder.view;

import ladder.domain.ladder.Ladder;
import ladder.view.util.OutputViewHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutputView {
    private static final String PRINT_GAME_RESULT = "\n실행 결과";

    private OutputView() {
    }

    public static void printGameResultsAll(HashMap<String, String> gameResults) {
        println(PRINT_GAME_RESULT);
        for (Map.Entry<String, String> entrySet : gameResults.entrySet()) {
            println(entrySet.getKey() + " : " + entrySet.getValue());
        }
    }

    public static void printGameResultsUnique(HashMap<String, String> gameResults, String name) {
        println(PRINT_GAME_RESULT);
        println(gameResults.get(name));
    }

    public static void printLadderResultMessage() {
        System.out.println("\n사다리 결과\n");
    }

    public static void printInputString(List<String> inputString) {
        println(OutputViewHelper.parseDisplayInputStrings(inputString));
    }

    public static void printLadder(Ladder ladder, int firstNameLength) {
        println(OutputViewHelper.parseLadder(ladder, firstNameLength));
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
