//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.
Algoritmo Ej6_divisoresDeNum
	Definir num Como entero
	
	Escribir "ingrese un numero"
	Leer num
	
	Escribir "la sumatoria de los divisores del numero es " sumaDivisores(num)
	
FinAlgoritmo

Funcion resultado = sumaDivisores (numer)
	Definir resultado,sumatoria ,i,mitad Como Entero
	
	sumatoria=0

	
	Para i=1 hasta numer Hacer
		
		si numer mod i == 0
			sumatoria=sumatoria+i
			
		FinSi
	FinPara
	resultado=sumatoria
	
FinFuncion
	