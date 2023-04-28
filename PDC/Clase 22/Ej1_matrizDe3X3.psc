//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.
Algoritmo Ej1_matrizDe3X3
	Definir matriz, i,j Como Real
	Dimension matriz[3,3]
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir "ingrese el valor ",i, ";",j," de la matriz"
			Leer matriz(i,j)
		FinPara
	FinPara
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir sin saltar matriz(i,j)
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
