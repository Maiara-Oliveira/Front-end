import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame 
{ // inicia o bloco de codigos da classe ButtonFrame 
   private final JButton plainJButton; 
   private final JButton fancyJButton; 
// declaração de variavel 
   
   public ButtonFrame()
   { 
      super("Testing Buttons"); // definir o titulo 
      setLayout(new FlowLayout());  // definir o layout

      plainJButton = new JButton("Plain Button"); 
      add(plainJButton); 

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));  //  declarando a variavel
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif")); 
      fancyJButton = new JButton("Fancy Button", bug1); 
      fancyJButton.setRolloverIcon(bug2);
      add(fancyJButton); 

      ButtonHandler handler = new ButtonHandler();
      fancyJButton.addActionListener(handler); // executar a operaçao manual
      plainJButton.addActionListener(handler);
   }

   private class ButtonHandler implements ActionListener 
   {
      @Override
      public void actionPerformed(ActionEvent event)
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "You pressed: %s", event.getActionCommand()));
      }
   } 
} 
