
package activity_labanonnable;

import static activity_labanonnable.Activity_LabanonNable.result;
public class NewClass {
    
    public void mean(double[] numbers){
        double total = 0;
        result = numbers[0];
            for(int j=1;j<numbers.length;j++){
                result+=numbers[j];
                total = result/numbers.length;
            }
        System.out.print("Mean: "+ total);
    }
}
