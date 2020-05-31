package codebatting;

import java.util.Arrays;

public class Zipzap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zipZap((("azbcpppzop") ) ));
	}
	public static String zipZap(String str) {
		  String Nstr="";
		  char[] cstr=str.toCharArray();
		  int[] zidex=new int[str.length()];
		  int countz=0;
		  int [] pidex=new int[str.length()];
		  int countp=0;
		  for(int i=0;i<str.length();i++)
		  {
		    if(str.charAt(i)=='z')
		    {
		      zidex[countz]=i;
		      countz++;
		    }
		   else if(str.charAt(i)=='p')
		    {
		      pidex[countp]=i;
		      countp++;
		    }
		   
		  }
		  System.out.println(Arrays.toString(zidex));
		  System.out.println(Arrays.toString(pidex));
		  int min=str.length();
		  int indexToStart=0;
		  int indexToEnd=0;
		  int indexOfP=0;
		  for(int index=0;index<countp;index++)
		  {
			  for(int indexz=index;indexz<countz;indexz++)
			  { 
				  if(pidex[index]>zidex[indexz])
				  {
					  if(min>pidex[index]-zidex[indexz])
					  {
						  min=pidex[index]-zidex[indexz];
						  System.out.println("min="+min);
						  indexToEnd=zidex[indexz];
						  indexOfP=pidex[index];
					  }
				  }
			  }
			  System.out.println("indexz="+indexToEnd);
			  if(min==2)
			  {
			  for(int k=indexToStart;k<=indexToEnd;k++)
			  {
				  Nstr=Nstr+str.charAt(k);
				  
			  }
			  }
			  else
			  {
				  for(int k=indexToStart;k<=indexOfP;k++)
				  {
					  Nstr=Nstr+str.charAt(k);
					  
				  }
			  }
			  min=str.length();
			  
			  System.out.println(Nstr);
			  indexToStart=indexOfP;
		  }
		  if(str.charAt(str.length()-1)=='p')
		  {
			  Nstr=Nstr+'p';
		  }
		  return Nstr;
		}

}
