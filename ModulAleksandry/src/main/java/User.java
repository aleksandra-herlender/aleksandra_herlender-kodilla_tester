public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        User[] users = new User[8];
        for (int index=0;index<8;index++){
            users[index] = new User("Karol "+index,index+15);
        }

        double sum = 0.0;
        for(int i=0; i < 8;i++){
            sum=sum+users[i].age;
        }
        double average = sum/8;

        for (int index=0;index<8;index++){
            if(users[index].age<average){
                System.out.println(users[index].name);
            }
        }
    }
}
