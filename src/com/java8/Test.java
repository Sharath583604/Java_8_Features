package com.java8;
@FunctionalInterface
 interface Demo {
	void calculate(int a);

}
 class Test{
	public static void main(String[] args) {
		
		Demo2 d=new Demo2() {  
			@Override
			public void calculate(int a) {
			int 	sum=0;
			sum=sum+a;
				System.out.println(sum);
			}	
		};
		d.calculate(20);
		Demo2 d1=(a)->{ int s=0;
		s=s+a;
		System.out.println(s);
			
		};
		d1.calculate(30);
	}
}