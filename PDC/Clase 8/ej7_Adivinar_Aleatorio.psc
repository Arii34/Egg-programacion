Algoritmo ej7_Adivinar_Aleatorio
	Definir adivinar, intentos Como Entero
	
	adivinar=Aleatorio(1,10)
	Escribir "adivine el numero entre 1 y 10"
	Hacer
		Leer intentos
		si intentos <> adivinar
			si intentos < adivinar
				Escribir "el valor objetivo es mayor"
			SiNo
				Escribir "el valor objetivo es menor"
		FinSi
	FinSi
	
	Mientras Que intentos <> adivinar
	
	Escribir "bien hecho le pegaste "
FinAlgoritmo
