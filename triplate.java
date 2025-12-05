import java.util.*;


class triplate {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int result = UserMainCode.triplet(arr);
        System.out.println(result);
    }
}

class UserMainCode {
    public static int triplet(int[] arr){
        int count=0;
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]){
                System.out.println(arr[i] + " " + arr[i+1] + " " + arr[i+2]);
                count++;
            }
        }

        return count;
    }
}
