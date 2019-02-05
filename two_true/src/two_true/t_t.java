package two_true;
import java.util.Scanner;

public class t_t {
	public static void main(String args[])
    {
       int count=0;
       Scanner input = new Scanner (System.in);
       System.out.println("input 4 psc boolean number (true or false),"
       		+ " pressing enter after each number");
       boolean booleanArray[ ] = new boolean[4];
       for(int i=0;i<booleanArray.length;i++) {
    	   booleanArray[i]=input.nextBoolean();
       }
          
        for(int z = 0; z < booleanArray.length; z++) {
            if (booleanArray[z] == true) {
            ++count;
            }
        }
        if (count==2) {
             System.out.println("in array 2 psc. true");        
        }
        else{
            System.out.println("in array not 2 psc. true");
        }
    }

}
