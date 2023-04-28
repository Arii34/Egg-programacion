//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor.
Algoritmo Ej1coop_cantidadDeAsteriscos
	Definir i, num, j Como Entero
	
	
	Para i=1 Hasta 5 Hacer
		Escribir "ingese un numero entero del 1 al 20 "
		Leer num
		si num<21 y num >0
			Escribir Sin Saltar num, " "
			para j = 1 Hasta num
				Escribir Sin Saltar "*"
				
			FinPara
			Escribir " "
		SiNo
			Escribir "el numero ingresado no es valido"
			
		FinSi
		
	FinPara

FinAlgoritmo
