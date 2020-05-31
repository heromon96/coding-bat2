package codebatting;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordEnds("XY", "XY"));
	}
	public  static String wordEnds(String str, String word) {
		  String s1="";
		  String s="";
		  
		    for(int i=0;i<str.length();i++)
		    {
		      for(int j=i;j<i+word.length();j++)
		      {
		    	  if(j<str.length()) {
		        s=s+str.charAt(j);
		        System.out.println("s="+s);
		      }
		      }
		      if(s.equals(word))
		      {
		    	  if(i==0)
		    	  {
		        	System.out.println("true and i="+i);
		          s1=s1+str.charAt(i+word.length());
		    	  }
		    	  else if(i==str.length()-word.length())
		    	  {
		    		  s1=s1+str.charAt(i-1);
		    	  }
		    	  else
		    	  {
		    		  s1=s1+str.charAt(i-1)+str.charAt(i+word.length());
		    	  }
		      }
		      s="";
		      System.out.println("s1="+s1);
		    }
		    return s1;
		  
		  // return "";
		}

}
