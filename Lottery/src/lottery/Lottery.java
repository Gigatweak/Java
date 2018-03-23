package lottery;

/*Lottery program that picks 4 random numbers between 1-9. 
If there are duplicates it needs to run till there are no duplicates and 
you need to keep track of the times it took to get it run successfully with no duplicate numbers. */

public class Lottery {

    public static void main(String[] args) {
    	//Begin variable section
	//Counter variable
        int i = 1;
	//Variable for 1st random number
        int a;
	//Variable for 2nd random number
        int b;
	//Variable for 3rd random number
        int c;
	//Variable for 4th random number
        int d;

	//Assign variables to random numbers
        a = getRandomInteger(9,1);
        b = getRandomInteger(9,1);
        c = getRandomInteger(9,1);
        d = getRandomInteger(9,1);
  
	//Print statement of 1st try
        System.out.println("Lottery #1 is " + a +
                               "\nLottery #2 is " + b +
                               "\nLottery #3 is " + c + 
                               "\nLottery #4 is " + d +
                               "\nHow many tries? " + (i));
        
	//While loop if 1st try fails
        while(a==b || a==c || a==d || b==c || b==d || c==d){
            a = getRandomInteger(9,1);
            b = getRandomInteger(9,1);
            c = getRandomInteger(9,1);
            d = getRandomInteger(9,1);
            i++;
            
	    //Same print statement as 1st print statement
            System.out.println("\nLottery #1 is " + a +
                               "\nLottery #2 is " + b +
                               "\nLottery #3 is " + c + 
                               "\nLottery #4 is " + d +
                               "\nHow many tries? " + (i));
        }
    }
    //getRandomInteger constructor
    //This constructor generates a random number between 2 values which are declared at call
    public static int getRandomInteger(int max, int min){
        return ((int) (Math.random()*(max - min))) + min;
    }
}
