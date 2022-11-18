//Remove duplicate without collection
public class Main {
	static void method(String[] x)
	{
		for(int i=0;i<x.length;i++)
		{
			int count=0;
			for(int j=i;j<x.length;j++)
			{
				if(x[i].equals(x[j]))
				{
					count++;
				}
			}
			if(count==1)
			{
				 System.out.println(x[i]);
			}
		}
	}
	public static void main(String[] args) {
		String[] x= {"helo","hi","hello","helo","Hi"};
		method(x);
	}
}
