//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.
Algoritmo Ej2_promedioDeLaSuma
	
	Definir vector,i,promedio,n,total  Como Real
	
	Escribir "defina el tamaño del vector"
	Leer n 
	
	Dimension vector[n]
	Escribir "ingrese los valores del vector"
	Para i=0 Hasta (n-1) Hacer
		Leer vector(i)
		
	FinPara
	
	promedio=0
	total = 0
	
	Para i=0 Hasta n-1 Hacer
		total=total+vector(i)	
		
	FinPara
	promedio = total/(n)
	
	Escribir "el promedio del vector es de ", promedio
FinAlgoritmo
