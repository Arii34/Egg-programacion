//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
//comprendidos entre 1 y 100.
Algoritmo Ej4_numMultiplosDe2Y3
	Definir i,contador Como Entero
	contador = 0 
	para i = 1 hasta 100 Con Paso 1 Hacer
		
		si (i mod 2) == 0
			contador = contador+1
		SiNo 
			si (i mod 3 == 0 )y (i mod 2 <> 0)
				contador= contador+1
			FinSi
			
		FinSi

	FinPara
	Escribir "la cantdad de numeros entre 1 y 100 multiplos de 2 o de 3 es de ", contador
FinAlgoritmo
