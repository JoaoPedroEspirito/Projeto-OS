
package exercicio1_carla;

import javax.swing.JOptionPane;

public class Produto {
    
    private double aumento, valor;
    private int cod;
    
    public Produto(){
    
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setAumento(double aumento){
        this.aumento = aumento;
    }
    
    public double getValor(){
        return valor;
    }
    public double getAumento(){
        return aumento;
    }
    public int getCod(){
        return cod;
    }
    
    
    public void Calcular(){
        
        switch(cod){
            case 1:
                this.valor *= 1.15;
                break;
            case 3:
                this.valor *= 1.20;
                break;
            case 4:
                this.valor *= 1.35;
                break;
            case 8:
                this.valor *= 1.40;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Valor digitado ERRADO !");
                break;
        }
    }
    
    public void Imprimir(){
        JOptionPane.showMessageDialog(null,"O novo valor do Produto ficou: " + getValor());
        
    }

}
