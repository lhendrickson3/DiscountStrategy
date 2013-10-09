/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author User
 */
public class OutputFactory {
    public static enum OutputStrategies {
        CONSOLE, GUI;
    }
    
    private static OutputFactory instance;
        
     public static OutputFactory getInstance() {
         if(instance == null) {
            instance = new OutputFactory();
         }
         return instance;
    }

    public OutputStrategy getOutput(OutputStrategies outputType) {
        OutputStrategy o = null;
        
        switch(outputType) {
            case CONSOLE:
                o = new ConsoleOutput();
                break;
            case GUI:
                o = new GUIOutput();
                break;
        }
        
        return o;
    }
}
