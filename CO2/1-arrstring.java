/*6. program to sort strings*/
import java.io.*;
public class arrstring
	{
	public static void main(String[] args) throws IOException
		{
		String[] arr= {"Java","CPP","Visual Basic", "Python"};
		int size=arr.length;
		for(int i=0;i<size-1;i++)
			{
			for(int j=i+1;j<size;j++)
				{
				if(arr[i].compareTo(arr[j])>0)
					{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
		for(int i=0;i<size;i++)
			{
			System.out.println(arr[i]);
			}
		}
	}