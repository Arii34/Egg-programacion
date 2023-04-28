//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//	función debe devolver el resultado de está validación, para mostrar el mensaje en el
//	algoritmo. Nota: recordar el uso de las variables de tipo lógico.
Algoritmo Ej7_arreglosAleatorios
	Definir vector1, vector2,tamanio,i Como Entero
	
	Escribir "ingrese el tamaño de los arreglos"
	Leer tamanio
	Dimension vector1[tamanio]
	Dimension vector2[tamanio]
	
	Para i=0 Hasta (tamanio-1) Hacer
		vector1(i)=Aleatorio(-5,5)
		
		Escribir Sin Saltar vector1(i) , " "
	FinPara
	Escribir ""
	Para i=0 Hasta (tamanio-1) Hacer
		vector2(i)=Aleatorio(-5,5)
		Escribir Sin Saltar vector2(i), " " 
	FinPara
	Escribir ""
	
	Escribir "los vectores son iguales? " , sonIguales(vector1,vector2,tamanio)
	
FinAlgoritmo

Funcion igual = sonIguales (vector1,vector2,tamanio)
	Definir igual Como Logico
	Definir i Como Entero
	
	Para i=0 Hasta (tamanio-1) Hacer
		si vector1(i) == vector2(i) Entonces
			igual = Verdadero
		SiNo
			igual=Falso
			i=(tamanio-1)
		FinSi
	FinPara
	
FinFuncion
