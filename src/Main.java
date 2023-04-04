import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("cat", "dog", "dog", "cat", "spider", "samara", "spider", "samson", "sven", "dog"));
        Arifmetic arifmetic = new Arifmetic();
        Words wordsPrint = new Words();
        System.out.println(nums);
        System.out.println("arifmetic.NotEven(nums) = " + arifmetic.notEven(nums));
        System.out.println("arifmetic.even(nums) = " + arifmetic.even(nums));
        nums = new ArrayList<>(arifmetic.even(nums));
        System.out.println("nums = " + nums);
        System.out.println("wordsPrint.uniqueWords(words) = " + wordsPrint.uniqueWords(words));
        System.out.println("wordsPrint.duplicateWord(words) = " + wordsPrint.duplicateWord(words));

    }
}