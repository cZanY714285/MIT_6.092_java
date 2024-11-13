// mit_java_6.092 : Assignment 2
public class FooCorporation{
    public static  void paycal(int hours,double basepay){
        // If the number of hours is greater than 60, print an error message
        if (hours > 60){
            System.out.println("error: working hours should be less than 60");
        }else if (basepay < 8){
            // The base pay must not be less than the minimum wage ($8.00 an hour). If it is, print an error.
            System.out.println("error: basepay should be greater than 8");
        }else {
            double pay =0;
            // An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
            pay =basepay * hours;
            if (hours <= 40){
                System.out.println(pay);
            }else{
                // For every hour over 40, they get overtime = (base pay) × 1.5.
                pay += basepay * (hours -40) *0.5;
                System.out.println(pay);
            }
        }
    }
    public static void main(String[] args){
        paycal(35,7.5);
        paycal(47,8.2);
        paycal(73,10);
    }
}
