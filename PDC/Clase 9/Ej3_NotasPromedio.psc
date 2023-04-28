//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
//de sus estudiantes:
//? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//reprueba el curso si tiene una nota final inferior a 6.5
//? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//? La mayor nota obtenida en las exposiciones.
//? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.
Algoritmo Ej3_NotasPromedio
	Definir notaI,notaP,notaE,promedio Como Real
	Definir cantAlumnos, i,contadorReprobados,contadorIntegrador,porcentajeAprobadosI,expoMax,contadorParcial Como Entero
	contadorReprobados=0
	contadorIntegrador=0
	contadorParcial=0
	expoMax=0
	
	Escribir "ingrese la cantidad de alumnos"
	Leer cantAlumnos
	
	para i = 1 Hasta cantAlumnos Hacer
		Escribir "ingrese la nota del integrador"
		Leer notaI
		
		
		Escribir "ingrese la nota del parcial"
		Leer notaP

		
		Escribir "ingrese la nota del Exposicion"
		Leer notaE
	
		
		promedio =  (notaI * 0.35 )+ (notaP * 0.25 )+ (notaE * 0.4)
		
		si promedio < 6.5
			contadorReprobados=contadorReprobados+1
		FinSi
		
		si notaI > 7.5
			contadorIntegrador= contadorIntegrador+1
		FinSi
		porcentajeAprobadosI=100*(contadorIntegrador/cantAlumnos)
		
		si notaE > expoMax
			expoMax=notaE
		FinSi
		
		si (notaP >= 4) y (notaP <= 7.5)
			contadorParcial=contadorParcial+1
		FinSi
	FinPara
	
	Escribir "la cantidad de alumnos reprobodaos es de: ",contadorReprobados
	Escribir "El porcentaje de alumnos con nota mayor a 7.5 en el integrador es de: " , porcentajeAprobadosI, "%"
	Escribir "la mayor nota de exposiciones es de: " , expoMax
	Escribir "El total de alumnos que obtuvieron 4 y 7.5 en el parcial es de: " , contadorParcial
	
FinAlgoritmo
