public class Commission extends Hourly{
    double totalSales;
    double comRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate){
        super(eName, eAddress, ePhone, socSecNumber, rate );
        this.comRate = comRate;
    }

    public void addSales (double totalSales){
        this.totalSales += totalSales;
    }

    @Override
    public double pay(){
        double payment = super.pay() + (this.totalSales * comRate);
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }

}
