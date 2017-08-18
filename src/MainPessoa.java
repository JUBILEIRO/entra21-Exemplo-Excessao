
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class MainPessoa {
    
    public static void main(String[] args){
        
        Pessoa angela = new Pessoa();
        try{
        angela.setNome  ("Angela");
        angela.setIdade (15);
        angela.setSalario (100000);
        }catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        System.out.println("Nome: " + angela.getNome());
        System.out.println("Idade: " + angela.getIdade());
        System.out.println("Salário: " + angela.getSalario());
        
        System.out.println(angela.toString());
    }
    
}
