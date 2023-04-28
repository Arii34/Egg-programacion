//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.
Algoritmo Ej4_centroDeCeros
	Definir matriz,i,j,n Como real
	Escribir "ingrese el tamaño de la matriz"
	Leer n
	Dimension matriz[n,n]
	
	llenarMatriz(matriz,n,n)
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Escribir Sin Saltar matriz(i,j) , "|"
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo

SubProceso llenarMatriz (matriz, n , m )
	Definir i,j Como Entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			si i==j
				matriz(i,j)=0
			SiNo
				matriz(i,j)=Aleatorio(1,10)
			FinSi
			
		FinPara
	FinPara
FinSubProceso

