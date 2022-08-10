public class LeapYear {
    public static void main(String[] args) {
        System.out.println("1900 nie jest, wynik metody: " +isLeap(1900));
        System.out.println("1999 nie jest, wynik metody: " +isLeap(1999));
        System.out.println("2000  jest, wynik metody: " +isLeap(2000));
        System.out.println("1992  jest, wynik metody: " +isLeap(1992));
    }

    public static boolean isLeap(int year) {
        if((year %4) ==  0) {
            if((year % 100)!=0) {
                return  true;
            }
            else if ((year %400)==0) {
                return true;
            }
        }
        return false;
    }
}