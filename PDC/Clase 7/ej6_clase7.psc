//Escriba un programa que solicite al usuario n�meros decimales mientras que el usuario
//escriba n�meros mayores al primero que se ingres�. Por ejemplo: si el usuario ingresa
//	como primer n�mero un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//n�mero. El programa continuar� solicitando valores sucesivamente mientras los valores
//ingresados sean mayores que 3.1, caso contrario, el programa finaliza.
Algoritmo ej5_clase7
	Definir numMin,num Como Real
	
	Escribir "ingrese el numero decimal que sera el minimo"
	Leer numMin
	
	Escribir "ingrese un numero mayor"
	Leer num
	
	Mientras num > numMin
		Escribir "ingrese otro numero"
		Leer num
		
	FinMientras
	
FinAlgoritmo
