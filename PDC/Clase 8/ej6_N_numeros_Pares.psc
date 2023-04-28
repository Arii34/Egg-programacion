Algoritmo ej6_N_numeros_Pares
	Definir n,suma, contador Como Entero
	suma=0
	contador= 0
	
	Escribir "ingrese un numero N para la sumatoria de pares"
	leer n
	n=abs(n)
	Hacer
		
		contador = contador+2
		suma = suma + contador
		
	Mientras Que contador < n
	
	Escribir "la suma de los primeros ",n," numeros pares es ", suma
FinAlgoritmo
