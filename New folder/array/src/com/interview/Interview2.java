package com.interview;

import java.util.Scanner;

public class Interview2 {

	static int age;

	public Interview2(int initial_age){
		if(initial_age>0){
			age=initial_age;
		}else{
			age=0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
	public void yearPasses(){
		age=age+1;
	}
	public void amIOld(){
		if(age<13){
			System.out.println("You are young.");
		} else if(age>=13 &&age<18){
			System.out.println("You are a teenager."); 
		}else {
			System.out.println("You are old.") ;
		}

	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		Interview2 s=new Interview2(age);
		s.yearPasses();
		s.amIOld();
	}  
}


