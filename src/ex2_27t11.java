import org.example.ex6_27t11;
import java.util.Scanner;

public class ex2_27t11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input String :");
        String arrays = scanner.nextLine();
        int[] lenght_str = new int[255];
        for (char ch : arrays.toCharArray()) {
            lenght_str[ch]++;
        }
        for (int index = 0; index < lenght_str.length; index++) {
            if (lenght_str[index] != 0) {
                System.out.println((char) index + ":" + lenght_str[index]);
                lenght_str[index] = 0;
            }
        }
    }}
