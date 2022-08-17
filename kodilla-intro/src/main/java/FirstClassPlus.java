public class FirstClassPlus {
    public static void main(String[] args) {

        
        Breslau breslau = new Breslau();
        System.out.println(breslau);
        Badenia badenia = new Badenia();
        System.out.println(badenia);



        Notebook notebook = new Notebook(100, 20, 2020);
        Notebook notebook1 = new Notebook(700, 700, 2021);
        Notebook heavynotebook = new Notebook(2000, 2999, 2022);
        Notebook oldNotebook = new Notebook(1200, 1999, 1999);

              notebook1.checkPrice();


              oldNotebook.checkPrice();
              heavynotebook.checkPrice();
              notebook.checkPrice();

              notebook1.checkWeight();
              notebook.checkWeight();
              oldNotebook.checkWeight();
              heavynotebook.checkWeight();

              notebook1.checkPriseAndYear();
              oldNotebook.checkPriseAndYear();

        System.out.println(heavynotebook.weight + heavynotebook.price);
        System.out.println(heavynotebook.weight + " " + heavynotebook.price);
         System.out.println(oldNotebook.weight);

        System.out.println(notebook);
        System.out.println(notebook.weight);
        System.out.println(notebook1.weight);



       
       




    }

}