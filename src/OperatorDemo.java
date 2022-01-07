public class OperatorDemo {
    /*
    Arithmetic +,-,*,/,%
    Bitwise << >>
    Relational
    Logical
     */
    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        System.out.println(m + n); // 9
        System.out.println(m - n); // 1
        System.out.println(m * n); // 20
        System.out.println(m / n); // 1
        System.out.println(m % n); // 1

        m = n++; // Post increment
        System.out.println(m); // 4
        System.out.println(n); // 5
        ++n; // Pre increment
        System.out.println(n); // 6

    }
}
