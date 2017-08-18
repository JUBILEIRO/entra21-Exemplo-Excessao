/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Cachorro {
    public static int TAMANHO_GORDO = 1,
                    TAMANHO_MAGRO = 2,
                    TAMANHO_MEIO_MEIO = 3,
                    TAMANHO_GORDO_EXTREMO = 4,
                    TAMANHO_MAGRO_EXTREMO = 5;
    
    private int quantidadePatas;
    private int tamanho;
    private String nome;
    
    public Cachorro(String nome, int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    } 
    public String getNome(){
        return nome;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public int getTamanho(){
        return tamanho;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }
    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }
    
    public String getTamanhoCompleto(){
        if(getTamanho() == TAMANHO_GORDO){
            return "Gordo";
        }else if(getTamanho() == TAMANHO_GORDO_EXTREMO){
            return "Francisco";
        }else if(getTamanho() == TAMANHO_MEIO_MEIO){
            return "Francisco com 12 anos";
        }else if (getTamanho() == TAMANHO_MAGRO){
            return "Francisco com 8 anos";
        }else if (getTamanho() == TAMANHO_MAGRO_EXTREMO){
            return "Gisele Bundchen";
        }else{
            return "";
        }
    }
}

