//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
//

Algoritmo Ej2_impariedad
	
	Definir num Como Entero
	Definir par Como Logico
	
	Escribir "ingrese un numero entero"
	Leer num	
	
	par=pariedad (num)
	Escribir "El numero ingresado es IMPAR?"
	Escribir par

FinAlgoritmo

Funcion resultado = pariedad (x)
	Definir resultado Como Logico
	resultado= x MOD 2 <> 0
	
FinFuncion
	