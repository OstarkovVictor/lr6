public class ex10__ {
    public static void main(String[] args) {
        ex0__.MinMax(1,2,3,4,5,6);
    }

    public static class ex0__ {

            private static void MinMax(int ... array){
                int max = array[0];int[] sum = new int[2];
                for (int i =0; i<array.length; i++) {
                    max = Math.max(max, array[i]);
                }
                int min = array[0];
                for (int i =0; i<array.length; i++) {
                    min = Math.min(min, array[i]);
                }
                sum[0] = max;sum[1]=min;
                System.out.println("MinMax array = "+sum[1]+", "+sum[0]);
            }
            }
        }