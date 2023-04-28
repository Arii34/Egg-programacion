//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
//impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares"
//siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
//siguiente mensaje "Los números no son pares, o uno de ellos no es par".
Algoritmo curso_Egg_Clase5
	Definir num1,num2 Como real
	
	Escribir "digite 2 numeros"
	Leer num1,num2
	
	si ((num1 MOD 2)==0) Y ((num2 MOD 2)==0)
		Escribir "ambos numeros son pares"
	SiNo
		Escribir "ambos numeros no son pares o uno no lo es"
	FinSi
FinAlgoritmo
