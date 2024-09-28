package week3;

public class TheDataClass {
    private int year;
    private int month;
    private int day;
    public TheDataClass(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setTheDateClass(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    public static void main(String[] args) {
        TheDataClass date = new TheDataClass(2024, 9, 17);
        date.setDay(2024);
        date.setMonth(9);
        date.setDay(17);
        System.out.println(date);
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }
}
