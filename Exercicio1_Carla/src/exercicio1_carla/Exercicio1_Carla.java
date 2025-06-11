
package exercicio1_carla;

import javax.swing.JOptionPane;

public class Exercicio1_Carla {

    public static void main(String[] args) {
        
        Produto prod = new Produto();
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Produto: "));
        int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Código: "));
        
        prod.setValor(valor);
        prod.setCod(cod);
        
        prod.Calcular();
        prod.Imprimir();
        
    }
    
}
