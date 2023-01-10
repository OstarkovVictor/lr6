public class ex4 {
    public static void main(String[] args) {
        int number = 6;
        int result = number;
            int j = number;
            for(int i=number; i>2;i=i-2) {
                j = j - 2;
                result *= j;
            }
        System.out.println("Вычисление двойного факториала числа "+number+"!! = "+result);




        }
    }


