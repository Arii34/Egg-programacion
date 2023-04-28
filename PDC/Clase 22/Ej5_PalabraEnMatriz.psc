//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
Algoritmo Ej5_PalabraEnMatriz
	Definir i,j,contador Como Real
	Definir matriz ,frase Como Caracter
	Dimension matriz[3,3]
	
	
	Hacer
		Escribir "ingrese una palabra o frase de 9 caracteres"
		Leer frase
	Mientras Que Longitud(frase) >9 
	
	contador=0
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			matriz(i,j) = Subcadena(frase,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir Sin Saltar matriz(i,j) , "|"
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo
