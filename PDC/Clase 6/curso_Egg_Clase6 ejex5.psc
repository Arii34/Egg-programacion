Algoritmo sin_titulo
	Definir anio Como Entero
	
	Escribir "Ingrese un año"
	Leer anio
	
	Si (((anio mod 4)==0) y !((anio mod 100)==0)) O ((anio mod 100)==0 Y (anio mod 400)==0)
		Escribir "el año introducio es bisiesto"
	SiNo
		Escribir "el año introduciod no es bisiesto"
	FinSi
FinAlgoritmo
