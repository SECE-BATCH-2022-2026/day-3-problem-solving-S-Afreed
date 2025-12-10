import java.io.*;

class substring {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inp = br.readLine();
        Integer n = Integer.parseInt(br.readLine());

        System.out.println(UserMainCode.repeatFront(inp, n));
    }
}

class UserMainCode {
    public static String repeatFront(String input, Integer n) {
        int l = input.length();

        if (l == 0) {
            return input;
        } 
        else if (l < 3) {
            String res = "";
            for (int i = 0; i < n; i++) {
                res += input;
            }
            return res;
        } 
        else {
            String res = "";
            String first3 = input.substring(0, 3);

            for (int i = 0; i < n; i++) {
                res += first3;
            }
            return res;
        }
    }
}