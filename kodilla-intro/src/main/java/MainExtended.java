public class MainExtended {
    public static void main(String[] args) {
        String cityName = "Dresden";
        String countryName = "Germany";
        int peopleAge = 22;
        int girlAge = 18;
        double girlHeight = 1.76;
        boolean girlAreCheerful = true;
        System.out.println(cityName);
        System.out.println(countryName);
        System.out.println(girlAge);
        String meinDeutsch = sayHello();
        System.out.println(meinDeutsch);
    }

    private static String sayHello() {
        String text = "Hallo mein Deutsch";

        return text;
    }

}