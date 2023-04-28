Algoritmo Ej2Ex_MatrizTranspuesta	
	Definir matriz,transp,m,n,i,j Como Real
	
	Escribir "ingrese el tamaño n y m de la matriz"
	Leer n,m
	Dimension matriz[n,m]
	Dimension transp[m,n]
	
	llenarMostrarMatriz(matriz,n,m)
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			transp(i,j)=matriz(j,i)
		FinPara
	FinPara
	Escribir "----------------------------------------------------------"
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar transp(i,j),"|"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo

SubProceso mostrarMatriz (matriz,n,m)
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar matriz(i,j),"|"
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso


SubProceso llenarMostrarMatriz (matriz,n,m)
	Definir i,j Como Real
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matriz(i,j)=Aleatorio(1,100)
		FinPara
	FinPara
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar matriz(i,j),"|"
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	