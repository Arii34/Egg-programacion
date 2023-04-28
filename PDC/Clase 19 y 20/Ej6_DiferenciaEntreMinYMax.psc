//Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.
Algoritmo Ej6_DiferenciaEntreMinYMax
	
	Definir vector1, vector2,i,max1,min1,max2,min2 Como Entero
	
	Dimension vector1[5]
//	Dimension vector2[5]
	
	
	
	Para i=0 Hasta (4) Hacer
		vector1(i)=Aleatorio(-5,5)
		
	FinPara
	min1= vector1(0)
	max1=vector1(0)
	
	Para i=0 hasta (4)
		Escribir Sin Saltar vector1(i) , " "
		si vector1(i) < min1 Entonces
			min1=vector1(i)
		FinSi
		si vector1(i)> max1 Entonces
			max1=vector1(i)
		FinSi
	FinPara
	
	Escribir ""
	
//	Para i=0 Hasta (4) Hacer
//		vector2(i)=Aleatorio(-5,5)
//		Escribir Sin Saltar vector2(i), " " 
//		si vector2(i) < min2 Entonces
//			min2 = vector2(i)
//		FinSi
//		si vector2(i) > max2 Entonces
//			max2=vector2(i)
//		FinSi
//	FinPara
//	
	Escribir "el mayor numero de el vector es ", max1 , " y el menor es " ,min1
	
FinAlgoritmo
