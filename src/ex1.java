import java.util.*;
public class ex1 {

    private char ch;
    private String str;


    public static void SetField(char c) {

        System.out.print("\n Вызов метода SetField c аргументом char. ch ="+c);
    }
    public  static void SetField(String s) {
        System.out.print("\n Вызов метода SetField c аргументом string. str ="+s);
    }
    public  static void SetField(char [] CharArray) {String str1 = new String();
        if (CharArray.length == 1){

            System.out.print("\n Вызов метода SetField c массивом char. ch ="+ Arrays.toString(CharArray));
        }
        else{
            //Если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю.
            str1= (Arrays.toString(CharArray));
            System.out.print("\n Вызов метода SetField c массивом string. str ="+str1);}
    }



}
