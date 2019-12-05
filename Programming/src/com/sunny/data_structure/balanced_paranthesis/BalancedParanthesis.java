package com.sunny.data_structure.balanced_paranthesis;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to find  if parenthesis are balanced in the given expression or not
**/

public class BalancedParanthesis<T>
{
	
	public static  void main(String[] args) {
		Stack stk = new Stack();
		System.out.println("Running for balanced Parenthesis");
		//char[] ch ="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)".toCharArray();
		char[] ch="()))))))))))".toCharArray();
		int i=0;int j=0;int p =0; int k=0;
		int count=0;
		// to push value into stack
		while(i!=ch.length)
		{
			if (ch[i] == '(') 
				{
				stk.push('g');
				p++;
				}
			i++;
		}
		//to pop value from stack
		while(j!=ch.length&&p!=k)
		{
			if (ch[j] == ')')
				{
				stk.pop();
				k++;
				}
			j++;
		}
		//checking if stack is empty or not
		if(stk.isEmpty()&&i==j)
		{
			System.out.println("Paranthesis is balamnced");
		}
		else System.out.println("Paranthesis not balanced");
		
	}
	
}
