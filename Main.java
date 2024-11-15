import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integers separated by spaces: ");
        String[] intInput = scanner.nextLine().split(" ");
        List<Integer> integers = new ArrayList<>();
        for (String num : intInput) {
            integers.add(Integer.parseInt(num));
        }
        IntegerSorter.sortIntegers(integers);

        System.out.print("Enter strings separated by spaces: ");
        String[] strInput = scanner.nextLine().split(" ");
        List<String> strings = new ArrayList<>();
        for (String str : strInput) {
            strings.add(str);
        }
        StringSorter.sortStrings(strings);
    }
}
