Algoritmo EjT_NumeroMayor
	Definir num, i, numMax Como Entero
	
	num	= 0 
	numMax= 0 
	Para i <- 1 Hasta 4 Con Paso 1 Hacer
		
		Escribir "ingrese un numero"
		Leer num
		
		si num > numMax
			numMax = num
		FinSi
		
	FinPara
	Escribir "el mayor numero ingresado fue: ", numMax
FinAlgoritmo
