//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
//igual a 70; y reprueba en caso contrario.
Algoritmo curso_Egg_Clase5
	Definir nota1,nota2,nota3,promedio Como real
	
	Escribir "introducir las notas del alumno"
	leer nota1,nota2,nota3
	
	promedio = (nota1+nota2+nota3)/3
	
	si promedio >= 70
		Escribir "el alumno esta aprobado"
	SiNo
		Escribir "el aluno no aprobo :("
	FinSi
	
FinAlgoritmo
