public class StrangeDemo {
    public static void main(String[] args) {
        int x = 23;
        strange(x);
        System.out.println("2. x = " + x);
    }

    public static void strange(int x) {
        x++;
        System.out.println("1. x = " + x);
    }
}