/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface;

import com.sun.media.sound.ModelOscillator;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno: Cristhian Gustavo Lourenço, Data: 07/12/2017
 */
public class ExemploJTable extends JFrame {
    private  ArrayList<MinhaPessoa> pessoas;
    private JTable jTable;
    private JScrollPane scroll;
    private JButton popular, limpar, remover, inserir;
    private JTextField nome, valor, idade;
    private DefaultTableModel modelo;
    
    public ExemploJTable(){
            pessoas = new ArrayList<MinhaPessoa>();
    }
    
    public void criarTela(){
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        criarCampos();
        criarBotoes();
        criarTabela();
        popularJTable();
        
        setVisible(true);
    }
        
    public void criarCampos(){
        MeuJLabel jLabel = new MeuJLabel("Nome", 10, 10, 50, 20);
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(jLabel);
        nome = new JTextField();
        nome.setBounds(60, 10, 170, 20);
        add(nome);
        jLabel = new MeuJLabel("idade", 240, 10, 60, 20);
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(jLabel);
        idade = new JTextField();
        idade.setBounds(300, 10, 50, 20);
        add(idade);
        jLabel = new MeuJLabel("Valor", 360, 10, 60, 20);
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(jLabel);
        valor = new JTextField();
        valor.setBounds(420, 10, 100, 20);
        add(valor);
    }
    
    public void criarBotoes(){
        inserir = new JButton("Inserir");
        inserir.setBounds(530, 10, 100, 20);
        inserir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inserirPessoa();
            }
        });
        add(inserir);
    }
    
    private void inserirPessoa(){
       MinhaPessoa pessoa = new MinhaPessoa();
       pessoa.setNome(nome.getText());
       pessoa.setIdade(Byte.parseByte(idade.getText()));
       pessoa.setPreco(Float.parseFloat(valor.getText()));
       pessoas.add(pessoa);
       popularJTable();
       limparComponentes();
       
    }
    
    private void  limparComponentes(){
        nome.setText("");
        valor.setText("");
        idade.setText("");
    }
       
    public void criarTabela(){
        // DefaultTableModel é um modelo que usaremos para adicionar as linhas e definir a tabela.
        modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Idade");
        modelo.addColumn("Valor");
        jTable = new JTable(modelo);
        scroll = new JScrollPane(jTable);
        scroll.setBounds(10, 40, 670, 300);
        add(scroll);
        
    }
    
    public static void main(String[] args) {
        //EventQueue serve para chamar a tela apos ele ter arrumado a tela.
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ExemploJTable tela = new ExemploJTable();
                tela.criarTela();
            }
        });
  
    }
       
    public void popularJTable(){
        modelo.setRowCount(0);
        for (int i = 0; i < pessoas.size(); i++){
            MinhaPessoa pessoa = pessoas.get(i);
            modelo.addRow(new Object[]{
                pessoa.getNome(),
                pessoa.getIdade(),
                pessoa.getPreco()
            });
        }
        jTable.setModel(modelo);
    }
    
    public class MinhaPessoa{
        private String nome;
        private float preco;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getPreco() {
            return preco;
        }

        public void setPreco(float preco) {
            this.preco = preco;
        }

        public byte getIdade() {
            return idade;
        }

        public void setIdade(byte idade) {
            this.idade = idade;
        }
        private byte idade;
    }  
    
}
