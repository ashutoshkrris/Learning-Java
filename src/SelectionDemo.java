public class SelectionDemo {
    /*
    if
    ternary
    switch
     */

    public static void main(String[] args) {
        int n = 7;
        if (n % 2 == 0) {
            System.out.println("I am even");
        } else {
            System.out.println("I am odd");
        }

        // Ternary
        int m = 8;
        String message;
        message = m % 2 == 0 ? "I am even" : "I am odd";
        System.out.println(message);

        // Switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("I won't tell");
        }
    }
}
