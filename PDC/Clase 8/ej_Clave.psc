
Algoritmo ej1_Clave
	Definir clave, input Como Caracter
	Definir contador Como Entero
	
	clave = "EUREKA"
	contador = 0 
	hacer 
		Escribir "Ingrese la contraseña"
		Leer input
		input = Mayusculas(input)
		
		contador = contador+1
	Mientras Que input <> clave y contador < 3 
	si input <> clave 
		Escribir "agotaste todos tus intentos"
		
	SiNo
		Escribir "Se ha ingresado al sistema correctamente"
		
	FinSi
	
FinAlgoritmo
