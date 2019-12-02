package com.sunny.data_structure.balanced_paranthesis;
public class BalancedParanthesis<T>
{
	
	public static  void main(String[] args) {
		Stack stk = new Stack();
		System.out.println("Running for balanced Parenthesis");
		char[] ch ="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)".toCharArray();
		int i=0;
		int count=0;
		while (i!=ch.length) 
		{
			if (ch[i] == '(') 
				{count++;
				} 
				
				if (ch[i] == ')') 
				{
					count--;
				}
				i++;
			} 
		if(count==0) System.out.println("Paranthesis is Balanced");
		else System.out.println("paranthesis is not Balanced");
		stk.display();
	}
	
}
