import java.util.Random;

public class RandomNumbers {
    private int minValue=10000;
    private int maxValue=0;

    public int readMin(){
        return minValue;
    }

    public int readMax(){
        return maxValue;
    }

    public void takeWhile5000(){
        Random random = new Random();
        int sum=0;
        while (sum <5000){
            int value = random.nextInt(0,31);
            if(value<minValue){
                minValue=value;
            }
            if(value>maxValue){
                maxValue=value;
            }
            sum=sum+value;
            System.out.println("liczba: "+value+"; suma="+sum);
       }
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers =new RandomNumbers();
        randomNumbers.takeWhile5000();
        System.out.println("min: "+randomNumbers.readMin());

        System.out.println("max: "+randomNumbers.readMax());
    }
}
