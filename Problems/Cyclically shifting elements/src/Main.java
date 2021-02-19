import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        a[0] = 0;
        for (int i = 1; i <= size; i++) {
            int number = scanner.nextInt();
            if (i == size) {
                a[0] = number;
            }
            else {
                a[i] = number;
            }
        }
        for(int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}