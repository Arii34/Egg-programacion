Algoritmo guia4ej4
	definir num, un, dec, cen como entero
	escribir "escribe un n�mero de 3 cifras"
	leer num
	
	Si ((num>99) y (num<1000))
		
	un= num mod 10
	num= trunc (num/10)
	dec =num mod 10
	num =trunc (num /10)
	cen = num mod 10
	
		Si (cen == un)
			Escribir "el n�mero ingresado es capic�a"
		SiNo
			Escribir "el n�mero ingresado NO es capic�a"
		FinSi
	SiNo
		Escribir "No ha ingresado un n�mero de 3 cifras"
	FinSi

FinAlgoritmo