
package atividade3progamas;

import javax.swing.JOptionPane;

public class Pessoas {
    
    private String nome;
    private int idade, contribuicao;
    private char sex;
    private boolean sabeLerEscrever;
    private boolean possuiDocumentoIdentidade;

    public boolean isSabeLerEscrever() {
        return sabeLerEscrever;
    }

    public void setSabeLerEscrever(boolean sabeLerEscrever) {
        this.sabeLerEscrever = sabeLerEscrever;
    }

    public boolean isPossuiDocumentoIdentidade() {
        return possuiDocumentoIdentidade;
    }

    public void setPossuiDocumentoIdentidade(boolean possuiDocumentoIdentidade) {
        this.possuiDocumentoIdentidade = possuiDocumentoIdentidade;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(int contribuicao) {
        this.contribuicao = contribuicao;
    }
    
    
    
    public Pessoas(){
    
    }
    
    
    public void ValidaAposentacao(char sex, int idade, int contribuicao){
        
        if(sex == 'M'){
            if(idade >=65 && contribuicao >= 15){
                JOptionPane.showMessageDialog(null, "Aponsetadoria Validada, Pode ir para casa descansar com a Família !!!");
            }
            else if(contribuicao >= 35){
                JOptionPane.showMessageDialog(null, "Aponsetadoria Validada, Pode ir para casa descansar com a Família !!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Aposentadoria não Cantou, volte a trabalhar !!!");
            }
        }
        if(sex == 'F'){
            if(idade >=62 && contribuicao >= 15){
                JOptionPane.showMessageDialog(null, "Aponsetadoria Validada, Pode ir para casa descansar com a Família !!!");
            }
            else if(contribuicao >= 30){
                JOptionPane.showMessageDialog(null, "Aponsetadoria Validada, Pode ir para casa descansar com a Família !!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Aposentadoria não Cantou, volte a trabalhar !!!");
            }
        }
    }
    
     // Construtor
    public Pessoas(String nome, int idade, boolean sabeLerEscrever, boolean possuiDocumentoIdentidade) {
        this.nome = nome;
        this.idade = idade;
        this.sabeLerEscrever = sabeLerEscrever;
        this.possuiDocumentoIdentidade = possuiDocumentoIdentidade;
    }

    // Método principal de verificação
    public boolean podeTirarHabilitacao() {
        return atendeIdadeMinima() && sabeLerEscrever && possuiDocumentoIdentidade;
    }

    // Método auxiliar para verificar idade
    private boolean atendeIdadeMinima() {
        return idade >= 18;
    }

    // Método para obter relatório de impedimentos
    public String getRelatorioImpedimentos() {
        if (podeTirarHabilitacao()) {
            return nome + " está apto(a) a tirar a habilitação!";
        }

        StringBuilder impedimentos = new StringBuilder();
        impedimentos.append(nome).append(" não pode tirar a habilitação devido a:\n");
        
        if (!atendeIdadeMinima()) {
            impedimentos.append("- Idade insuficiente (mínimo 18 anos)\n");
        }
        if (!sabeLerEscrever) {
            impedimentos.append("- Não sabe ler e escrever\n");
        }
        if (!possuiDocumentoIdentidade) {
            impedimentos.append("- Não possui documento de identidade válido\n");
        }

        return impedimentos.toString();
    }
}
