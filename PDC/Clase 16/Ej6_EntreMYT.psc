Algoritmo Ej6_EntreMYT
	
	Definir letra Como Caracter
	
	Escribir "ingrese una letra entre M y T"
	Leer letra
	letra=Mayusculas(letra)
	
	EntreMyT(letra)
	
FinAlgoritmo

SubProceso EntreMyT (algo)

	
	si algo >= "M" y algo <= "T" Entonces
		
		Escribir "bien hecho"
	SiNo
		Escribir "la letra ingresada no esta entre M y T"
	FinSi
FinSubProceso
