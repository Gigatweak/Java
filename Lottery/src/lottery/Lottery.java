package lottery;

public class Lottery {

    public static void main(String[] args) {
    
        int i = 1;
        int a;
        int b;
        int c;
        int d;

        a = getRandomInteger(9,1);
        b = getRandomInteger(9,1);
        c = getRandomInteger(9,1);
        d = getRandomInteger(9,1);
  
        System.out.println("Lottery #1 is " + a +
                               "\nLottery #2 is " + b +
                               "\nLottery #3 is " + c + 
                               "\nLottery #4 is " + d +
                               "\nHow many tries? " + (i));
        
        while(a==b || a==c || a==d || b==c || b==d || c==d){
            a = getRandomInteger(9,1);
            b = getRandomInteger(9,1);
            c = getRandomInteger(9,1);
            d = getRandomInteger(9,1);
            i++;
            
            System.out.println("\nLottery #1 is " + a +
                               "\nLottery #2 is " + b +
                               "\nLottery #3 is " + c + 
                               "\nLottery #4 is " + d +
                               "\nHow many tries? " + (i));
        }
    }
    public static int getRandomInteger(int max, int min){
        return ((int) (Math.random()*(max - min))) + min;
    }
}
