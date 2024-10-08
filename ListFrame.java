import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListFrame extends JFrame // declaração de classe/ list frame =nome do arquivo que vai ser exportado/ JFrame= herança-janela
{
   private final JList<String> colorJList; // 
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow"};
   private static final Color[] colors = {Color.BLACK, Color.BLUE,
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW};

   public ListFrame()
   { // inicio di bloco de ccodigos
      super("List Test"); // titulo
      setLayout(new FlowLayout()); 

      colorJList = new JList<String>(colorNames); 
      colorJList.setVisibleRowCount(5); // definição da quantidade de linhas visiveis
      
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      add(new JScrollPane(colorJList)); // novo objeto do tipo JScrollPane

      colorJList.addListSelectionListener(
         new ListSelectionListener() // 
         {   
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
               getContentPane().setBackground(
                  colors[colorJList.getSelectedIndex()]);
            } 
         } 
      ); 
   } 
}