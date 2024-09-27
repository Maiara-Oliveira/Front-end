import java.awt.FlowLayout; // importando...
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{ // inicio do bloco de codigos da classe CheckBoxFrame
   private final JTextField textField; 
   private final JCheckBox boldJCheckBox; 
   private final JCheckBox italicJCheckBox; 

   public CheckBoxFrame() // exportando o construtor
   {
      super("JCheckBox Test"); // definior o titulo superior
      setLayout(new FlowLayout());

      textField = new JTextField("Watch the font style change", 20);
      textField.setFont(new Font("Serif", Font.PLAIN, 14));
      add(textField); // adicionando 

      boldJCheckBox = new JCheckBox("Bold"); 
      italicJCheckBox = new JCheckBox("Italic"); 
      add(boldJCheckBox); 
      add(italicJCheckBox); 

   
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener(handler);
      italicJCheckBox.addItemListener(handler);
   } 

   private class CheckBoxHandler implements ItemListener 
   {
   
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         Font font = null; 

         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
         else
            font = new Font("Serif", Font.PLAIN, 14);

         textField.setFont(font); 
      } 
   }
} 
