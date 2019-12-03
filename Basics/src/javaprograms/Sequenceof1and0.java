package javaprograms;

public class Sequenceof1and0 {

	public static void main(String[] args) {

		
		char[] a = {'1','0','1','0','1'};
		
		int len= a.length;
		
		boolean onestart=true;
		boolean oneend;
		
		for(int i=0;i<len;i++)
		{
			if(a[i]=='1')
			{
				onestart=true;
			}
			else
			{
				oneend=false;
			}
		}
		
		if(onestart)
		{
			System.out.println("it's in sequence");
		}
		
		
	}

}
