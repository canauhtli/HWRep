package mx.com.canauhtli.pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PeridoTiempo {

	public static void main(String[] args) throws ParseException {
		
		// En un arreglo guardo cuantos d�as tiene cada mes. En java el indice empieza en 0, por lo que mi arreglo
		// tiene 13 posiciones y la primera es 0, as� el mes 1 (enero) corresponde al indice 1 que esta en la posicion 2.
		int dm[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		// Variables de la fecha inicial 2008-08-04
		int ai = 2008;
		int mi = 8;
		int di = 4;
		int at = ai; // guardo en una variable temporal el a�o inicial;
		
		// Variables de la fecha final (actual). 2017-01-15
		int aa = 2017;
		int ma = 1;
		int da = 15;
		
		// Contadores de (a) a�os, (m) meses y (d) d�as
		int a = 0;
		int m = 0;
		int d = 0;

		// Calculo de n�mero de a�os
		// Mientras el a�o inicial sea menor al a�o final voy a ir aumentando de 1 en 1 el contador de a�os
		// y aumentando el valor de mi a�o inicial
		// Cuando el mes inicial es mayor que el mes actual quiere decir que aun no se cumple este a�o y por lo tanto
		// le restamos uno a la cuenta anterior.
		// Cuando el mes inicial es igual al mes actual y el dia inicial es mayor 
		while (at < aa) {
			a++;
			at++;
			System.out.println(" a+ " + at);
		}
		if (mi > ma) {
			a--;
		}
		if (mi == ma && di > da) {
			a--;
		}
		
		if (mi < ma) {
			System.out.println("1");
			if (di < da) {
				int t1 = mi;
				while (t1 < ma) {
					m++;
					t1++;
				}
			}
		}
		if (mi == ma) {
			System.out.println("2");
			if (di > da) {
				m = 11;
			}
		}
		if (mi > ma) {
			System.out.println("3");
			int t2 = mi;
			while (t2 < 12) {
				m++;
				t2++;
			}
			t2 = 1;
			while (t2 < ma) {
				m++;
				t2++;
			}
		}
		
		if (di < da) {
			int dt = di;
			while (dt < da) {
				d++;
				dt++;
			}
		}
		if (di > da) {
			int tt = dm[mi];
			if ((mi==2) && (aa%4==0)) {
				tt++;
			}
			int dt = di;
			while (dt < tt) {
				d++;
				dt++;
			}
			dt = 1;
			while (dt < da) {
				d++;
				dt++;
			}
		}
		
		System.out.println("ai:"+ai+" mi:"+ mi+ " di:"+di);
		System.out.println(a + " a�os, " + m + " meses, " + d + " dias");
		
		
	}

}
