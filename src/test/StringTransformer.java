package test;
public class StringTransformer {

    public static String transformString(String str) {
    	if(str == null || str.isEmpty()) {
    		return str;
    	}
        boolean isReverse = true;
        StringBuilder result = new StringBuilder(); 
         int i =0;
         System.out.println("String length = " +str.length());
         
        while(i<str.length())
        {
        int end = Math.min(i+3, str.length());
       // System.out.println("start value = "+i + " , end value = "+end);
        String sub = str.substring(i, end);
        System.out.println("start value = "+i + " , end value = "+end + " , subString = " + sub + " , isReverse = "+ isReverse);
        
        if(isReverse)
        {
        	result.append(new StringBuilder(sub).reverse()) ;
        	
        }
        else
        {
        	result.append(sub);
        }
        isReverse =!isReverse;
        
        i+=3;
        
        }
        	
        
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String reverse = transformString(str);
        System.out.println("orignal string = " + str);
        System.out.println("output string = " + reverse);
    }
}