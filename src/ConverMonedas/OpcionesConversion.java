package ConverMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De COP a USD", "De COP a EUR", "De ARS a USD", "De ARS a EUR", "De COP a BS", "De ARS a BS", "De COP a JPY", "De ARS a JPY", "De COP a BL", "De ARS a BL"},
						"Seleccion")).toString();
		switch (opcion) {
		case "De COP a USD":
			monedas.ConvertirPesosColombianosADolares(valor);
			break;
		
		case "De COP a EUR":
			monedas.ConvertirPesosColombianosAEuros(valor);
			break;
			
		case "De ARS a USD":
			monedas.ConvertirPesosArgentinosADolares(valor);
			break;
		
		case "De ARS a EUR":
			monedas.ConvertirPesosArgentinosAEuros(valor);
			break;
			
		case "De COP a BS":
			monedas.ConvertirPesosColombianosABolivianos(valor);
			break;
			
		case "De ARS a BS":
			monedas.ConvertirPesosArgentinosABolivianos(valor);
			break;
			
		case "De COP a JPY":
			monedas.ConvertirPesosColombianosAYen(valor);
			break;
			
		case "De ARS a JPY":
			monedas.ConvertirPesosArgentinosAYen(valor);
			break;
			
		case "De COP a BL":
			monedas.ConvertirPesosColombianosABL(valor);
			break;
			
		case "De ARS a BL":
			monedas.ConvertirPesosArgentinosABL(valor);
			break;
		}
		
		
	}
	
}
		