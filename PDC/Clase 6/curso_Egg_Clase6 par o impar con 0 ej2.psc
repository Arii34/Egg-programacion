//Realizar un programa que, dado un número entero, visualice en pantalla si es par o
//impar. En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni
//impar".
Algoritmo curso_Egg_Clase6
	Definir num como Real
	Escribir "ingrese un numero"
	Leer num	
	
	si (num == 0)
		Escribir "El numero 0 no es par ni impar"
	SiNo
		si (num mod 2 == 1)
			Escribir "el numero es impar"
		SiNo
			Escribir "el numero es par"
		FinSi
	FinSi
FinAlgoritmo
