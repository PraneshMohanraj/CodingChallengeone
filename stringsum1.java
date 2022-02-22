import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(str);
		String temp="";
		int val=0;
		char arr[]=str.toCharArray();
		int n=arr.length;
		int i=0;
		while(i<n){
		    if(Character.isAlphabetic(arr[i])){
                temp=temp+arr[i];
                i++;
            }
            
            else {
                while(i<n && Character.isDigit(arr[i])){
                    val=10*val+ Integer.parseInt(arr[i]+"");
                    i++;
                }
                
                while(val>0){
                    System.out.print(temp);
                    val--;
                }
		        val=0;
		        temp="";
            }   
		}
		
	}
}
