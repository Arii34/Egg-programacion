//El programa debe solicitar la siguiente informaci�n al usuario: el nombre del trabajador, el d�a
//	de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Adem�s,
//	debemos preguntarle al usuario si el d�a de la semana (lunes, martes, mi�rcoles, etc.) era
//		festivo o no, para poder calcular el jornal diario. Utilice una funci�n para realizar el c�lculo.
Algoritmo Ejercicio9CalcularJornal
	Definir nombre, dia,turno, festivo Como Caracter
	Definir cantHoras Como Entero
	Escribir "Ingrese su nombre"
	Leer nombre
	Escribir "Que dia de la semana es"
	Leer dia
	Escribir "El turno es Diurno o Nocturno"
	Leer turno
	Escribir "Cuantas hora trabajo"
	Leer cantHoras
	Escribir "El dia de la semana era Festivo: Si o No"
	Leer festivo
	Escribir "El Jornal diario es de: ",CalcularJornal(nombre,dia,turno,festivo,cantHoras)
	
	
FinAlgoritmo
Funcion jornal <- CalcularJornal(nombre, dia,turno,festivo,cantHoras)
	Definir jornal, tarifa como real
	si turno = "Diurno" Entonces
		tarifa=cantHoras*90
		si festivo="Si"
			tarifa=tarifa+(tarifa*0.10)
		FinSi
	SiNo
		si turno="Nocturno" Entonces
			tarifa=cantHoras*125
			si festivo="Si"
				tarifa=tarifa+(tarifa*0.15)
			FinSi	
		FinSi
	FinSi
	jornal = tarifa
FinFuncion 
