public class ex9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ex9__.invert(arr);

    }

    public static class ex9__ {

        private static void invert(int [] array){
            int[] sum = new int[array.length];
            for (int i =0; i<array.length; i++) {
                sum[i] = array[array.length - 1 - i];
            }for (int i =0; i<array.length; i++) {array[i] = sum[i];System.out.println("array["+i+"] = "+array[i]);
            }

        }
    }


}

