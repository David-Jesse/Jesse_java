package project_java;
// Date class with constructors to validate and 
// initialize instance variables
public class Date {
	private int monthPeriod, dayWeek, yearTime;
	
	// instance variable that declares constructors
	
	public Date (int period, int week, int time)
	{
		monthPeriod = period;
		dayWeek = week;
		yearTime = time;
	}
	
	// method to set month
	public void setMonthPeriod(int period)
	{
		monthPeriod = period;
	} /// end of method
	
	//method to get month
	public int getMonthPeriod()
	{
		return monthPeriod;
	} // end method getMonth period
	
	// method to set day
	public void setDayWeek(int week)
	{
		dayWeek = week;
	} // end of method setDayWeek
	
	// method to set get day
	public int getDayWeek()
	{
		return dayWeek;
	} // end of get day method
	
	// method to set year
	public void setYearTime(int time)
	{
		yearTime = time;
	} // end of method
	
	// method to get year
	public int getYearTime()
	{
		return yearTime;
	} // end of method display year
	
	public void displayDate()
	{
		System.out.print(getDayWeek());
		System.out.print("/");
		System.out.print(getMonthPeriod());
		System.out.print("/");
		System.out.print(getYearTime());
	}
}
