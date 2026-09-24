import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Задача 1.1
        System.out.println("Task 1.1");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        // Задача 1.2
        System.out.println("Task 1.2");
        double[] secondArray = {1.57, 7.654, 9.986};

        // Задача 1.3
        System.out.println("Task 1.3");
        String[] thirdArray = new String[]{"winter", "spring", "summer", "autumn"};
        System.out.println();

        // Задача 2
        System.out.println("Task 2");
        // Вывод первого массива
        for (int i = 0; i < firstArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(firstArray[i]);
        }
        System.out.println();

        // Вывод второго массива
        for (int a = 0; a < secondArray.length; a++) {
            if (a > 0) {
                System.out.print(", ");
            }
            System.out.print(secondArray[a]);
        }
        System.out.println();

        // Вывод третьего массива
        for (int b = 0; b < thirdArray.length; b++) {
            if (b > 0) {
                System.out.print(", ");
            }
            System.out.print(thirdArray[b]);
        }
        System.out.println();
        System.out.println();

        // Задача 3
        System.out.println("Task 3");
        // Вывод первого массива в обратном порядке
        for (int i1 = firstArray.length - 1; i1 >= 0; i1--) {
            System.out.print(firstArray[i1]);
            if (i1 > 0) {
                System.out.print(", ");

            }
        }
        // Вывод второго массива в обратном порядке
        System.out.println();
        for (int a1 = secondArray.length - 1; a1 >= 0; a1--) {
            System.out.print(secondArray[a1]);
            if (a1 > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Вывод третьего массива в обратном порядке
        for (int b1 = thirdArray.length - 1; b1 >= 0; b1--) {
            System.out.print(thirdArray[b1]);
            if (b1 > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        // Задача 4
        System.out.println("Task 4");
        //Преобразование первого массива
        for (int i2 = 0; i2 < firstArray.length; i2++) {
            if (firstArray[i2] % 2 != 0) {
                firstArray[i2] = firstArray[i2] + 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));

    }
}

