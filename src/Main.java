import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];

        // TODO заполнение матрицы случайными значениями в диапазоне от 0 до 255:
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        print(colors);

        System.out.println("Введите угол поворота кратный 90");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int countRotate = input / 90;
        scanner.close();

        for (int i = 0; i < countRotate; i++) {
            colors = rotate(colors);
        }

        System.out.println("Новая матрица c поворотом на " + input + " градусов");
        print(colors);

    }

    // TODO Поворот матрицы на 90 градусов
    public static int[][] rotate(int[][] colors) {
        int[][] tmp = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tmp[i][j] = colors[SIZE - j - 1][i];
            }
        }
        return tmp;

    }

    //  TODO Вывод матрицы на экран
    public static void print(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }

    }
}