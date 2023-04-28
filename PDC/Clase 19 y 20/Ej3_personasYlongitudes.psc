//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.
Algoritmo Ej3_personasYlongitudes
	Definir nombres Como Caracter
	Definir i, long,n Como Entero
	
	Escribir "defina la cantidad de nombres"
	Leer n 
	Dimension nombres[n]
	Dimension long[n]
	Escribir "ingrese los nombres"
	Para i=0 Hasta n-1 Hacer
		Leer nombres(i)
		long(i) = Longitud(nombres(i))
		
	FinPara
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar nombres(i) , " "
		Escribir Sin Saltarlong(i)
		Escribir ""
	FinPara
	
FinAlgoritmo
