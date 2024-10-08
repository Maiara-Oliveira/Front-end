import javax.swing.*;

public class ListTest 
{ // inicio do bloco de codigos da classe
   public static void main(String[] args) // declaração da exportação - string=matriz de texto
   { 
      ListFrame listFrame = new ListFrame(); // create ListFrame
      listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      listFrame.setSize(350, 150); // defnir tamanho e largura
      listFrame.setVisible(true); // definir a visibilidade
   } 
} 
