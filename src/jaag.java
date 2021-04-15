import java.util.HashMap;

public class jaag {

	 public static void main(String arg[]){
		 int ar[]={1,2,3,4,5,6,7,8,9,10,12,14,15,17,18,18,23,24};
		 int num = 0;
		 if(num==0 &num>1){
		 System.out.println("No is not even no");
		 }
		 for(int i=0;i<ar.length;i++){
		 if(ar[i]%2==0){
		 System.out.println("No is even no "+ar[i]);
		 num++;
		 }else{
		 System.out.println("No is not even no "+ar[i]);
		 }

		 }
		 System.out.println("Total No of even no "+num);

	 }
}
