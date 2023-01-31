package br.com.senaitagua.sa1.app7;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.EstoqueBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p1;
		double p2;
		double p3;
		double p4;
		double p5;
		
		
		p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira peça do avião"));
		p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda peça do avião"));
		p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da terceira peça do avião"));
		p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quarta peça do avião"));
		p5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quinta peça do avião"));
		

		
		EstoqueBO cbo = new EstoqueBO();
		
		double valort = cbo.somarPecas(p1,p2,p3,p4,p5);
		
		JOptionPane.showMessageDialog(null, "O valor total das peças informadas é "+ valort +" reais");

	}

}
