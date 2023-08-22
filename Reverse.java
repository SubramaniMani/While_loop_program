package loops;

public class Reverse {

	public static void main(String[] args) {
		
		Reverse obj = new Reverse();
		
	//	obj.one();
		//obj.two();
	//	obj.three();
		//obj.sum_of_count();
		obj.sum_digit();
		
		
		
		
		
	}

	private String sum;
	private String rem;
		
		public void one()
		{
		int box = 1234;
//		System.out.println(box%10);
//		box = box/10;
//		System.out.println(box%10);
//		box = box /10;
//		System.out.println(box%10);
//		box = box /10;
//		System.out.println(box%10);
		while(box>0)
		{
			int rem=box%10;
			box = box/10;
			System.out.println(rem);
		}
	}
		
		public void two()
		{
			int box = 10203040;
			while(box>0)
			{
				int rem = box % 100;
				box = box /100;
				System.out.print(rem +" ");
			}
		}
		public void three()
		{
			int box = 102030;
			while(box>0)
			{
				int rem = box % 1000;
				box = box /1000;
				System.out.print(rem+" ");
			}
		}

		
		
		public void sum_of_count()
		{
			int box = 1234;
			int count = 0;
			while(box > 0)
			{
				int rem = box % 10;
				System.out.println(rem);
				box = box /10;
				count = count +1;
			}
			System.out.println("count of digit ===> "+count);
				
				
			}
		
		public void sum_digit()
		{
			int box = 1234;
			int count =0;
			while(box > 0)
			{
				int rem = box %10;
				System.out.println(rem+ " ");
				count = count + rem;
				box= box / 10;
				
			}
			System.out.println("Sum of digit ===>" +count);
				
			}
			
		}

		
		

