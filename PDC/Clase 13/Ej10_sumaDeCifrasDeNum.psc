//Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//	resto de una división entre 10. Recordar el uso de la función Mod y Trunc.

Funcion retorno = sumaDeCifras (x)
	Definir suma Como Entero
	suma=0
	Mientras x>0
		
		suma=suma+(x mod 10)
		x=trunc(x/10)
	FinMientras
	
FinFuncion

Algoritmo Ej10_sumaDeCifrasDeNum
	Definir num Como Entero
	
	Escribir "ingrese un numero para sumar sus cifras"
	Leer num
	
	Escribir "la suma de las cifras del numero es de " , sumaDeCifras(num)
	
FinAlgoritmo

