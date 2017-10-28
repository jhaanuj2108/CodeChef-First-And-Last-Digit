import java.util.Scanner;
class Flow004
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			String N = sc.next();
			int first = Integer.parseInt(N.substring(0,1));
			int last = Integer.parseInt(N.substring(N.length()-1));
						
			System.out.println(first + last);

		}
	}
}
