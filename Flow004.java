import java.util.Scanner;
class Flow0041
{
	public static void main(String[] args) 
	{
		int T,N,sum,r;
		Scanner sc= new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0;i<T;i++){
			sum = 0;
		    N = sc.nextInt();
			r = N%10 ;
			while(N>=10){
				N = N/10;
				sum = N;    
			}
			sum = sum + r;
			System.out.println(sum);
		}
	}
}
