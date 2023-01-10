public class ex6 { //статический метод, которому аргументом передается целочисленный массив и целое число.
    public static void main(String[] args) {
        int[] inArray = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
        System.out.println("Второй аргумент метода меньше длины массива"+inArray[12]);
        for (int i = 0; i < ex6__.SetArray(inArray, 10).length; i++) {
            System.out.print("[" + i + "] = " + ex6__.SetArray(inArray, 10)[i]+", ");
        }
        System.out.println("\nВторой аргумент метода больше длины массива");
        for (int i = 0; i < ex6__.SetArray(inArray, 25).length; i++) {
            System.out.print("[" + i + "] = " + ex6__.SetArray(inArray, 25)[i]+", ");
        }
    }
    public static class ex6__ {
        private static int outputArray[];

        private static int[] SetArray(int inArray[], int count) {

            if (count > inArray.length) {
                count = inArray.length;
            }
            outputArray = new int[count];
            for (int i = 0; i < count; i++) {
                outputArray[i] = inArray[i];
            }
            //метод возвращает ссылку на новый массив
            return outputArray;
        }

    }
}
