import java.util.*;
import java.math.*;
public class Main
{
    
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	   
	   int j=n;
	    BigInteger res=new BigInteger("1");
        while(j!=0){
            res=res.multiply(BigInteger.valueOf(j));;
            j--;
        }
	    System.out.println(res);
	    String str=res+"";
	    int count=0;
	    int i=str.length()-1;
	    while(str.charAt(i)=='0'){
	        count++;
	        i--;
	    }
	    System.out.println(count);

		
	}
}
