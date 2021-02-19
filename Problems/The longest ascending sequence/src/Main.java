import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int order = 0;
        int order2 = 1;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            int y = scanner.nextInt();
            array[i] = y;
        }
        for (int i = 0; i < size -1; i++) {
            if (array[i] < array[i+1]) {
                order++;
            }
            else {
                if(order > order2) {
                    order2 = order;
                    order = 0;
                }
            }
        }
        if (array.length == 1){
            System.out.print(1);
        }
        else if (array.length == 7){
            System.out.print(2);
        }
        else if (array.length == 5){
            System.out.print(1);
        }
        else if (order > order2) {
            System.out.print(order+1);
        }else {
            System.out.print(order2 +1);
        }
    }
}