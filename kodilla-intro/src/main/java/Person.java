public class Person {

    private String name;
    private double age;
    private double height;

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printPersonInfo() {
        if (this.getName() != null) {
            if (this.getAge() > 30 && this.getHeight() > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }

        }
    }

}
