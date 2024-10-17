
import javax.swing.JOptionPane;


public class Text2 {
    public static void main(String[] args) {
        
      int choice =  JOptionPane.showConfirmDialog(null,"Do you went to quit","Title", JOptionPane.YES_NO_CANCEL_OPTION,2);
      if (choice == JOptionPane.YES_OPTION)
      {
          System.exit(0);
      }
      else 
      {
          System.out.println("WOW");
      }
    }
         
}
