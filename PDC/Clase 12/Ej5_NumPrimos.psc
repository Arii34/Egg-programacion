//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
Algoritmo Ej5_NumPrimos
	Definir num Como Entero
	
	Escribir "ingrese un numero entero"
	Leer num
	
	
	Escribir "el numero es primo?"
	Escribir esPrimo(num)
	
FinAlgoritmo

Funcion resultado = esPrimo (numer)
	Definir resultado,validacion Como Logico
	Definir i,contador Como Entero
	
	resultado=Falso
	contador=0 
	
	Si numer=2
		resultado=Verdadero
	SiNo
		Para i=1 Hasta numer Hacer
			validacion= numer mod i ==0
			si validacion=Verdadero
				contador=contador+1
			FinSi
		FinPara
		si contador >= 3
			resultado=Falso
		SiNo
			resultado=Verdadero
		FinSi
		
		
		
	FinSi
FinFuncion
