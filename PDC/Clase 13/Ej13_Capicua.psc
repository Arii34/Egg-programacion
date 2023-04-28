Funcion retorno=capicua(numer)
	Definir retorno Como logico
	Definir div , contador,aux, cantcCeros, cantcCeros2,j,i,nro1,nro2 Como real
	
	contador=0
	div=numer
	i=1
	j=1
	retorno=Verdadero
	
	Mientras div>0
		div=trunc(div/10)
		contador=contador+1
		
	FinMientras
	aux=trunc(contador/2)

	Para i=aux Hasta 1 Con Paso -1 Hacer
		
		
		cantcCeros=(10^(contador-1))
		cantcCeros2=(10^j)
		j=j+1
		contador=contador-1
		nro1=trunc(numer / cantcCeros)
		nro2=trunc(numer mod cantcCeros2)
		
		si nro1=nro2 y retorno=Verdadero
			retorno=Verdadero
		SiNo
			retorno=Falso
		FinSi
	FinPara
//	numer mod 10 1er numero
//	numer mod 10^contador//n numero
	
	
	
	
	
FinFuncion

Algoritmo Ej13_Capicua
	Definir numer Como real	
	
	Escribir "ingerse un numero capicua"
	Leer numer
	Escribir "el numero es capicua?"
	Escribir capicua(numer)
	
FinAlgoritmo
