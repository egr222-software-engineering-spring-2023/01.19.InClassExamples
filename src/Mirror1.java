public class Mirror1 {
    public static void main(String[] args) {
        border();
        topHalf();
        bottomHalf();
        border();
    }

    public static void topHalf() {
        System.out.println("topHalf");
    }

    public static void bottomHalf() {
        System.out.println("bottomHalf");
    }

    public static void border() {
        System.out.println("border");
    }
}