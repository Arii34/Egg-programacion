//Realizar un programa que pida un n�mero y determine si ese n�mero es par o impar.
//Mostrar en pantalla un mensaje que indique si el n�mero es par o impar. (para que un
//n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota:		
//investigar la funci�n mod de PseInt.

Algoritmo curso_Egg_Clase5
	Definir num Como Real
	Escribir "ingrese un numero"
	Leer num
	
	si (num MOD 2)==0
		escribir "El numero introducido es par"
	SiNo
		Escribir "El numero introducido es impar"
	FinSi
FinAlgoritmo
