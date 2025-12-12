package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class nextAdjusentinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4, 1, 4, 2, 9));
		LinkedList<Integer> a1 = new LinkedList<>();
		 int arr[] = {1,2,3,4};
		
		/*for(int i = 1; i<a.size();i++)
		{
			if(a.get(i-1)<=a.get(i))
			{
				a1.add(a.get(i));
			}
		}
		*/
		System.out.println(a1);
		 System.out.println( a1.stream().filter(x -> x <10).toArray() );
		
		 System.out.println( Arrays.stream(arr).boxed().collect(Collectors.toCollection(LinkedList::new)));
	}
   
}
