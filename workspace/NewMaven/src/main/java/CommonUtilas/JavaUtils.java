package CommonUtilas;

import java.util.Random;

public class JavaUtils {

	public int  getrandomnumber() {
    Random r= new Random();
    int ran=r.nextInt(10);
    return ran;
    

}
}