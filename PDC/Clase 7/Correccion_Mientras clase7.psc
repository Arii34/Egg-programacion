Algoritmo Correccion_Mientras
	Definir num Como Entero
	//El programa ingresar� n�meros mientras sean PARES
	Escribir "Ingrese un n�mero par distinto de 0"
	Leer num
	
	Mientras (num mod 2) == 0  y (num <> 0) Hacer
		Escribir "Ingrese otro n�mero"
		Leer num
	FinMientras
	
FinAlgoritmo