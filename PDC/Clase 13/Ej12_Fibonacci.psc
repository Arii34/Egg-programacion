//Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. La
//sucesi�n de Fibonacci es la sucesi�n de los siguientes n�meros:
//	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Algoritmo Ejercicio12Fibonacci
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	Fibonacci(num)
FinAlgoritmo
Funcion Fibonacci(num)
	Definir c,a,b,i Como Entero
	b=1
	c=0
	Para i=1 Hasta num Hacer
		a<-c;
		c<-a+b;
		b<-a;
		
	FinPara
	Escribir c
FinFuncion
	