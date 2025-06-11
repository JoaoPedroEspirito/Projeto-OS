
package atividade3progamas;

import javax.swing.JOptionPane;

public class Atividade3progamas {

    public static void main(String[] args) {
        
        try {
            // Coleta de dados do usuário
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            
            int idade = Integer.parseInt(
                    
                JOptionPane.showInputDialog("Digite sua idade:")
            );
            
            boolean sabeLerEscrever = JOptionPane.showConfirmDialog(
                null, "Você sabe ler e escrever?", "Confirmação", 
                JOptionPane.YES_NO_OPTION
            ) == JOptionPane.YES_OPTION;
            
            boolean possuiDocumento = JOptionPane.showConfirmDialog(
                null, "Você possui documento de identidade válido?", "Confirmação",
                JOptionPane.YES_NO_OPTION
            ) == JOptionPane.YES_OPTION;

            // Criação do objeto Pessoa
            Pessoas candidato = new Pessoas (nome, idade, sabeLerEscrever, possuiDocumento);

            // Exibição do resultado
            JOptionPane.showMessageDialog(
                null, 
                candidato.getRelatorioImpedimentos(),
                "Resultado da Verificação",
                JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Idade deve ser um número válido!",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
}
