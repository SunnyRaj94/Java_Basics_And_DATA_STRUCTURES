package com.sunny.data_structure.calender;

public class Calender 
{
	Utility u = new Utility();
	char[] days = { 'S', 'M', 'T', 'W', 'T', 'F', 'S' };
	int[][] calender = new int[6][7];

	public Calender() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				calender[i][j] = -10;
			}
		}
	}

	public void displayCalender() {
		for(int i=0;i<7;i++)
		{
			System.out.print(days[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (calender[i][j] == -10) 
					System.out.print(' ' + " ");
					else
						System.out.print(calender[i][j] +" ");
			}
			System.out.println();
			System.out.println("- - - - - - - - - - - -");
		}
	}
	
	public void playCalender()
	{
		int year=u.inputYear();
		int month= u.inputMonth();
		//int date= u.inputDate(month, year);
		int res =u.dayOfWeek(1, month, year);
		int value = 1;
		int maxval = u.value(month-1);
		for(int i= res;i<7;i++)
		{
			calender[0][i]=value++;
		}
		for(int i=1;i<6;i++)
		{
			for(int j =0;j<7&&value<=maxval;j++)
			{
				calender[i][j]=value++;
			}
		}
	}

	public static void main(String[] args) 
	{
		Calender c = new Calender();
		c.playCalender();
		c.displayCalender();
	}
}