public class Main {
    public static void main(String[] args) {
        String myName = "Maciej";
        int myAge = 22;
        double height = 1.78;
        char carClass = 'A';
        boolean isGoodProgrammer = true;
        System.out.println(myName);

        Grades grades = new Grades();
        grades.add(3);
        System.out.println(grades.last());
        grades.add(4);
        System.out.println(grades.last());
        grades.add(6);
        System.out.println(grades.last());
        grades.add(6);
        System.out.println(grades.last());
        grades.add(5);
        System.out.println(grades.last());
        grades.add(4);
        System.out.println(grades.last());
        System.out.println("average="+grades.average());

        for (int age = 6;age<12;age=age+1){
            System.out.println(age);
        }
    }

}
