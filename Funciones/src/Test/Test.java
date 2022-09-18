package Test;
import java.time.LocalDate;
import java.time.LocalTime;

import Funciones.Funciones;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Funciones.esBisiesto(2000));
		System.out.println(Funciones.esFechaValida(LocalDate.of(2022, 9, 30)));
		System.out.println(Funciones.traerFechaCorta(LocalDate.now()));
		System.out.println(Funciones.traerHoraCorta(LocalTime.now()));
		System.out.println(Funciones.esDiaHabil(LocalDate.of(2022, 9, 30)));
		System.out.println(Funciones.traerDiaDeLaSemana(LocalDate.now()));
		System.out.println(Funciones.traerMesEnLetras(LocalDate.now()));
		System.out.println(Funciones.traerFechaLarga(LocalDate.now()));
		System.out.println(Funciones.traerCantDiasDeUnMes(2024, 2));
		System.out.println(Funciones.aproximar2Decimal(5.22522222));
		System.out.println(Funciones.esNumero('s'));
		System.out.println(Funciones.esLetra('s'));
		System.out.println(Funciones.esCadenaNros("123213213"));
		System.out.println(Funciones.esCandenaLetras("ASDASDSD"));
	}

}
