//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.
Algoritmo Ej3_SumaDematricesAleatorio
	Definir matriz,i,j ,n,m Como Real
	
	Escribir "ingrese el tamaño N y M de la matriz"
	Leer n,m
	Dimension matriz[n,m]
	
	
	llenarMatriz(matriz,n,m)
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar matriz(i,j) , "|"
		FinPara
		Escribir ""
	FinPara
	
	
	Escribir "la suma de la matriz es: " , sumarMatriz(matriz ,n,m)
	
FinAlgoritmo

SubProceso llenarMatriz (matriz, n , m )
	Definir i,j Como Entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matriz(i,j)=Aleatorio(0,10)
		FinPara
	FinPara
	
FinSubProceso

SubProceso suma = sumarMatriz (matriz,n,m)
	Definir suma,i,j Como real
	suma=0
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			suma = suma + matriz(i,j)
		FinPara
	FinPara
	
	
FinSubProceso
