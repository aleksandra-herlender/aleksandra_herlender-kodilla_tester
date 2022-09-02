import javax.sound.midi.Soundbank;

public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(400, 6000, 5);
        System.out.println(notebook);

        System.out.println(notebook.weight);

        Notebook notebook1 = new Notebook(500,50000, 1);
        Notebook notebook2 = new Notebook(400, 40000, 2);
        Notebook notebook3 = new Notebook(400, 70000, 4);

        System.out.println(notebook1.weight + "," + notebook1.price + "," + notebook1.age);
        System.out.println(notebook3.weight + "," + notebook3.price + "," + notebook1.age);










    }
}
