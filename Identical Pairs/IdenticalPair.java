/*
Given a list Interger.You are required to compute the number of pairs of indexes whose values are the same, 
and also the maximum distance between two indexes with equal values.N will
be given in the first line of the input.N lines follow,each one with one Integer from the list.
If no identical pairs are found,print NA,otherwise print a single line with two integer,
the number identical pairs,and the maximum distance between indexes with equal values.
*/
import java.util.*;
import java.util.Map.Entry;

public class IdenticalPair 
{
public static void main(String[] args) {
	TreeMap<Integer,Integer> t1=new TreeMap();
	Scanner sc=new Scanner(System.in);
	System.out.println("array lrngth");
	int n=sc.nextInt();
	for (int i = 0; i < n; i++) 
	{
		int a=sc.nextInt();
		if (!t1.containsKey(a))
		{
			t1.put(a, 1);
		} 
		else 
		{
			int x=t1.get(a);
			x++;
			t1.put(a, x);
		}
		
	}
	for (Entry<Integer, Integer> a1 : t1.entrySet()) {
		if(a1.getValue()>1 && a1.getKey()!=1)
		System.out.println(a1.getValue()+" "+a1.getKey());
	}
	
	
}
}
