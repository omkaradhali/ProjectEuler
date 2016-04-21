/**
 * Created by omkaradhali on 4/20/16.
 */
public class ProblemOne {

    public static void main(String[] args) {
        int result = 0;
        for(int i = 1;i< 1000;i++){
            if(i%3 == 0){
                result = result+i;
            } else if(i%5 == 0){
                result = result + i;
            }
        }
        System.out.println("The answer is :"+result);
    }
}
