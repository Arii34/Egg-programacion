//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//	resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

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

