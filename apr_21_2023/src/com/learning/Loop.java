package com.learning;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop II = new Loop();
//		II.print_11111();
//		II.print_first_10_even_no();
//		II.multiples_of_first_5_no(1);
//		II.find_common_divisors(100,200);
//		II.find_greatest_common_divisor(100,120);
//		II.find_least_common_multiple(4,10);
//		II.Learn_while_break();
		int no=5;
		while(no>=1) { //5>=1,4>=1, 3>=1,2,1
		II.find_factorial(); 
		no--;//4,3,2,1
		}
//		II.print_1_10();
	}

	private void print_1_10() {
		// TODO Auto-generated method stub
		int no1 = 1, no2 = 10; 
		while(no1<=5)
		{
		System.out.println(no1 * no2);  
		no1 = no1 + 1; 
		no2 = no2 - 1; 
		}
		
	}

	private void find_factorial() {
		// TODO Auto-generated method stub
		int fact = 1;// mul
		int no=5;// input 3=1*3=3,3*2=6
		while(no>=1) { //5>=1,4,3
			fact = fact * no;//1*5=5*4=20*3=60*2=120;1*4=4,4*2=8*3=24*4=96
			//3*2=6,6*3=18;2*2=4
			no--;//5-1=4;3,
		}
		System.out.println(no+"! = "+fact);//5!=120,4!=96,3!=6,2!=4,1!=1
		
	}

	private void Learn_while_break() {
		// TODO Auto-generated method stub
		int no1=  10;
		int no2 = 12;
		int no = 1;
		while(true) {
			
			System.out.println("HI");
			no++;
			if(no==5)
			break;
		}
		
	}

	private void find_least_common_multiple(int no1, int no2) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub
		  int div = 2; 
		  int big = no1>no2?no1:no2;
		  while(true) {
		  if(big%no1 ==0 && big%no2==0)
		  {
		    System.out.println("LCM is "+ big);
		    break;
		  }
		  big = big+1; 
		  }
	}

	private void find_greatest_common_divisor(int no1, int no2) {
		// TODO Auto-generated method stub
		 int div = 2; int gcd = 0; 
		  int small = no1 < no2 ? no1: no2; 
		  while(div<small)
		  {
		    if(no1%div==0 && no2%div==0)
		    {
		      gcd = div; 
		    }
		    div = div +1; 
		  }
		  System.out.println("GCD is "+ gcd);
		
	}

	private void find_common_divisors(int no1, int no2) {
		// TODO Auto-generated method stub
//		int small =0;
//		if(no1<no2)
//	      small = no1;
//		else
//			small = no2;
		
		int div =2;
//		int gcd =0;
		int small = no1<no2?no1:no2;
		
		while(div<small) {
			if(no1%div == 0 && no2%div ==0){
				System.out.println(div);
			}
			div=div+1;
		}
	}

	private void multiples_of_first_5_no(int no) {
		// TODO Auto-generated method stub
		int box=1;
		while(no<=5) {
			box=box*no;
			System.out.println(no);
			no++;
		}
	}

	private void print_first_10_even_no() {
		// TODO Auto-generated method stub
		int no =2;
		while(no<=10) {
			System.out.println(no);
			no=no+2;
		}
	}

	private void print_11111() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5) {
			System.out.println(1+" ");
			no++;
		}
	}

}
