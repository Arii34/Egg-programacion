//Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//		igual a (V[1]*V[2]*V[3]*V[4])


Algoritmo sin_titulo
	definir arreglo, i, producto como entero
	dimension arreglo[4]
	
	para i = 0 Hasta 3 Hacer
		arreglo(i) = Aleatorio(1,10)
		escribir Sin Saltar arreglo(i), " | "
	FinPara
	escribir ""
	producto = 1
	
	para i = 0 Hasta 3 Hacer
		producto = producto * arreglo(i)
	FinPara
	
	escribir "el producto del arreglo de enteros es: ", producto
	
FinAlgoritmo
