public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight=weight;
        this.price=price;
        this.year=year;
    }
    public void checkPrice() {
        if(this.price<600){
            System.out.println("This notebook is very cheap");
        } else if (this.price >=600 && this.price<=1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is quite expensive");
        }
    }


    public void checkWeight() {
        if(this.weight<600){
            System.out.println("This notebook is very light");
        } else if (this.weight >=600 && this.weight<=1000) {
            System.out.println("This notebook is moderate");
        } else {
            System.out.println("This notebook is quite heavy");
        }
    }


    public void checkPriseAndYear() {
        if(this.price<600 && this.year>2021){
            System.out.println("This notebook is very cheap and new");
        } else if (this.price >=600 && this.year<2020) {
            System.out.println("This notebook is expensive and old");
        } else {
            System.out.println("This notebook is good");
        }
    }
}

