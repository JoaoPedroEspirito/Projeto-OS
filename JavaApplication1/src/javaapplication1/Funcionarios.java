
package javaapplication1;

import javax.swing.JOptionPane;

public class Funcionarios {
    
    private String nome, cargo;
    private int num, idade;
    private double sal;
    
    public Funcionarios(){
    
    }
    
    public void setAll(String nome, String cargo, int num, int idade, double sal){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.num = num;
        this.sal = sal;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    
    public void setIdade(int idade){
      
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setSal(double sal){
        //se o salario <=1500 ganha um bonus de 200
        if(sal <= 1500){
            sal += 200;
            this.sal = sal;
            JOptionPane.showMessageDialog(null, "Você ganhou um Bonus Salarial de 200 reais, seu novo salário:" + sal);
        }
    }
    public double getSal(){
        return sal;
    }
}
