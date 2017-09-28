 import java.util.Scanner;

public class CastingJava {

	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l;
		
		float f;
		double d;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("\nImplicit Type Casting\n");
		System.out.println("----------------------------------------------------");
		
		System.out.println("Enter byte Value : ");
		b=obj.nextByte();
		System.out.println("Enter short Value : ");
		s=obj.nextShort();
		i=b+s;
		System.out.println("Sum of byte and short stored in int : "+i); //auto-widening
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nEnter short Value : ");
		s=obj.nextShort();
		System.out.println("Enter int Value : ");
		i=obj.nextInt();
		l=s+i;
		System.out.println("Sum of short and int stored in long : "+l);
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nEnter int Value : ");
		i=obj.nextInt();
		System.out.println("Enter long Value : ");
		l=obj.nextLong();
		f=i+l;
		System.out.println("Sum of int and long stored in float : "+f);
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nEnter long Value : ");
		l=obj.nextLong();
		System.out.println("Enter float Value : ");
		f=obj.nextFloat();
		d=l+f;
		System.out.println("Sum of long and float stored in double : "+d);
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nExplicit Type Casting\n");
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nEnter double Value : ");
		d=obj.nextDouble();
		System.out.println("Enter float Value : ");
		f=obj.nextFloat();
		l=(long)d+(long)f;    //explicit casting
		System.out.println("Sum of double and float stored in long : "+l);
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nEnter float Value : ");
		f=obj.nextFloat();
		System.out.println("Enter long Value : ");
		l=obj.nextLong();
		i=(int)f+(int)l;    //explicit casting
		System.out.println("Sum of float and long stored in int : "+i);
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nEnter long Value : ");
		l=obj.nextLong();
		System.out.println("Enter int Value : ");
		i=obj.nextInt();
		s= (short)(l+i) ;  //explicit casting
		System.out.println("Sum of long and int stored in short : "+s);
		System.out.println("----------------------------------------------------");
		
		
		System.out.println("\nEnter int Value : ");
		i=obj.nextInt();
		System.out.println("Enter short Value : ");
		s=obj.nextShort();
		b= (byte)(i+s) ;  //explicit casting
		System.out.println("Sum of int and short stored in byte : "+b);
		System.out.println("----------------------------------------------------");
		
		System.out.println("\nEND");

	}

}
