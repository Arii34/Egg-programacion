//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas
//vale el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres
//notas obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los
//datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben
//estar comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el
//promedio y se mostrará un mensaje de error.
Algoritmo ej5_clase7
	Definir nPractica,nTeoria,nProblemas, notaFinal Como Real
	Definir nombre Como Caracter
	
	Escribir "Ingrese el nombre del alumno"
	Leer nombre
	
	Mientras nombre<> "" 
		
		Escribir "ingrese las notas del alumno (Practica, Teoria y Problemas)"
		Leer nPractica,nTeoria,nProblemas
		
		si (nPractica <= 10) y (nPractica >=0) Y (nTeoria <=10 ) y(nTeoria >=0) y (nProblemas<= 10) y (nProblemas>=0)
			
			notaFinal=(nPractica*0.1)+(nTeoria*0.4)+(nProblemas*0.5)
			
			Escribir "la nota final de ", nombre, " es de ", notaFinal
			
			Escribir "Ingrese el nombre siguiente alumno, presione enter para terminar"
			Leer nombre
		SiNo
			Escribir "alguna nota introducida no es valida"
			nombre=""
		FinSi

		
	FinMientras
FinAlgoritmo
