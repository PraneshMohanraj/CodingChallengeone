import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split("\\s+");
		int max=0;
		String s=arr[0];
		for(int i=0;i<arr.length;i++){
		    int cur=arr[i].length();
		    if(cur>max){
		        s=arr[i];
		        max=cur;
		    }
		}
		System.out.println(s+" "+max);
	}
}