# Atividade Aula Java SENAI 
## sa01aplicacao7


Este programa tem a finalidade de resolver a sexta atividade da lista de exercicios


7 - (vai calcular a soma total de cinco peças no estoque da oficina de aeronaves)

Prints da tela
Ao executar: 

![Print 1](https://user-images.githubusercontent.com/86980974/215869442-0177f0c9-abd2-4bab-9190-92f359b7f85e.PNG)

![print2](https://user-images.githubusercontent.com/86980974/215869453-1ae0de31-2523-4509-92b1-71a0cf5ebca7.PNG)

![print3](https://user-images.githubusercontent.com/86980974/215869475-4f8148ce-f974-4aae-af78-907fafe5bbc1.PNG)

![print4](https://user-images.githubusercontent.com/86980974/215869490-f9eb2dbf-5e87-44a1-8718-e8d0838401ba.PNG)

![print5](https://user-images.githubusercontent.com/86980974/215869506-0472d0bd-9913-4b33-a33a-2c0a4c5add6b.PNG)



Resultado


![print6](https://user-images.githubusercontent.com/86980974/215869528-70295c0f-f646-446b-980d-2f2a3d75f0af.PNG)


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
