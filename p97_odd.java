package p97_odd;

import java.util.Scanner;

public class p97_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		if(n<=9)
		{
			for(int i=1;i<=n;i++)
			{
				if(i%2!=0)
				{
					sum+=i;
				}
			}
		}
		System.out.println("sum - "+sum);

	}

}
