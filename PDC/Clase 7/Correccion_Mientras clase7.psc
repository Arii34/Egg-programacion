Algoritmo Correccion_Mientras
	Definir num Como Entero
	//El programa ingresará números mientras sean PARES
	Escribir "Ingrese un número par distinto de 0"
	Leer num
	
	Mientras (num mod 2) == 0  y (num <> 0) Hacer
		Escribir "Ingrese otro número"
		Leer num
	FinMientras
	
FinAlgoritmo