public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Задание 1");
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
                sum += arr[index];
            }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");
        int minCost =200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
        int maxCost =-1;
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] > maxCost) {
                maxCost = arr[l];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +minCost+ " рублей. Максимальная сумма трат за день составила " +maxCost+ " рублей.");

        System.out.println("Задание 3");
        double middleSum = 0;
        for (int index = 0; index < arr.length; index++) {
            middleSum += arr[index] / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " +middleSum+ " рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }



}

