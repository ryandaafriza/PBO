package Kasus1;

import java.text.DecimalFormat;

public class Commission extends Hourly{
    double totalsales;
    double commissionrate;

    DecimalFormat Decimal = new DecimalFormat();

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        totalsales = 0;
        Decimal.format(commission);
    }

    public void addSales(double totalSales){
        totalsales = totalSales;
    }

    @Override
    public double pay(){
        double payment = super.pay() + (totalsales * commissionrate) ;
        totalsales = 0;

        return payment;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += "\nCommission: " + pay();
        return result;
    }
}
