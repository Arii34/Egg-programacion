//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//	Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
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
