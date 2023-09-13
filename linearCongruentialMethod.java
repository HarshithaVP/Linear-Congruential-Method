package hash;
import java.util.*;
import java.io.*;
public class linearCongruentialGenerator {

	public static void main(String[] args) {
		int xo,m,a,c,xn;
		//m, ( > 0) the modulus
   		//a, (0, m) the multiplier
		//c, (0, m) the increment
		//X0,  [0, m) – Initial value of sequence known as seed
		int count=0; // to count the number of occurences
		System.out.println("enter the A value");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter the M value");
		m=sc.nextInt();	
		int dyn[]= new int[m]; //an array to store the values of seed
		System.out.println("enter the Xo value");
		xo=sc.nextInt();
		System.out.println("enter the C value");
		c=sc.nextInt();
		xn = xo;
		while(true)
		{
		count++;
		xo = ((a * xo) + c) % m;
		System.out.println("x"+count+"= "+xo);
		dyn[count] = xo;
		if( xo == xn )
		{
			break;
		}
	    }
	for(int j = 0 ; j < count ; j++ )
		if( xo == dyn[j] ) // comparing the contents of the array to the seed 
		{
			System.out.println("repeating so exiting the program");
			System.exit(0);
		}
	
		
		System.out.println("count of reoccurence is "+count);
	}

}
