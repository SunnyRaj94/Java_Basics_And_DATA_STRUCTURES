package com.sunny.data_structure.balanced_paranthesis;
public class BalancedParanthesis<T>
{
	
	public static  void main(String[] args) {
		Stack stk = new Stack();
		System.out.println("Running for balanced Parenthesis");
		//char[] ch ="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)".toCharArray();
		char[] ch="()))))))))))".toCharArray();
		int i=0;int j=0;int p =0; int k=0;
		int count=0;
		while(i!=ch.length)
		{
			if (ch[i] == '(') 
				{
				stk.push('g');
				p++;
				}
			i++;
		}
		while(j!=ch.length&&p!=k)
		{
			if (ch[j] == ')')
				{
				stk.pop();
				k++;
				}
			j++;
		}
		if(stk.isEmpty()&&i==j)
		{
			System.out.println("Paranthesis is balamnced");
		}
		else System.out.println("Paranthesis not balanced");
		
	}
	
}
