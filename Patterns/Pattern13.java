import java.util.*;
public class Pattern13
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int star=1;
	    int space=a-1;
	    for(int i=1;i<=a;i++){
	        for(int j=1;j<=space;j++){ 
	            System.out.print("  "); }
	                   
	       for(int k=1;k<=star;k++){
	           if(k==1||k==star||i==a){
	           
	                   System.out.print("* ");}
	                   else{
	                      System.out.print("  "); }
	       }
	                   System.out.println();
	                   star+=2;
	                   space--;
	    }
	}
}