//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//calcular� la suma y lo devolver� para imprimirlo en el algoritmo.

Algoritmo Ej1_sumaNumeros
	Definir num1,num2, res Como Entero
	
	Escribir "ingrese 2 numeros para sumar"
	Leer num1,num2
	res=suma(num1,num2)
	Escribir "el resultado de la suma es: ",res
	
FinAlgoritmo

Funcion resultado = suma (x,z)
	Definir resultado Como Entero
	resultado=x+z
FinFuncion
	