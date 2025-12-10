import java.util.*;

class vowelCount{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		System.out.println(UserMainCode.vowelCount(inp));
		
	}
}

class UserMainCode{
	public static Integer vowelCount(String inp){
		int count=0;
		
		for(char ch:inp.toCharArray()){
			switch(ch){
				case 'A':
				case 'a':
				case 'E':
				case 'e':
				case 'I':
				case 'i':
				case 'O':
				case 'o':
				case 'U':
				case 'u':
				
					count++;
					break;
			}
		}
		
		return count;
	}
}