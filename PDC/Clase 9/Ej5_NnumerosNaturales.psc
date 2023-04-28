//Escribir un programa que calcule la suma de los N primeros números naturales. El valor
//de N se leerá por teclado.
Algoritmo Ej5_NnumerosNaturales
	
	Definir n,i, suma Como Entero
	suma= 0
	
	Escribir "ingrese la cantidad de numeros naturales que quiere sumar"
	Leer n
	
	para i = 1 Hasta n Con Paso 1 Hacer
		
		suma = suma+i
		
	FinPara
	Escribir "la suma de los ", n, " numeros reales es de " , suma
FinAlgoritmo
