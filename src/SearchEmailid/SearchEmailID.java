package SearchEmailid;

import java.util.Scanner;



public class SearchEmailID {

	static boolean s(String x[],String a) {


		
		for(String value:x) {
			if(value.equals(a))
		 return true;
		}
		return false;
		
	}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	String[] emailIds = {"dhruvik@mphasis.com" , "vinay@mphasis.com", "chaitanya@mphasis.com","abhi@mphasis.com","rahul@mphasis.com"};
	
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		System.out.println("Enter the Email id to search");
	String name=sc.nextLine();
	
	//boolean r=SearchEmailID.a(name);
	
	System.out.println("Email id is : "+SearchEmailID.s(emailIds,name));
	}
}

}

