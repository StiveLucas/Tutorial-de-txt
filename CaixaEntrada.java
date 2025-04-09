import javax.swing.JOptionPane;

public class CaixaEntrada {

    //Lembrese que não funciona no codspace apenas no vcCode.
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Olá "+ nome+ "!", "Saudação", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
