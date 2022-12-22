package banco;

import java.time.LocalDate;

class BirthDate {

   private int year, month, day;

   public BirthDate(int year, int month, int day) {
       setYear(year);
       setMonth(month);
       setDay(day);
   }

   public int getAge() {
       int currentYear = LocalDate.now().getYear();
       int currentMonth = LocalDate.now().getMonth().getValue();
       int currentDay = LocalDate.now().getDayOfMonth();

       // Birthday of person within the current year already over
       if (getMonth() > currentMonth ||
       getMonth() == currentMonth && getDay() >= currentDay) {
           return currentYear - getYear();
       }

       // Birthday of person within the current year not yet over
       else
           return currentYear - getYear() - 1;
   }

   public void setYear(int year) {
       if (year >= 1800 && year <= LocalDate.now().getYear())
           this.year = year;
       else
           throw new IllegalArgumentException("Illegal value");
   }

   public void setMonth(int month) {
       if (month >= 1 && month <= 12)
           this.month = month;
       else
           throw new IllegalArgumentException("Illegal value");
   }

   public void setDay(int day) {
       if (day >= 1 && day <= 31)
           this.day = day;
       else
           throw new IllegalArgumentException("Illegal value");
   }

   public int getYear() {
       return year;

   }
   public int getMonth() {
       return month;
   }

   public int getDay() {
       return day;
   }
}
