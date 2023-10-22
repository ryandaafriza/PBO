package Kasus3;

public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Salesperson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
    }

    public int compareTo(Object other){
        Salesperson otherSalesperson = (Salesperson) other;
        if (this.totalSales > otherSalesperson.totalSales) {
            return -1;
        } else if (this.totalSales < otherSalesperson.totalSales) {
            return 1;
        } else {
            return otherSalesperson.lastName.compareTo(this.lastName);
        }
    }

    public int getSales(){
        return totalSales;
    }
}
