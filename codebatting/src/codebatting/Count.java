package codebatting;

public class Count {
	   public static void main(String[]agrs)
	   {
	     System.out.println(countXY("DAY abc XYZ"));
	   }
	   public static int countXY(String s)
	   {
	     int count=0;
	     for(int i=0;i<s.length();i++)
	     {
	       char c=s.charAt(i); 
	       if(c=='y'||c=='z')
	       {
	         if(i==s.length()-1)
	         {
	           count++;
	         }
	         else
	         {
	         char c1=s.charAt(i+1);
	         int num=c1;
	         System.out.println(num);
	         if((num>=65&&num<=90)||(num>=97&&num<=122))
	         {
	           continue;
	         }
	         else
	         {
	        	 count++;
	         }
	         }
	       }
	     
	     }
	     return count;
	   }
	}


