/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class MainCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Dobberman", Cachorro.TAMANHO_MEIO_MEIO);
        
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getTamanho());
        System.out.println(cachorro.getTamanhoCompleto());
    }    
}
