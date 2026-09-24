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
        for (int i = 0; i < firstArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(firstArray[i]);
        }
        System.out.println();

        for (int a = 0; a < secondArray.length; a++) {
            if (a > 0) {
                System.out.print(", ");
            }
            System.out.print(secondArray[a]);
        }
        System.out.println();


    }
}

