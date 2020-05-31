package codebatting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSandwich("xxbreadxbreadjambreadyy"));
	}

	private static String getSandwich(String str) {
		String var1="";
		String var2="";
		char[]c1= {'b','r','e','a','d'};
		int i=0;
		String strt="";
		String end="";
		boolean flag=false;
		boolean flag2=false;
		int idexToStrt=0;
		int idexToEnd=0;
		while(i<str.length()-5)
		{
			if(flag==false)
			{
			  for(int j=i;j<i+5;j++)
			  {
				strt=strt+str.charAt(j);
				idexToStrt=j;
			  }
			    if(strt.equals("bread"))
			   {
			    	System.out.println("strt1="+strt);
				flag=true;
			   }
			    strt="";
			  }
			
			if(flag2==false)
			{
				int num=str.length()-(5+i);
				for(int j=num;j<num+5;j++)
				{
					end=end+str.charAt(j);
					idexToEnd=j-5;
				}
				if(end.equals("bread"))
				{
					System.out.println("end="+end);
					flag2=true;
				}
				end="";
			}	
			i++;	
	}
		System.out.println("idexToStrt"+idexToStrt);
		System.out.println("idexToEnd"+idexToEnd);
		if(idexToEnd-idexToStrt<5)
		{
			for(int i1=idexToStrt+1;i1<=idexToEnd;i1++)
			{
				var2=var2+str.charAt(i1);
			}
			return var2;
		}
		else
		{
			i=0;
			char[]  c2=new char[idexToEnd-idexToStrt];
			for(int j=idexToStrt+1;j<=idexToEnd;j++)
			{
				c2[i]=str.charAt(j);
				i++;
			}
			System.out.println(Arrays.toString(c2));
			int count=0;
			for(int len=0;len<c2.length;len++)
			{
				if(c1[0]==c2[len])
				{
				for( i=len;i<len+c1.length;i++)
				{
					var1=var1+c2[i];
					count++;
				}
				if(var1.equals("bread"))
				{
					var1="";
					count=0;
					len=len+c1.length-1;
				}
				
				else {	
			var2=var2+var1;
			len=len+count;
			count=0;
			var1="";
				}
				}
				else
				{
				var2=var2+c2[len];
				}
//				System.out.println(var2);
			}
		}
		return var2;
	}

}
