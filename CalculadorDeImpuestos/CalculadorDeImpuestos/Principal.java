import javax.swing.SwingUtilities;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String []args){
        SwingUtilities.invokeLater(new Runnable()
            {
                public void run(){
                    new JFCalculador();    
                
            }
        });
    }
    
}