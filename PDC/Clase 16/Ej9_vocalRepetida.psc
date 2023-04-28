//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//repetidas. Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
//al no estar repetidas.

Algoritmo saltarVocal
	
	Definir frase Como cadena
	
	Escribir "Digite una frase"
	leer frase
	
	frase = Minusculas(frase)
	
	EliminaVocal(frase)

	

	
	
	
FinAlgoritmo

SubProceso EliminaVocal(f)
	
	Definir i, lon, contA,contE,contI,contO,contU Como Entero
	definir auxiliar,final como cadena
	
	contA=1
	contE=1
	contI=1
	contO=1
	contU=1
	//contadores de cada letra
	
	lon = Longitud(f)
	final=""
	
	Para i=0 Hasta lon Hacer
		auxiliar=SubCadena(f,i,i)
		Segun auxiliar Hacer
			"a":				
				si contA > 1 Entonces
					final=Concatenar(final,"")
				SiNo
					final=concatenar(final,"a")
					contA=contA+1
				FinSi
			"e":
				si contE > 1 Entonces
					final=Concatenar(final,"")
				SiNo
					final=concatenar(final,"e")
					contE=contE+1
				FinSi
			"i":
				si contI > 1 Entonces
					final=Concatenar(final,"")
				SiNo
					final=concatenar(final,"i")
					contI=contI+1
				FinSi
			"o":
				si contO > 1 Entonces
					final=Concatenar(final,"")
				SiNo
					final=concatenar(final,"o")
					contO=contO+1
				FinSi
			"u":
				si contU > 1 Entonces
					final=Concatenar(final,"")
				SiNo
					final=concatenar(final,"u")
					contU=contU+1
				FinSi
			De Otro Modo:
				final=Concatenar(final,auxiliar)
		FinSegun
		
	FinPara
	
	
	Escribir "la frase sin las vocales repetidas es: "
	Escribir final

	
FinSubProceso

