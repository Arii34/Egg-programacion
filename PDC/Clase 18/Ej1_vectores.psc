//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.
Algoritmo Ej1_Vector
	
	Definir vector ,i Como Entero
	Dimension vector(5)
	
	
	Escribir "ingrese 5 numeros a mostrar"
	
	Para i=0 hasta 4 Hacer
		Leer vector(i)
	FinPara
	
	Para i=0 Hasta 4 Hacer
		Escribir  vector(i) " , " Sin Saltar
	FinPara
	Escribir ""
	
FinAlgoritmo
