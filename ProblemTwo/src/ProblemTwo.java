/**
 * Created by omkaradhali on 4/20/16.
 */
public class ProblemTwo {
    public static void main(String args[]){
        int counter = 0;
        int temp;
        int result = 2;
        int currentNumber = 2;
        int previousNumber = 1;
        int Sum = currentNumber+previousNumber;
        for(counter = 1;counter<=3999998;counter++){
            //System.out.println("Current Number :"+currentNumber+" Previous Number :"+previousNumber+" Sum :"+Sum);
            temp = currentNumber;
            currentNumber = Sum;
            previousNumber = temp;
            Sum = currentNumber+previousNumber;

            if(Sum%2 == 0){
                //System.out.println(Sum);
                result = result +Sum;
            }
            if(Sum >= 4000000){
                break;
            }
        }
        System.out.println("The result is   :"+result);
    }
}
