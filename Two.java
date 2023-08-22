package While_Loop;

public class Two {
			  public static void main(String[] args) {
			    // TODO Auto-generated method stub
			    
			    Two object=new Two();
			   // object.common_divisor();
//			    object.GCD();
//			    object.three_table();
			    object.least_muliplication();
			    //object.last_number_divisor();
			    //object.two_divisor_find(); 
			    //object.divisor_finded();
			      //object.not_statisfy();
			    //object.last_digit();
			    //object.find_digits();
			    //object.find_total_value();
//			      object.add(12345);
			    //object.last_digit();
			    //object.digit();
//			    object.last();
			    //object.rev();
			  }
			  public void common_divisor()
			  {
			    int no1=15,no2=30;
			    int small=no1<no2?no1:no2;
			    int div=2;
			    while(div<=small)
			    {
			      if(no1%div==0 && no2%div==0)
			      {
			        System.out.println(div);
			      }
			      div++;
			    }
			  }
			    public void GCD()
			    {
			      int no1=15,no2=30;
			      int small=no1<no2?no1:no2;
			      int div =2;
			      int greater=0;
			      while(div<=small)
			      {
			        if(no1%div==0 && no2%div==0)
			        {
			        greater = div;
			        }
			        div++;
			        
			        }
			        System.out.println(greater);
			    }
			    public void three_table()
			    {
			      int no=3;
			      int count=1;
			      while(count<=10)
			      {
			        System.out.println(count*no);
			        count++;
			      }
			    }
			    public void least_muliplication()
			    {
			      int no1=10,no2=30;
			        int big=no1>no2?no1:no2;
			        while(true)
			        {
			          if(big%no1==0 && big%no2==0)
			          {
			            System.out.println(big);
			            break;
			          }
			          big++;
			        }
			    }
			    public void last_number_divisor()
			    {
			      int no=50,div=2,last=0;
			      while(div<no)
			      {
			        if(no%div==0)
			        {
			          last=div;
			        }
			        div++;
			      }
			      System.out.println(last);
			        }
			      
			    public void two_divisor_find()
			    {
			      int no=50,div=2,count=0;
			      while(div<no)
			      {
			        if(no%div==0)
			        {
			          count++;
			        }
			          if(count==2)
			          {
			            System.out.println(div);
			          }
			        div++;
			      }
			      
			    }
			    public void divisor_finded()
			    {
			      int no=50,div=2;
			      while(div<50)
			      {
			        if(no%div==0)
			        {
			          System.out.println(div);
			        }
			        div++;
			        }
			        
			      }
			    public void not_statisfy()
			    {
			      int no=50,div=2;
			      while(div<50)
			      {
			        if(no%div!=0)
			        {
			          System.out.println(div);
			        }
			        div++;
			        }
			      }
			    public void last_digit()
			    {
			      int no=1234;
			      while(no>0)
			      {
			        System.out.println(no%10);
			        no=no/10;
			    }
			      
			    }
			    public void find_digits()
			    {
			      int no=9034567;
			      int count=0;
			      while(no>0)
			      {
			        System.out.println(no%10);
			        count++;
			        no=no/10;
			      }
			      System.out.println("digits ="+count);
			    }
			    public void find_total_value()
			    {
			      int no=1234;
			      int total=0;
			      while(no>0)
			      {
			        total=total+no%10;
			        no=no/10;
			      }
			      System.out.println("Total is ="+total);
			      }
			    
			    private void add(int no)
			    {
			      //int no=1234;
			      int total1=0;
			      while(no>0)
			      {
			        total1=total1+no%10;
			        no=no/10;
			      }
			      if(total1>9)
			    { 
			        add(total1);
			    }
			    else 
			    {
			      System.out.println(total1);
			    }
			    
			    }
			    public void digit()
			    {
			    	int no=1;
			    	int digit=0;
			    	while(no<=10)
			    	{
			    	digit=no*no;
			    	System.out.println(digit);
			    	no++;
			    	}
			    }
			   
			    public void last()
			    {
			    	int no=1002;
			    	int rem=0;
			    	while(no>0)
			    	{
			    		//no=no/10;  
			    	//System.out.println(rem);
			    	
			       
			    	}
			    	System.out.println(rem);
			    }
			    public void rev()  // print last t
			    {
			    	int no=1032;
			    	//int div=0;
			    	//int rem=0;
			    	int count=0;
			    	while(no>0)
			    	{
			    		int rem = no%10;
			    		count++;
			    			if(count==1 || count==2)
			    			{
			    				System.out.print(rem);
			    				
			    			}
//			    			count++;
			    			no = no/10;
			    		
			    		//System.out.print(rem);
			    		//no=no/10;
			    		//System.out.println(rem);
			    	}
			    	//System.out.println(rem);
			    		
			    	}
			    }
			

