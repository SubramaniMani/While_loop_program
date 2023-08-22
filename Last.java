package While_Loop;

public class Last {

	public static void main(String[] args) {

   Last object=new Last();
   object.last();
   
	}
public void last()
{
	int no=2006;
	int frist=0,Last=0;
	Last=no%10; //2006%10 =6
	System.out.println("Last="+Last);	
while(no>frist)// 2006 > 0 /
{
	frist=no%10; // 6/  0
	no=no/10;	 //200 /20/ 2
}
System.out.println("frist="+frist);
}

}
