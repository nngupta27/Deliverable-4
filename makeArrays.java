import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class makeArrays {
	
	ArrayList<Integer []> arrays = new ArrayList<Integer []>();
	Integer [] arr;	
	
	public makeArrays()
	{
		Random val = new Random();	
		for(int i = 0; i < 100; i++)
		{
			int size = val.nextInt(100);
			while(size <= 0)
			{
				val.nextInt(100);
			}
			arr = new Integer [size];
			
			for(int j = 0; j < arr.length; j++)
			{
				arr[j] = val.nextInt(100);
			}
			arrays.add(i, arr);
		}
		
	}
	
	public Integer [] getArray(int index)
	{
		Integer [] a;
		a = arrays.get(index);
		return a;
	}
	
	public ArrayList<Integer []> getArrayList()
	{
		return arrays;
	}
	
	public Integer [] sortArray(int index)
	{
		Integer [] a;
		a = arrays.get(index);
		Arrays.sort(a);
		return a;
	} 

}
