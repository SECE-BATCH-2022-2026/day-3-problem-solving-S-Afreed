import java.io.*;
import java.util.*;

class UserMainCode {
    public static String[] removeDuplicates(String[] arr) {
        TreeSet<String> set = new TreeSet<>(); 

        for (String s : arr) {
            set.add(s);  
        }

       String[] res = new String[set.size()];
       int i=0;
       for(String s:set){
       	 res[i++]=s;
       }
       return res;
    }
}

public class remove_dup {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        String[] result = UserMainCode.removeDuplicates(arr);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
