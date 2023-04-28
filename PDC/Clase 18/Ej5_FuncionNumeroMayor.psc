Algoritmo Ej5_FuncionNumeroMayor
	Definir vector, n, i, buscar Como Real 
	
	
	Escribir "ingrese el tamaño del arreglo"
	leer n 
	Dimension vector(n)
	
	Escribir "ingrese ", n, " numeros" 
	
	Para i=0 Hasta (n-1) Hacer
		Leer vector(i)
		
	FinPara
	
	Escribir "El mayor numero ingresado es de " numeroMayor(n,vector)
	
	
FinAlgoritmo

Funcion numMax = numeroMayor (n,vector)
	Definir i,numMax Como Real
	
	numMax=vector(0)
	
	Para i=1 Hasta (n-1) Hacer
		si numMax < vector(i)
			numMax=vector(i)
		FinSi
	FinPara
	
FinFuncion
	