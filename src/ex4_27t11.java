

public class ex4_27t11 {
    public static void main(String[] args) {
        String inputString = "  xin chao moi nguoi   ";
        inputString = inputString.trim();
        String[] words = inputString.split("\\s+");
        int wordCount = words.length;

        System.out.println("Số từ trong xâu là: " + wordCount);
    }
    }

