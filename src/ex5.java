public class ex5 {  public static void main(String[] args) {
    int n = 6;
    boolean test;
    int sqtest = (n*(n+1)*(2*n+1)/6);
    int result=0;
    int j = n;
    int s = 2;
    for(int i=n; i>0;i--){
        result = (int)Math.pow(j,s) + result;
        j--;
    }
    test = result == sqtest;
    System.out.println("Сумма квадратов числа "+""+n+""+" = "+result+" ("+test+")");
}}