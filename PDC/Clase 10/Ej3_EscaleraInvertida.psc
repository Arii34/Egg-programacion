//Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deber� mostrar:
Algoritmo Ej3_EscaleraInvertida
	Definir altura, i, j Como Entero
	
	Escribir 'Ingrese la altura'
	Leer altura
	
	alturaCambia=altura
	
	Para i=1 Hasta altura Con Paso 1 Hacer
		
		Para j=1 Hasta altura Con Paso 1 Hacer
			Escribir Sin Saltar  '*'
		Fin Para
		
		altura=altura-1
		Escribir ''
	Fin Para
FinAlgoritmo
