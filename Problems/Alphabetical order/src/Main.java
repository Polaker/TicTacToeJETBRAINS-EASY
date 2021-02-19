import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(" ");
        int length = string.length;
        boolean compare = true;


        for (int i = 0; i < length-1; i++) {
            if (string[i].compareTo(string[i + 1]) > 0 || string[i].length() <= string[i+1].length()) {
                compare = true;
            } if (string[i].compareTo(string[i + 1]) < 0 || string[i].length() <= string[i+1].length()) {
                compare = true;
            } if (string[i].compareTo(string[i + 1]) == 0 || string[i].length() <= string[i+1].length()) {
                compare = true;
            } else {
                compare = false;
            }
        } System.out.print(compare);

    }
}