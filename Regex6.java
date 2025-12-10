import java.util.*;

class Regex6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		char ch=sc.nextLine().charAt(0);
		String[] op=UserMainCode.splitString(inp,ch);
	
		
		Arrays.stream(op).forEach((x) -> System.out.println(x));

	}
}

class UserMainCode{
	public static String[] splitString(String inp,char ch){
	
		String[] arr=inp.split(""+ch);
		String[] op = new String[arr.length];
		int i=0;
		
		
		for(String s:arr){
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			String s1=sb.toString();
			op[i++]=s1.toLowerCase();
			
		}
		
		return op;
		
		
	}
}