Algoritmo Ej3_RestaSucesiva
	Definir num1,num2 Como Real
	
	Escribir "ingrese dos numeros"
	Leer num1,num2
	restaSucesiva(num1,num2)
	
FinAlgoritmo

SubProceso restaSucesiva (n1,n2)
	Definir resta,contador Como Real
	
	resta=0
	contador=0
	
	Mientras n1>=n2
		
		resta=n1-n2
		n1=resta
		contador=contador+1
		
	FinMientras
	Escribir "El cociente despues de la resta sucesiva es de: " , contador
	Escribir "el resto de la resta sucesiva es de: ", resta
	
FinSubProceso
	