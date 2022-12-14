import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE]; // исходная матрица

        // TODO заполнение матрицы случайными значениями в диапазоне от 0 до 255:
        Random random = new Random();
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        print(colors);

        int[][] rotatedColors = new int[SIZE][SIZE]; // перевёрнутая матрица

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE-j-1][i];
            }
        }
        System.out.println("Новый массив");
        print(rotatedColors);


    }
    //  TODO Вывод матрицы на экран
    public static void print(int[][] colors) {
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
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