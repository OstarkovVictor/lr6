public class ex7 {
    public static void main(String[] args) {
        char[] arr = {'l','o','l'};
        ex7__.convertArray(arr);
        ex7__.outputarr();

    }

    public static class ex7__ {
        static int[] IntArr;


        private static int[] convertArray(char arrchar[]) {
            IntArr = new int[arrchar.length];
            for (int i = 0; i < arrchar.length; i++) {
                IntArr[i] = (int)arrchar[i];
            }

            return IntArr;
        }

        private static void outputarr() {
            for (int i = 0; i < IntArr.length; i++) {
                System.out.println("[" + i + "] = " + IntArr[i]);
            }
        }}}