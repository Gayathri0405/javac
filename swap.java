package pack1;

public class swap {
	public static void main(String[]args)
	{
		int first=120,second=220;
		System.out.println("----before swap----");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
		int temporary=first;
		first=second;
		second= temporary;
	    System.out.println("----After swap----");
	    System.out.println("first number="+first);
	    System.out.println("second number="+second);
		
		
	}

}
