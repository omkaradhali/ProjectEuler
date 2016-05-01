/**
 * Created by omkaradhali on 5/1/16.
 */
public class ProblemFive {

    public static void main(String args[]){

        int i = 1;
        boolean firstMatch = true;
        while(firstMatch){
            if(checkForDivisibility(i)){
                System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is:"+i);
                firstMatch = false;
            } else {
                i++;
            }

        }


    }

    public static boolean checkForDivisibility(int num){
        boolean match = false;
        for(int i = 1;i<=20;i++){
            if(num % i == 0){
                continue;
            } else {
                match = true;
            }
        }
        if(match == true){
            return false;
        } else {
            return true;
        }
    }
}
