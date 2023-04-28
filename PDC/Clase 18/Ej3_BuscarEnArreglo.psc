//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
//también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
//encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo Ej3_BuscarEnArreglo
	
	Definir vector, n, i, buscar Como Real 
	
	
	Escribir "ingrese el tamaño del arreglo"
	leer n 
	Dimension vector(n)
	
	Escribir "ingrese ", n, " numeros" 
	
	Para i=0 Hasta (n-1) Hacer
		Leer vector(i)
		
	FinPara
	
	Escribir "ingrese el numero a buscar"
	Leer buscar
	
	Para i=0 Hasta (n-1) Hacer
		si buscar == vector(i) Entonces
			Escribir "el numero " , buscar , " se encuentra en la posicion " ,i
		FinSi
	FinPara
	
	
FinAlgoritmo
