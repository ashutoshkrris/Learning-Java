public class IterationDemo {
    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }

        // Enhanced for loop
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i : arr) {
            System.out.println("hello " + i);
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("hello " + i);
            i++;
        }

        // do while
        int j = 6;
        do {
            System.out.println("at least once");
            j++;
        } while (j < 5);


    }
}
