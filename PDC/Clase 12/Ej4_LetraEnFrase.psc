//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//función Subcadena().
Algoritmo Ej4_LetraEnFrase
	Definir frase,letra Como Caracter
	
	Escribir "ingrese una frase"
	Leer frase
	frase=Mayusculas(frase)
	Escribir "ingrese la letra para buscar en la frase"
	Leer letra
	letra=Mayusculas(letra)
	
	Escribir "la frase contiene la letra ", letra," ", letraEnFrase(letra,frase), " veces"
	
FinAlgoritmo

Funcion resultado = letraEnFrase (let,fras)
	Definir resultado Como Entero
	Definir long ,i,contador Como Entero
	Definir letras Como Caracter
	
	contador=0
	
	long=Longitud(fras)
	
	para i=0 Hasta long Hacer
		letras=subcadena(fras,i,i)
		si letras == let
			contador=contador+1
		FinSi
		
	FinPara
	resultado=contador
FinFuncion
	