package Sortable;

public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
    
    public int getHireday() {
        return hireday;
    }

    public void setHireday(int hireday) {
        this.hireday = hireday;
    }

    public int getHiremonth() {
        return hiremonth;
    }

    public void setHiremonth(int hiremonth) {
        this.hiremonth = hiremonth;
    }

    public int getHireyear() {
        return hireyear;
    }

    public void setHireyear(int hireyear) {
        this.hireyear = hireyear;
    }

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public void print() {
        System.out.println(name + "\t" + salary + "\t" + getHireyear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int get(int year) {
        return 0;
    }

    
    public int compare(Sortable b){
        Employee eb = (Employee) b;
        if (salary<eb.salary) return -1;
        if (salary>eb.salary) return +1;
        return 0;
    }
       
}
