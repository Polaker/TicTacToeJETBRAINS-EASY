import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            int y = scanner.nextInt();
            array[i] = y;
        }
        int n = scanner.nextInt();
        for (int z : array) {
            if (z > n) {
                sum += z;
            }
        }
        System.out.println(sum);
    }
}