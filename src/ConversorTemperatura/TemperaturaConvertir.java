package ConversorTemperatura;

import javax.swing.JOptionPane;

public class TemperaturaConvertir {
	public double ConvertirCelciusaFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit");
		return farenheit;
	}
	
	public void ConvertirCelciusaKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Grados Kelvin");
	}
	
	public double ConvertirKelvinaCelcius(double valor) {
		double kelvinCelcius = valor - 273.15;
		kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Kelvin son " +kelvinCelcius+ " Grados Celcius");
		return kelvinCelcius;
	}
	
	public void ConvertirKelvinaFarenheit(double valor) {
		double kelvinFarenheit = ConvertirKelvinaCelcius(valor);
		kelvinFarenheit = ConvertirCelciusaFarenheit(kelvinFarenheit);
		kelvinFarenheit =(double) Math.round(kelvinFarenheit *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados kelvin son " +kelvinFarenheit+ " Grados Celcius");
	}
	
}
