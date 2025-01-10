package com;

public class ControladorDNI {

	private final char[] LETRAS = {'T', 'R', 'W', 'A' , 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	private final int DIVISOR_DNI = 23;
	private final int LONGITUD_NUMERO_DNI = 8;
	private final int LONGITUD_DNI_COMPLETO = 9;
	
	/**
	 * Calcula la letra correspondiente a un numero de DNI
	 * @param numeroDNI Cadena con el numero del DNI (8 digitos)
	 * @return la letra correspondiente al DNI
	 * @throws IllegalArgumentExceptional Si el numero tiene formato invalido
	 */
	
	private char calcularLetra(String numeroDNI) {
		if (numeroDNI == null || numeroDNI.length() != LONGITUD_NUMERO_DNI || !numeroDNI.matches("\\d+")) {
			throw new IllegalArgumentException("El numero del DNI no es valido");
		}
		int numero = Integer.parseInt(numeroDNI);
		int resto = numero % DIVISOR_DNI;
		return LETRAS[resto];
	}
	/**
	 * Verifica si un DNI completo es valido
	 * @param dniCompleto DNI completo con 8 digitos y 1 letra
	 * @return true si el DNI es valido, false en caso contrario
	 */
	public boolean esValido(String dniCompleto) {
		if(dniCompleto == null || dniCompleto.length() != LONGITUD_DNI_COMPLETO) {
			return false;
		}
		try {
			String numero = dniCompleto.substring(8, LONGITUD_NUMERO_DNI);
			char letraProporcionada = Character.toUpperCase(dniCompleto.charAt(8));
			return letraProporcionada == calcularLetra(numero);
		}catch(IllegalArgumentException exception) {
			return false;
		}
	}
	/*
	public String generarAleatorioDNI() {
		int numeroAleatorio = (int) (Math.random() * 100000000);
		String numeroDNI = String.format(null, null);
	}
	*/
}
