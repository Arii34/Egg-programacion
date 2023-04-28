Algoritmo ejZombie
	Definir matriz , frase Como Caracter
	Definir contador,i,j,m Como Entero
	frase = "BCBBABBACBBBBCBB"
	m=4
	Dimension matriz[m,m]
	
	contador=0
	Para i=0 Hasta m-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matriz(i,j) = Subcadena(frase,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
	Para i=0 Hasta m-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar matriz(i,j) , "|"
		FinPara
		Escribir ""
	FinPara
	
	si genOblicua1(matriz,m) == genOblicua2(matriz,m) Entonces
		Escribir "tiene el gen zombie Aaaaa"
	SiNo
		Escribir "esta sano"
	FinSi
	
FinAlgoritmo

Funcion retorno = genOblicua1 (matriz,m)
	Definir i,j Como Entero
	Definir oblicua1 Como Caracter
	Definir retorno, aux Como Logico
	Dimension oblicua1[m]
	
	Para i=0 Hasta m-1 Hacer
		Para j=0 Hasta m-1 Hacer
			si i==j Entonces
				oblicua1(i) = matriz(i,j)
			FinSi
		FinPara
	FinPara

	aux=Verdadero
	
	Para i=0 Hasta m-1 Hacer
		si i>0 Entonces
			si oblicua1(i) ==oblicua1(i-1) y aux == Verdadero Entonces
				retorno=Verdadero
			SiNo
				retorno=Falso
				aux=Falso
			FinSi
		FinSi
	FinPara
	
FinFuncion

Funcion retorno = genOblicua2 (matriz,m)
	Definir i,j Como Entero
	Definir oblicua2 Como Caracter
	Definir retorno, aux Como Logico
	Dimension oblicua2[m]
	
	Para i=0 Hasta m-1 Hacer
		para j=(m-1) Hasta 0 Con Paso -1 Hacer
			si (m-1)-i==j Entonces
				oblicua2(i) = matriz(i,j)
			FinSi
		FinPara
	FinPara
	
	aux=Verdadero
	
	Para i=0 Hasta m-1 Hacer
		si i>0 Entonces
			si oblicua2(i) ==oblicua2(i-1) y aux==Verdadero Entonces
				retorno=Verdadero
			SiNo
				retorno=Falso
				aux=Falso
			FinSi
		FinSi
	FinPara
	
FinFuncion
