import java.util.*;
import java.util.regex.*;

class UserMainCode {
    public static boolean matchPattern(String str) {
        
        String regex = "CPT-\\d{6}";
        return str.matches(regex);
    }
}

public class regex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        boolean result = UserMainCode.matchPattern(input);
        System.out.println(result ? "True" : "False");
    }
}