import java.util.*;

class ArrayListtest
{
public static void main(String[]args)
{
	System.out.println("Hello World");
	ArrayList<Integer> obj=new ArrayList<Integer>();

	System.out.println(obj.isEmpty());
	for(int i=0;i<5;i++)
	{	
	obj.add(i);
	
	}
	System.out.println(obj);
}
}