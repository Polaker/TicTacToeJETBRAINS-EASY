package tictactoe;
import java.awt.*;
import java.util.Scanner;
public class Main {
    public static boolean isActive = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tablica[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablica[i][j] = ' ';
            }
        }
        printGrid(tablica);
        do {
            while (true) {
                System.out.print("Enter the coordinates: ");
                String coordinates = scanner.nextLine();
                String[] parts = coordinates.split(" ");
                String part1 = parts[0];
                String part2 = parts[1];
                if (part1.length() > 1 && part2.length() > 1 || part1.length() > 1 || part2.length() > 1) {
                    System.out.println("You should enter numbers!");
                    continue;
                }
                int firstCoordinate = Integer.parseInt(part1);
                int secondCoordinate = Integer.parseInt(part2);

                if (firstCoordinate > 3 && firstCoordinate <= 9 || secondCoordinate > 3 && secondCoordinate <= 9) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }

                if (tablica[firstCoordinate - 1][secondCoordinate - 1] == 'X' || tablica[firstCoordinate - 1][secondCoordinate - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                } else if (tablica[firstCoordinate - 1][secondCoordinate - 1] != 'X' || tablica[firstCoordinate - 1][secondCoordinate - 1] != 'O') {
                    tablica[firstCoordinate - 1][secondCoordinate - 1] = 'X';
                    break;
                }
            }
            printGrid(tablica);
            gameState(tablica);
        } while (isActive != false);



    }
    public static void gameState(char tablica[][]) {
        int index = 0, sumX = 0, sumO = 0;
        boolean xWins = false, oWins = false, isImpossible = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablica[i][j] == 88) {
                    sumX++;
                } else if (tablica[i][j] == 79) {
                    sumO++;
                }
            }
        }
        // Checking for X's
        if (tablica[index][index] + tablica[index][index+1] + tablica[index][index+2] == 264 ||  // pierwszy wiersz
                tablica[index][index] + tablica[index+1][index] + tablica[index+2][index] == 264 || // pierwsza kolumna
                tablica[index][index+1] + tablica[index+1][index+1] + tablica[index+2][index+1] == 264 || // druga kolumna
                tablica[index][index+2] + tablica[index+1][index+2] + tablica[index+2][index+2] == 264 || // ostatnia kolumna
                tablica[index+1][index] + tablica[index+1][index+1] + tablica[index+1][index+2] == 264 ||
                tablica[index+2][index] + tablica[index+2][index+1] + tablica[index+2][index+2] == 264 || // ostatni wiersz
                tablica[0][0] + tablica[1][1] + tablica[2][2] == 264 || // przekątna z lewej gory a nastepnie z prawej
                tablica[2][0] + tablica[1][1] + tablica[0][2] == 264) {
            if (isImpossible == false) {
                //System.out.println("X wins");
                xWins = true;
            }
        }
        // Checking for O's
        if (tablica[index][index] + tablica[index][index+1] + tablica[index][index+2] == 237 ||  // pierwszy wiersz
                tablica[index][index] + tablica[index+1][index] + tablica[index+2][index] == 237 || // pierwsza kolumna
                tablica[index][index+1] + tablica[index+1][index+1] + tablica[index+2][index+1] == 237 || // druga kolumna
                tablica[index][index+2] + tablica[index+1][index+2] + tablica[index+2][index+2] == 237 || // ostatnia kolumna
                tablica[index+1][index] + tablica[index+1][index+1] + tablica[index+1][index+2] == 237 || // drugi wiersz
                tablica[index+2][index] + tablica[index+2][index+1] + tablica[index+2][index+2] == 237 || // ostatni wiersz
                tablica[0][0] + tablica[1][1] + tablica[2][2] == 237 || // przekątna z lewej gory a nastepnie z prawej
                tablica[2][0] + tablica[1][1] + tablica[0][2] == 237) {
            if (isImpossible == false) {
                //System.out.println("O wins");
                oWins = true;
            }

        }
        // Checking if impossible
        if (isImpossible == false && oWins == false && xWins == true) {
            System.out.println("X wins");
            isActive = false;
        }
        if (isImpossible == false && xWins == false && oWins == true) {
            System.out.println("O wins");
            isActive = false;
        }
        if (sumX + sumO == 9 && xWins == false && oWins == false) {
            if (isImpossible == false) {
                System.out.println("Draw");
                isActive = false;
            }
        }
    }
    public static void printGrid(char tablica[][]) {
        int indexTab1 = 0,indexTab2 = 0;
        System.out.println("---------");
        //Wypisanie pierwszego wiersza
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            System.out.print(tablica[indexTab1][indexTab2] + " ");
            indexTab2++;
        }
        System.out.println("|");
        indexTab2=0;
        indexTab1++;

        //Wypisanie drugiego wiersza
        System.out.print("| ");
        for (int i = 3; i < 6; i++) {
            System.out.print(tablica[indexTab1][indexTab2] + " ");
            indexTab2++;
        }
        System.out.println("|");
        indexTab2=0;
        indexTab1++;
        //Wypisanie trzeciego wiersza
        System.out.print("| ");
        for (int i = 6; i < 9; i++) {
            System.out.print(tablica[indexTab1][indexTab2] + " ");
            indexTab2++;
        }
        System.out.println("|");
        System.out.println("---------");
    }
}
