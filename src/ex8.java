public class ex8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ex8__.medium(arr);

    }

    public static class ex8__ {
        static int[] IntArr;
        private static void medium(int [] array){
            int sum = 0;
            for (int i =0; i<array.length; i++) {
                sum = array[i]+sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Average array[] = "+avg);
        }
        }


        }