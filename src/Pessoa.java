/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
/**
 * Ctrl + F
 * Ctrl + H
 */
public class Pessoa {
    public  String nome;
    public  int idade;
    public  double salario;
    
    public void setNome(String nome) throws IllegalArgumentException{
        if(nome == null){
            throw new NullPointerException("O nome não pode ser nulo");
        }
        if(nome.trim().equals("")){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        if(idade < 0){
            throw new IllegalArgumentException("Número não pode ser menor que zero");
        }
        if(idade > 150){
            throw new IllegalArgumentException("Número não pode ser maior que 150");
        }
        this.idade = idade;     
    }
    public int getIdade(){
        return idade;
    }
    
    public void setSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException("O salário não pode ser menor que zero");
        }
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    
    
   @Override
    public  String toString(){
       return nome + " - " + idade + " - R$ " + salario;
       
    }
    
}
