//Realizar un programa que pida un número y determine si ese número es par o impar.
//Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
//número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota:		
//investigar la función mod de PseInt.

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
