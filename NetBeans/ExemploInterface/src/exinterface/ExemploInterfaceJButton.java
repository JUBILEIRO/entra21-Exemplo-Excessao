package exinterface;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ExemploInterfaceJButton{
	
    private JFrame minhaTela;
	private JButton jButtonHW;
	
	public ExemploInterfaceJButton(){
		minhaTela = new JFrame("Meu primeiro botão");
		minhaTela.setSize(200, 300);
		minhaTela.setLayout(null);
		minhaTela.setLocationRelativeTo(null);
		
		jButtonHW = new JButton();
		jButtonHW.setBounds(10, 10, 100, 25);
		jButtonHW.setText("Hello World");
		jButtonHW.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    JOptionPane.showMessageDialog(null,"sa");	
		    }
		});
		minhaTela.add(jButtonHW);
		
		minhaTela.setVisible(true);
	}
	
	
}