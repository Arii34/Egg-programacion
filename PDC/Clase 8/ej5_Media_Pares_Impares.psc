Algoritmo ej5_Media_Pares_Impares
	Definir sumaPar, sumaImpar,contadorPar,contadorImpar,contadorGen, num Como Entero
	sumaImpar=0
	sumaPar=0
	
	contadorImpar=0
	contadorPar=0
	
	contadorGen=0
	Hacer
		Escribir "ingrese un numero"
		leer num
		si (num mod 2 )== 0
			sumaPar= sumaPar+num
			contadorPar= contadorPar+1
		SiNo
			sumaImpar= sumaImpar+num
			contadorImpar=contadorImpar+1
		FinSi
		
		contadorGen = contadorGen+1
		
	Mientras Que contadorGen < 10
	
	Escribir "la media de numeros pares fue: ", sumaPar/contadorPar
	Escribir "la media de numeros impares fue: ", sumaImpar/contadorImpar
FinAlgoritmo
