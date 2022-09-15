public class Grades {

    private int[]  grades = new int[10];
    private int size = 0;
    private int sum;


    public void add (int value) {
        this.grades[this.size] = value;
        this.sum=this.sum+value;
        this.size=this.size+1;
    }

    public int last(){
        return this.grades[this.size-1];
    }

    public double average(){
        return 1.0*this.sum/this.size;
    }

}
