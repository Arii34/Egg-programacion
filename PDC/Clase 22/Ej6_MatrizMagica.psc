//6. Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//			sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//			matriz que no debe superar orden igual a 10.

Algoritmo Ej6_MatrizMagica
	Definir matriz,i,j,n ,val Como real
	
	Hacer
		Escribir "ingrese el tamaño de la matriz"
		Leer n 
		
	Mientras Que n<=2 o n >=10
	Dimension matriz[n,n]
	
	Para i=0 Hasta (n-1) Hacer
		Para j=0 Hasta (n-1) Hacer
			Hacer
				Escribir "Ingrese un valor entre 1 y 9 "
				Leer val
				matriz(i,j) = val	
			Mientras Que val<1 o val>9
		FinPara
	FinPara
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Escribir Sin Saltar matriz(i,j) , "|"
		FinPara
		Escribir ""
	FinPara
	
	esMagica(matriz,n)
	
FinAlgoritmo

SubProceso esMagica (matriz,n)
	Definir sumatot,sumacolumna,sumaDiagonal1,sumaDiagonal2,sumaFila,i,j Como Real
	Definir retorno Como Logico
	retorno=falso
	
	
	sumaDiagonal1=0
	sumaDiagonal2=0
	sumacolumna=0
	sumaFila=0
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			si i==j Entonces
				sumaDiagonal1=sumaDiagonal1 + matriz(i,j)
			FinSi
		FinPara
	FinPara
	
	j = n-1
	Para i=0 Hasta n-1 Hacer
		sumaDiagonal2=sumaDiagonal2 + matriz(i,j)
		j = j - 1
	FinPara
	
	si sumaDiagonal1=sumaDiagonal2 Entonces
		retorno=Verdadero
	FinSi
	
	Hacer
		Para i=0 Hasta (n-1) hacer
			Para j=0 Hasta (n-1) Con Paso 1 Hacer
				sumaFila=sumaFila + matriz(i,j)
			FinPara
			si sumaDiagonal2<>sumaFila Entonces
				retorno=falso
                i=(n-1)
			FinSi
			sumaFila=0
		FinPara
		
	Mientras Que i <= (n-1)
	
	Hacer
		Para j=0 Hasta (n-1) Con Paso 1 Hacer
			Para i=0 Hasta (n-1) Con Paso 1 Hacer
				sumacolumna=sumacolumna+matriz(i,j)
			FinPara
			si sumaDiagonal2 <> sumacolumna Entonces
				retorno=falso
                i=(n-1)
			FinSi
			sumacolumna=0
		FinPara
		
	Mientras Que i <= (n-1)
	
	si retorno=Verdadero Entonces
		Escribir "La matriz es mágica"
	SiNo
		Escribir "La matriz no es mágica"
	FinSi
FinSubProceso
