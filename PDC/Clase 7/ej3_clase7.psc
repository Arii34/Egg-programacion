//Dada una secuencia de números ingresados por teclado que finaliza con un ?1, por
//los números ingresados. Suponemos que el usuario no insertará número negativos.
Algoritmo ej2_clase7
	Definir num,num2, promedio Como Real
	Definir divisor Como Entero
	
	Escribir "ingrese un numero"
	Leer num
		
	divisor=0
	num2=0
	
	Mientras num2 <> -1 Hacer

		
		Escribir "ingrese otro numero, finalice la secuencia con -1"
		Leer num2
		
		num=num+num2
		
		divisor= divisor+1
	FinMientras
	
	promedio=(num+1)/divisor
	
	Escribir "el promedio es de ", promedio
FinAlgoritmo
