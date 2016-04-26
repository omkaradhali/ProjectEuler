/**
 * Created by omkaradhali on 4/25/16.
 */
public class ProblemThree {

    public static void main(String args[]){

        long  num = 600851475143L;
        int sqrtNum = (int)(Math.sqrt(num)+1);

        for(int k = sqrtNum; k>0; k--){
            if(num%k == 0){
                if(checkForPrime(k)){

                    System.out.println("the answer is as follows :"+k);
                }
            }
        }
    }

    public static boolean checkForPrime(int num){
        if(num<2){
            return false;
        }
        else if(num == 2){
            return true;
        }
        else {
            for(int k = 3; k<=(int)(Math.sqrt(num)+1);k++){
                if(num%k == 0){
                    return false;
                }

            }
            return true;
        }
    }
}
