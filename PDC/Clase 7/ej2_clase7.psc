//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el
//l�mite inicial.
Algoritmo ej2_clase7
	Definir limite,num,suma Como Real
	
	Escribir "ingrese un limite positivo"
	Leer limite
	
	Escribir "ingrese un numero"
	leer num
	
	suma=0
	
	Mientras  limite > num
		Escribir "escriba un numero para sumarle"
		leer suma
		num = num + suma
	FinMientras
	Escribir num, " es mayor o igual que el limite establecido de ", limite
FinAlgoritmo
