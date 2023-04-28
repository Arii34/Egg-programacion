//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.

Algoritmo Ej2_sumaYRestaDeNrosEnArreglos
	
	Definir array,i,totalS,totalR,totalM Como real
	Dimension array(10)
	
	totalS=0
	totalR=0
	totalM=1
	
	Escribir "ingrese 10 numeros reales"
	
	Para i=0 Hasta 9 Hacer
		
		Leer array(i)		
	FinPara
	
	Para i=0 Hasta 9 Hacer
		totalS=totalS+array(i)
		totalR=totalR-array(i)
		totalM=totalM*array(i)
	FinPara
	
	Escribir "la suma total de los nros introducidos es de: ", totalS
	Escribir "la resta total de los nros introducidos es de: ", totalR
	Escribir "la multiplicacion total de los nros introducidos es de: ", totalM
	
FinAlgoritmo
