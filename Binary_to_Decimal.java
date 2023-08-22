package loops;

public class Binary_to_Decimal {
	
	public static void main(String[] args) {
		
		Binary_to_Decimal bd = new Binary_to_Decimal();
		
		bd.slipt_Digit(1011);
		
	}

	private void slipt_Digit(int binary) {
		
		int p = 0; int decimal = 0;
		
		
		while(binary>0)  // 1011 // 101
		{
			int rem=binary%10; //1 //1 
			int result = rem * find_power(2,p);
			p = p + 1;
			
			decimal = decimal + result;
			
			//System.out.println(result);  //1 //1 
			binary = binary / 10; //
		}
		System.out.println(decimal);
		
	}

	
private int find_power(int base, int power) {
		
		int no = 1;
		while(power>0)
		{
			no=no*base;
			power=power - 1;
		}
		//System.out.println(no);
	    return no;
	}

}
