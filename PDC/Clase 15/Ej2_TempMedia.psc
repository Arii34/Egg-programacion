Algoritmo Ej2_TempMedia
	Definir tempMax,tempMin,dias,i Como Real
	
	Escribir "ingrese la cantidad de dias a calcular"
	Leer dias
	
	Para i=1 Hasta dias Hacer
		Escribir "ingrese la temperatura maxima y minima del dia "
		Leer tempMax,tempMin
		temperaturaMedia(tempMax,tempMin)
	FinPara
	
	
	
	
FinAlgoritmo


SubProceso temperaturaMedia (Max,Min)
	Definir resultado Como Real
	resultado=(Max+Min)/2
	Escribir "La temperatura media del dia es de: ",resultado
FinSubProceso
	