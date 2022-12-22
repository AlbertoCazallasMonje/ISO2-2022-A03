package ISOA03_2022.Problem1;


public class Date {

     int day;
     int month;
  	 int year;

  	public Date(int day, int month, int year) throws DateException {
  		
  			this.day = day;
  			this.month = month;
  			this.year = year;
  		
    }
   	 
  	public void setDay(int day) {
  		this.day = day;  		

  	}
  	
  	public void setMonth(int month) {
  		this.month = month;
  	}
  	
  	public void setYear(int year) {
  		this.year = year;
  	}
 	  
  	public int getDay() {
  		return day;
  	}
 	
  	public int getMonth() {
     	return month;
  	}
 	 
  	public int getYear() {
  	    return year;
  	}

    boolean isLeap() throws DateException {
    	
    	boolean leap = false; 
    	
    	if (this.day<1 || this.day>31) {
	  		throw new DateException("Day lower than 1 or bigger than 31");
	  	} else if (month<1 || month>12) {
	  		throw new DateException("Month lower than 1 or bigger than 12");
	  	} else if (year<0) {
	  		throw new DateException("Year lower or equal to 0");
	  	} else  if (month == 2 && day > 28 && !isLeap()) {
	  		throw new DateException("February has more than 28 days");
	  	}  else if ((month == 4 || month == 6 || month == 9 || month == 1) && day > 30) {
	  		throw new DateException("Month number "+month+ " has 30 days");
	  	} else {
	  		if ((year % 4 == 0) && (year %  100 != 0) || (year % 400 == 0)){
				leap = true;
			}
	  	}
		return leap;
     }
    
 
}
