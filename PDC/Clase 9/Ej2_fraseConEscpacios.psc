//Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
//espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el
//funcionamiento de la funci�n Subcadena().
Algoritmo Ej2_fraseConEscpacios
	Definir i,longFrase Como Entero
	Definir frase Como Caracter
	
	Escribir "ingrese una frase"
	Leer frase
	
	longFrase=Longitud(frase)
	
	Para i = 0 Hasta longFrase
		Escribir Sin Saltar" " Subcadena(frase,i,i)
		//Escribir " " Subcadena(frase,i,i)
	FinPara
	
FinAlgoritmo
