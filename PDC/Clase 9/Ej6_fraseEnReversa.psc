//Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
//deberemos mostrar a l o H.
Algoritmo Ej6_fraseEnReversa
	
	Definir i,longFrase Como Entero
	Definir frase Como Caracter
	
	Escribir "ingrese una frase"
	Leer frase
	
	longFrase=Longitud(frase)
	
	Para i = 0 Hasta longFrase
		Escribir Sin Saltar" " Subcadena(frase,longFrase,longFrase)
		longFrase = longFrase-1
	FinPara
	
FinAlgoritmo
