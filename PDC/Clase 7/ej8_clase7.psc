//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10).
Algoritmo ej8_clase7
	Definir num, contador Como Entero
	
	Escribir "ingrese un numero de n cifras"
	Leer num
	contador=1
	Mientras num > 1
		num=trunc(num/10)
		contador= contador+1
		
	FinMientras
	Escribir "el numero tiene ", contador," cifras"

FinAlgoritmo
