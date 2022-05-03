package Array;

public class example11
{
	public static void main(String[] args)
	{
		//{Shree Praful Nikhil Yogesh}
		
		String p= "shree Praful Nikhil Yogesh";
		
		String []str = p.split(" ");
		System.out.println(str.length);//4
		
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(str[i]+" ");
	}
		
	}

}
