import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int sp=row; //spaces
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<=row;i++){
            int j=sp;
            while(j!=0){
                System.out.print(" ");
                j--;
            }
            ArrayList<Integer> al2=new ArrayList<>();
            for(int k=0;k<=al.size();k++ ){
                if(k==0 || k==al.size()){
                    al2.add(1);
                    //System.out.print("1 ");
                }
                else{
                    al2.add(al.get(k)+al.get(k-1));
                }
            }
            al=al2;
            sp--;
            //System.out.print(al);
            for(int l=0;l<al.size();l++){
                System.out.print(al.get(l)+" ");
            }
           System.out.println();
        }
	}
}
