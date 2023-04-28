Algoritmo Guia4ej3
	Definir dia Como Caracter

	
	Escribir "Ingrese un DIA de la semana"
	Leer dia
	Escribir "antes conversion ", dia
	
	dia = Mayusculas(dia)
	Escribir "despues conversion ", dia
	
	Si ((dia == 'LUNES') O (dia == 'MARTES') O (dia == 'MIERCOLES') O (dia == 'JUEVES') O (dia == 'VIERNES') O (dia == 'SABADO') O (dia == 'DOMINGO'))
	//En la linea anterior comprobamos que el usuario haya ingresado una cadena de texto valida.
		Si (dia == ('SABADO')) O (dia== ('DOMINGO'))
			Escribir "El dia ", dia, " es NO laboral"
		SiNo
			Escribir "El dia ", dia, " es laboral"
		FinSi
	SiNo
		Escribir "No has ingresado un dia de la semana"
	FinSi

	
	
FinAlgoritmo