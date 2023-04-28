//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//pediremos al usuario los dos números para pasárselos a la función. Después la función
//calculará la suma y lo devolverá para imprimirlo en el algoritmo.

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
	