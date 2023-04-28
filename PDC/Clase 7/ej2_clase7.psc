//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.
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
