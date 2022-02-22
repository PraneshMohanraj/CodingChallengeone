import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//System.out.println(str);
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++){
		    if(!(hm.containsKey(Character.toString(array[i])))){
		        hm.put(Character.toString(array[i]),0);
		    }
		    hm.put(Character.toString(array[i]),hm.get(Character.toString(array[i]))+1);
		}
		for(Map.Entry m:hm.entrySet()){  
            System.out.print(m.getKey()+""+m.getValue());  
        }  
		
	}
}