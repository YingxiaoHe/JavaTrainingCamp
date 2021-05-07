public class HelloByteCode {

    public static void main(String[] args) {
        int i1 = 3;
        double d2 = 13.13;
        for (; i1 > -5; i1--) {
            if ((i1 + d2) > 10) {
                double d3 = i1 / d2;
            } else {
                double d4 = i1 * d2;
            }
        }
    }
}
