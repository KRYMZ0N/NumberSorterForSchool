import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        ArrayList<Integer> input = new ArrayList<>();
        int i = 1;
        while (i > 0) {
            if (userInput.equalsIgnoreCase("done")) {
                Collections.sort(input);
                System.out.println("Here ya go " + input);
                System.out.println("n = " + input.size());
                i = 0;
            } else {
                input.add(Integer.valueOf(userInput));
                System.out.println(input);
                userInput = scan.nextLine();
            }
        }
    }
}
