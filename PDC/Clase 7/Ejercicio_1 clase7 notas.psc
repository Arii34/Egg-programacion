//Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la
//	nota se pedir� de nuevo hasta que la nota sea correcta.
Algoritmo Ejercicio_1
	Definir nota Como Entero
	
	Escribir "Ingrese la nota del alumno"
	Leer nota
	
	Mientras nota < 0 o nota >10
		Escribir "ingrese una nota valida"
		Leer nota
		
	FinMientras
	Escribir "nota correcta"
FinAlgoritmo
