//Se debe realizar un programa que:
//1o) Pida por teclado un n�mero (entero positivo).
//2o) Pregunte al usuario si desea introducir o no otro n�mero.
//3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
//4o) Muestre por pantalla la suma de los n�meros introducidos por el usuario.


Algoritmo HastaElNo
	
	Definir num, suma Como Entero
	Definir continuar Como Caracter
	
	suma = 0
	
	Hacer
		
		escribir "introduzca un numero entero positivo"
		leer num
		num = abs(num)
		escribir "�desea introducir otro numero? SI o NO"
		leer continuar
		continuar = Minusculas(continuar)
		suma = suma + num		
		
	Mientras Que continuar <> "no" 
	
	escribir "la suma de los numeros ingresados es: ", suma
		
FinAlgoritmo
