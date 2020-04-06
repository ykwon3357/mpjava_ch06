package mpjava.ch06;

import java.util.Random;
import java.util.StringTokenizer;

public class Ex03 {

	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0;i<10;i++){
			System.out.print(rand.nextInt(156)+100);
			System.out.print(" ");
		}
//		for(int i=0;i<10;i++){
//			System.out.print((int)(Math.random()*156+100));
//			System.out.print(" ");
//		}
		
	}
	public static void test(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6","=,");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		st = new StringTokenizer("a=3,b=5,c=6","abc=,");
		int sum=0;
		while(st.hasMoreTokens()){
			//System.out.println(st.nextToken());
			sum = sum+Integer.parseInt(st .nextToken());
		}
		
		System.out.println("합은 "+sum);
		
		
//		String st ="a=3,b=5,c=6";
//		String[] stlist= st.split(",");
//		for(String s: stlist){
//			System.out.println(s);
//		}

	}

}
