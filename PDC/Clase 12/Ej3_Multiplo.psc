//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo Ej3_Multiplo
	Definir num1,num2 Como Entero
	Definir multiplo Como Logico
	
	Escribir "ingrese dos numeros siendo el primero multiplo del segundo "
	Leer num1,num2
	
	multiplo=esMultiplo(num1,num2)
	Escribir "los numeros ingresados son multiplos?"
	Escribir multiplo
	
FinAlgoritmo

Funcion resultado = esMultiplo (x,z)
	Definir resultado Como Logico
	resultado= x mod z==0
	
FinFuncion
	