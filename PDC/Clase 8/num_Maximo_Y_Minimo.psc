Algoritmo num_Maximo_Y_Minimo
	Definir input, numMax,numMin,contador,suma Como Entero
	
	contador=0
	numMax=-99999999
	numMin=99999999
	suma = 0
	
	Hacer
		Escribir "ingrese un numero entero la entrada termina con 0"
		Leer input
		si input < numMin
			numMin = input
		FinSi
		
		si input > numMax
			numMax = input
		FinSi
		
		contador = contador + 1
		suma =suma + input
	Mientras Que input <> 0
	
	Escribir "el numero minimo fue; " , numMin
	Escribir "el numero maximo fue; " , numMax
	Escribir "el promedio es; " , suma/contador
FinAlgoritmo
