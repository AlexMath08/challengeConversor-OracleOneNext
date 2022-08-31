package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {
	
	TemperaturaConvertir temperatura = new TemperaturaConvertir();
	
	public void TemperaturaConvertir(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije una opción de conversión", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celcius a Farenheit", "Celcius a Kelvin", "Kelvin a Farenheit", "Kelvin a Celcius"}, "Seleccion")).toString();
		switch(opcion) {
		case "Celcius a Farenheit":
			temperatura.ConvertirCelciusaFarenheit(Minput);
			break;
			
		case "Celcius a Kelvin":
			temperatura.ConvertirCelciusaKelvin(Minput);
			break;
			
		case "Kelvin a Farenheit":
			temperatura.ConvertirKelvinaFarenheit(Minput);
			break;
			
		case "Kelvin a Celcius":
			temperatura.ConvertirKelvinaCelcius(Minput);
			break;
		}
	}

}
