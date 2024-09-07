public class Task3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : a)
            if (number % 2 == 0)
                System.out.println(number);
    }
}