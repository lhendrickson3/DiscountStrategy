package discountstrategy;

/**
 *
 * @author User
 */
public class ConsoleOutput implements OutputStrategy{
    
        public String getOutput(String output){
            System.out.println(output);
        }
}
