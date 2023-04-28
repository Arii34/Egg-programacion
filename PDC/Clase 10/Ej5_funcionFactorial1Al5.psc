//La función factorial se aplica a números enteros positivos. El factorial de un número
//entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
//n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
//Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
//hasta el 5.
Algoritmo Ej5_funcionFactorial1Al5
	DEFINIR I,J,F Como Entero
	
	Para I=1 HASTA 5 Con Paso 1 Hacer
		MOSTRAR SIN SALTAR I "!=" 
		F=1
		PARA J=1 HASTA I CON PASO 1 Hacer
			MOSTRAR SIN SALTAR J 
			F=F*J
			SI I>J Entonces
				MOSTRAR Sin Saltar "*"
			SiNo
				MOSTRAR " = " F
			FinSi			
		FinPara	
	FinPara	
	
FinAlgoritmo
