
Algoritmo Ej2coop_digitosDeEnteros
	Definir num, contador, div Como real
	contador=0
	
	Escribir "ingrese un numero entero"
	Leer num
	num = trunc(num)
	
	Mientras  num > 0 
		div=num/10
		
		num = trunc(div)
		
		contador=contador+1
	FinMientras
	
	Escribir "El numero tiene ", contador, " cifras"


FinAlgoritmo
