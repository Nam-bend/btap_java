import org.example.*;
public class ex1_27t11 {
    public static void main(String[] args) {


    String str1 ="hello xin chao";
    String str2 = "xin chao";
    if( str1.contains(str2)==true){
        str1= str1.replace(str2,str2+str2);
        System.out.println(str1);
    }
}}
