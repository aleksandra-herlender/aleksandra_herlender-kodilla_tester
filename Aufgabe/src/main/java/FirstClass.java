import javax.sound.midi.Soundbank;

public class FirstClass {
    public void main(String[] args) {

        Notebook notebook = new Notebook(400, 6000, 5, "Olaf");
        System.out.println(notebook);

        System.out.println(notebook.weight);

        Notebook notebook1 = new Notebook(500,50000, 1, "Kot");
        Notebook notebook2 = new Notebook(400, 40000, 2, "Katze");
        Notebook notebook3 = new Notebook(400, 70000, 4, "Asus ");
        Notebook notebook4 = new Notebook(200, 4000, 9, "HP");
        Notebook notebook5 = new Notebook(200, 100000, 1, "Asus");
        Notebook heavyNotebook = new Notebook(20, 2, 10, "Pan");
        Notebook oldNotebook = new Notebook(2000, 1, 20, "Jan");

        System.out.println(notebook1.weight + "," + notebook1.price + "," + notebook1.age + "," + notebook1.name);
        System.out.println(notebook2.weight + "," + notebook2.price + "," + notebook2.age + "," + notebook2.name);
        System.out.println(notebook3.weight + "," + notebook3.price + "," + notebook3.age + "," + notebook3.name);
        System.out.println(notebook4.weight + "," + notebook4.price + "," + notebook4.age + "," + notebook4.name);
        System.out.println(notebook5.weight + "," + notebook5.price + "," + notebook5.age + "," + notebook5.name);
        System.out.println(heavyNotebook.weight + "," + heavyNotebook.price + "," + heavyNotebook.age + "," + heavyNotebook.name);









    }
}
