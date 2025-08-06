package com.java8;
interface PaymentServices{
	void makePayment();
	 //Hello
}
class DebitPaymentServices{
	
	void makePaymentDebitServices(){
		System.out.println("Payment Successfull using Debit card");
	}
	
}


public class MethodReferencing {
	public static void main(String[] args) {
		DebitPaymentServices dc=new DebitPaymentServices();
		PaymentServices ps=dc::makePaymentDebitServices;
		
		ps.makePayment();
		PaymentServices ps1=()->System.out.println("Payment Successfull using credit card");
		ps1.makePayment();
	}

}
