Algoritmo ejemplo_Vocal_clase7
	Definir vocal Como Caracter
	
	Escribir "adivine la vocal secreta"
	Leer vocal
	vocal=Mayusculas(vocal)
	
	Mientras vocal<>"I" Hacer
		
		Escribir "intente de nuevo"
		Leer vocal
		vocal=Mayusculas(vocal)
		
	FinMientras
	Escribir "bien hecho :)"
FinAlgoritmo
