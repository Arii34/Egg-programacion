Algoritmo Guia4ej3
	Definir letra Como Caracter
	//Definir vocalA, vocalE, vocalI, vocalO, vocalU Como Caracter
	
	Escribir "Ingrese una letra"
	Leer letra
	Escribir "antes conversion ", letra
	
	letra = Mayusculas(letra)
	Escribir "despues conversion ", letra
	
	Si (letra == ('U')) O (letra == ('A')) O (letra == ('E')) O (letra == ('I')) O (letra == ('O'))
		Escribir "La letra ", letra, " es una vocal"
	SiNo
		Escribir "La letra ", letra, " es una consonante"
	FinSi
	
	
FinAlgoritmo
