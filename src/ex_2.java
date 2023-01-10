public class ex_2 {
    public static class Example {
        private static int val1;
        public static void Example_() {
            System.out.println(val1);
            val1++;
        }
    }
    public static void main(String[] args) {
        Example Ex1 = new Example();
        Ex1.Example_();
        Ex1.Example_();

    }
}


