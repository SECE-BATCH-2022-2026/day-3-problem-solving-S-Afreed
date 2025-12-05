import java.util.*;
import java.io.*;




class String_Occurence{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		int count=UserMain.CountOccurence(s1,s2);
		
		System.out.println(count);
	}
}

class UserMain{
	public static int CountOccurence(String s1,String s2){
		int count=0;
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1==0 || l2==0){
			return 0;
		}
		
		int index=s1.indexOf(s2);
		
		// while(index!=-1){
			// count++;
			// index=s1.indexOf(s2,index+l2);
		// }
		// return count;
		
		while(s1.contains(s2)){
			count++;
			int i=s1.indexOf(s2);
			s1=s1.substring(i+l2);
		}
		return count;
	}
}