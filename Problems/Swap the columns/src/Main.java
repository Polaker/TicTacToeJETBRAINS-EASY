import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int twoDimArray[][] = new int[i][j];

        for (int i1 = 0; i1 < i; i1++) {
            for (int j1 = 0; j1 < j; j1++) {
                int x = scanner.nextInt();
                twoDimArray[i1][j1] = x;
            }
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i2 = 0; i2 < i; i2++) {
            for (int j2 = 0; j2 < j; j2++) {
                if (j2 == a) {
                    int temp = twoDimArray[i2][j2];
                    twoDimArray[i2][j2] = twoDimArray[i2][b];
                    twoDimArray[i2][b] = temp;
                }
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            for (int j3 = 0; j3 < j; j3++) {
                System.out.print(twoDimArray[i3][j3]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
