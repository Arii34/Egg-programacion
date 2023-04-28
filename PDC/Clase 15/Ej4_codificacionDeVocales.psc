Algoritmo Ej4_codificacionDeVocales
	
	Definir frase Como Caracter
	
	Escribir "ingrese una frase para codificar"
	Leer frase
	
	codificacion(frase)
FinAlgoritmo

SubProceso codificacion (palabras)
	Definir i,long Como real
	Definir auxiliar ,final Como Caracter
	
	final=""
	auxiliar=""
	long=Longitud(palabras)
	
	Para i=0 Hasta long Hacer
		auxiliar=SubCadena(palabras,i,i)
		Segun auxiliar Hacer
			"a":
				//Escribir "@"
				final=concatenar(final,"@")
			"e":
				//Escribir "#"
				final=Concatenar(final,"#")
			"i":
				//Escribir "$"
				final=Concatenar(final,"$")
				
			"o":
				//Escribir "%"
				final=Concatenar(final,"%")
			"u":
				//Escribir "*"
				final=Concatenar(final,"*")
			De Otro Modo:
				final=Concatenar(final,auxiliar)
		FinSegun
		
		
	FinPara
	


	
	Escribir "la palabra codificada es ", final,"."
FinSubProceso
