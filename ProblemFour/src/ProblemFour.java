import java.util.ArrayList;
import java.util.List;

/**
 * Created by omkaradhali on 4/27/16.
 */
public class ProblemFour {

    public static void main (String args[]){
        int result= 0 ;
        int temp;
        int temp2;
        for(int i = 100;i<1000;i++){
            temp = i*i;
            if(checkForPalindrome(temp)){
                if(temp>result){
                    result = temp;
                }
            }
            for(int j = i+1;j<1000;j++){
                temp2 = i*j;
                if(checkForPalindrome(temp2)){
                    if(temp2>result){
                        result = temp2;
                    }
                }
            }
        }
        System.out.println("the biggest palindrome is :"+result);
    }

    private static boolean checkForPalindrome(int temp) {
        int temp1 = temp;
        int i;
        boolean isPalindrome = true;
        List<Integer> sortedDigits = new ArrayList<Integer>();
        for( i = 1; temp1>0; i++){
            sortedDigits.add(temp1%10);
            temp1 = temp1/10;
        }
        for(int k = 0;k<sortedDigits.size();k++){
            if(sortedDigits.get(k) == sortedDigits.get((sortedDigits.size() -1)-k) ){
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            return true;
        } else {
            return false;
        }

    }
}
