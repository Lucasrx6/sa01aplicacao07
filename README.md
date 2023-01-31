# Atividade Aula Java SENAI 
## sa01aplicacao7


Este programa tem a finalidade de resolver a sexta atividade da lista de exercicios


7 - (vai calcular a soma total de cinco peças no estoque da oficina de aeronaves)

Prints da tela
Ao executar: 

![Print 1](https://user-images.githubusercontent.com/86980974/215867681-b5313760-d6da-43c6-adc1-0be86452374f.PNG)

![print2](https://user-images.githubusercontent.com/86980974/215867693-a3cf0076-acd3-4ff1-8a96-b1a6999a0883.PNG)


Resultado


![print3](https://user-images.githubusercontent.com/86980974/215867737-8564c856-0104-4bad-8f52-1fb2502a8f58.PNG)


----------------------------------------------------------------------------------

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

    
----------------------------------------------------------------------------------

package br.com.senaitagua.sa1.bo;

public class EstoqueBO {

	public double somarPecas(double p1, double p2, double p3, double p4, double p5) {
		return p1+p2+p3+p4+p5;
		}
}
