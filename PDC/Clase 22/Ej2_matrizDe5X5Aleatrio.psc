//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
Algoritmo Ej2_matrizDe5X5Aleatrio
	Definir matriz,i,j Como Real
	Definir buscado Como Real
	Definir aux Como Logico
	aux = Falso
	Dimension matriz[5,5]
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			matriz(i,j)= Aleatorio(-10,10)
		FinPara
	FinPara
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			Escribir Sin Saltar matriz(i,j)
		FinPara
		Escribir ""
	FinPara
	
	Escribir "ingrese un numero a buscar"
	Leer buscado
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			si buscado == matriz(i,j) Entonces
				Escribir "la pos de ese numero es: [" i,";",j,"]"
				aux = Verdadero
			FinSi
			
		FinPara
	FinPara
	si aux == Falso
		Escribir "no se enconcontro el numero"
	FinSi
	
FinAlgoritmo
