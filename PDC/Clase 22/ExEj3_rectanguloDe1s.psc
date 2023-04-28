//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.
Algoritmo Ej3ex_rectanguloDe1
	Definir matriz,i,j Como Real
	Dimension matriz[5,15]
	
	Para i=0 Hasta 4 Hacer
		para j=0 Hasta 14 Hacer
			si i==0 o j==0 o i==4 o j==14 Entonces
				matriz(i,j)=1
			SiNo
				matriz(i,j)=0
			FinSi
		FinPara
	FinPara
	
	mostrarMatriz(matriz,5,15)
FinAlgoritmo

SubProceso mostrarMatriz (matriz,n,m)
	Definir i,j Como Entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar matriz(i,j),"|"
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso