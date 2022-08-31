package Principal;



import javax.swing.*;

import ConverMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesTemperatura;

public class principal {


	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesTemperatura temperatura = new OpcionesTemperatura();
		
		while(true) {
			
			String opciones = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Menú", JOptionPane.QUESTION_MESSAGE, null, 
					new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccionar")).toString();
			
					switch(opciones) {
					case "Conversor de Monedas":
						String input = JOptionPane.showInputDialog("Ingrese un valor: ");
						
						if(validarValor(input) == true) {
							double Minput = Double.parseDouble(input);
							conversion.ConvertirMonedas(Minput);
							
							int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
							if (JOptionPane.OK_OPTION == respuesta) {
								System.out.println("Selecciona Opción afirmativa");
							}else {
								JOptionPane.showMessageDialog(null, "Programa terminado");
							}
						}else {
							JOptionPane.showMessageDialog(null, "Valor inválido");
						}
							break;
							
							
					case "Conversor de Temperatura":
						input = JOptionPane.showInputDialog("Ingrese un valor: ");
						
						if(validarValor(input) == true) {
							double Minput = Double.parseDouble(input);
							temperatura.TemperaturaConvertir(Minput);
							
							int respuesta = 0;
							respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
							if ((respuesta == 0) && (validarValor(input) == true)) {
								
							}else {
								JOptionPane.showMessageDialog(null, "Programa Terminado");
							}
						}else {
							JOptionPane.showMessageDialog(null, "Valor inválido");
						}
						break;
			}
					
		}
	}

public  static boolean validarValor(String input) {
	try {
		double x = Double.parseDouble(input);
		if(x >= 0 || x < 0);
		return true;
	}catch(NumberFormatException e) {
		return false;
	}
}
	
}
