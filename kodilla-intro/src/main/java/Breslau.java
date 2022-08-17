public class Breslau {

    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!"); //
        Badenia badenia = new Badenia();
        System.out.println(badenia);

        Dresden drezno = new Dresden(5000000);
        Dresden drezno1 = new Dresden(280000);
        Dresden drezno2 = new Dresden(4000);
        Dresden drezno3 = new Dresden(100000);


        System.out.println(drezno);

        System.out.println(drezno.cityPopulation);
        System.out.println(drezno.peopleAge);


    }


}
