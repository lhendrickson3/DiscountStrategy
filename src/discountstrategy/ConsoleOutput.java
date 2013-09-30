package discountstrategy;

/**
 *
 * @author User
 */
public class ConsoleOutput implements OutputStrategy{
    
        public void getOutput(String output){
            System.out.println(output);
        }
}
