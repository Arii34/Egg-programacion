//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo Ej4_notasDeAlumnos
	Definir alumnos, i,contDef,contReg,contBue,contExl Como Entero
	Dimension alumnos[100]
	contDef=0
	contReg=0
	contBue=0
	contExl=0
	
	Para i=0 Hasta 99 Hacer
		alumnos(i)=Aleatorio(0,20)
	FinPara
	Para i=0 Hasta 99 Hacer
		si alumnos(i) <= 5
			contDef=contDef+1
		SiNo
			si (alumnos(i) > 5) y (alumnos(i) <=10)
				contReg=contReg+1
			SiNo
				si (alumnos(i)) > 10 y (alumnos(i) <=15)
					contBue=contBue+1
				SiNo
					si (alumnos(i) > 15) y (alumnos(i) <=20)
						contExl=contExl+1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "- alumnos deficientes ", contDef
	Escribir "- almunos regulares " , contReg
	Escribir "- almunos buenos ", contBue
	Escribir "- alumnos exelentes " , contExl
FinAlgoritmo
