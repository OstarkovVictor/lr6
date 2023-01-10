public class ex3 {

    private static class ex3calc {
        //наибольшее значение,
        private static void Max(int ... array){
            int max = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Maximum array[] = "+max);
        }
        //наименьшее значение,
        private static void Min(int ... array){
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Minimum array[] = "+min);
        }
        //среднее значение из набора чисел.
        private static void medium(int ... array){
            int sum = 0;
            for (int i =0; i<array.length; i++) {
                sum = array[i]+sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Average array[] = "+avg);
        }
    }
    public static void main(String[] args) {
        ex3calc.Max(1,2,3,4,5,6,7,8);
        ex3calc.Min(1,2,3,4,5,6,7,8);
        ex3calc.medium(1,2,3,4,5,6,7,8);
    }
}

