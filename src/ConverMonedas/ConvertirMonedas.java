package ConverMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirPesosColombianosADolares(double valor) {
		double monedaDolar = valor / 4381.70;
		monedaDolar = (double) Math.round(monedaDolar *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesosColombianosAEuros(double valor) {
		double monedaEuro = valor / 4300;
		monedaEuro = (double) Math.round(monedaEuro *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosArgentinosADolares(double valor) {
		double monedaDolar = valor / 289;
		monedaDolar = (double) Math.round(monedaDolar *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesosArgentinosAEuros(double valor) {
		double monedaEuro = valor / 294;
		monedaEuro = (double) Math.round(monedaEuro *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosColombianosABolivianos(double valor) {
		double monedaBolivia = valor / 634;
		monedaBolivia = (double) Math.round(monedaBolivia *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaBolivia+ " Bolivianos");
	}
	
	public void ConvertirPesosArgentinosABolivianos(double valor) {
		double monedaBolivia = valor / 19;
		monedaBolivia = (double) Math.round(monedaBolivia *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaBolivia+ " Bolivianos");
	}
	
	public void ConvertirPesosColombianosAYen(double valor) {
		double monedaYen = valor / 0.31;
		monedaYen = (double) Math.round(monedaYen *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yen");
	}
	
	public void ConvertirPesosArgentinosAYen(double valor) {
		double monedaYen = valor / 1;
		monedaYen = (double) Math.round(monedaYen *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yen");
	}
	
	public void ConvertirPesosColombianosABL(double valor) {
		double monedaBL = valor / 0.0011;
		monedaBL = (double) Math.round(monedaBL *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaBL+ " Reales  Brasileños");
	}
	
	public void ConvertirPesosArgentinosABL(double valor) {
		double monedaBL = valor / 0.037;
		monedaBL = (double) Math.round(monedaBL *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaBL+ " Reales Brasileños");
	}
	
}
