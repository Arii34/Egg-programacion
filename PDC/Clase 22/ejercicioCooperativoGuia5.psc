Algoritmo ejercicioCooperativoGuia5
	Definir tablero como Cadena
	Dimension tablero[9, 12]
	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	acomodarPalabras(tablero)
	imprimirMatriz(tablero, 9, 12)
	
FinAlgoritmo
SubProceso inicializarMatriz (matriz,n,m)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matriz(i,j) = "*" 
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz (matriz,n,m)
	Definir i,j Como Entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar matriz(i,j) , "|"
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso agregarPalabra (matriz ,palabra, linea)
	Definir i,j Como Entero
	
	para i=0 Hasta 11 Hacer
		matriz(linea,i) = Subcadena(palabra,i,i) 
	FinPara
	
	
FinSubProceso

Funcion retorno = buscarR (matriz,num)
	Definir i,retorno  Como Entero
	Definir flag Como Logico
	flag=Verdadero
	
	Para i=0 Hasta 8 Hacer
		si matriz(i,num) == "r" y flag Entonces
			retorno=i
			flag=Falso
		FinSi
	FinPara
FinFuncion

SubProceso acomodarPalabras(tablero)
	
	
	Definir i, j, k Como Entero
	Para i=0 Hasta  8 Hacer
		k = 0
		Para j=0 Hasta  11 Hacer
			si buscarR(tablero, i) < 5 y j+k <= 8 Entonces
				k = 5 - buscarR(tablero, i)
				tablero(i, j) = tablero(i, j+k)
			FinSi
		FinPara
	FinPara
FinSubProceso

	