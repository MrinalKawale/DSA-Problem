package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {99, 55, 203, 99, 4, 91};
		
		/*for(int i =0 ; i <arr.length ;i++)
		{
		int j =0;
			for(j=i+1;j<arr.length;j++)
			{
				System.out.println("array value  i "+i+" = "+arr[i]+", array value j  "+j+" = "+arr[j]);
				if(arr[i]<arr[j])
				{
					System.out.println("**inside**");
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println("after sorting array value i "+i+" = "+arr[i]+", array value  j "+j+" = "+arr[j]); 
					
				}
			}
			
			
			System.out.println(i + "array = "+ Arrays.toString(arr)  );
		}*/
		List<Integer> ls = new ArrayList<>() ;
		ls  = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println("\n input = "+ls);
        List<Integer> list = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Collections.sort(ls,Collections.reverseOrder());
		System.out.println("\n Final List = "+list +"\n arrayList = "+ls );
	}

}
