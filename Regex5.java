import java.util.*;

class Regex5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		System.out.println(UserMainCode.regularExpression(inp));
		
	}
}

class UserMainCode{
	public static boolean regularExpression(String inp){
		return inp.matches("[1-9]{2}[0-9]{8}");
	}
}