//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//	Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio.

Funcion retorno = todosImpares (x)
	Definir retorno Como Logico


	Repetir
		
		si (x mod 2) == 0
			retorno=Falso
		SiNo
			retorno=Verdadero
		FinSi
		x=trunc(x/10)
	Mientras Que x > 0 y retorno=Verdadero
	
FinFuncion
Algoritmo Ej11_cifrasImpares
	Definir num Como real
	
	Escribir "ingrese un numero"
	Leer num
	
	Escribir "el numero tiene todas las cifras impares?"
	Escribir todosImpares(num)
	
	
FinAlgoritmo
