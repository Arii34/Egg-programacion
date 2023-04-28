Algoritmo Ej6_introduccionDeCaracteresAUnVector
	
	Definir i Como Real
	Definir frase,vector,car,pos Como Caracter
	Dimension vector[20]
	
	
	Hacer
		Escribir "ingrese una frase de 20 caracteres maximo"
		Leer frase 
	Mientras Que Longitud(frase) > 20
	
	
	para i=0 Hasta 19 Hacer
		vector(i)=Subcadena(frase,i,i)
	FinPara
	
	Para i=0 Hasta 19 Hacer
		Escribir Sin Saltar vector(i), " | "
	FinPara
	Escribir ""
	
	Escribir "ingrese un caracer y una posicion para ingresar al vector"
	Leer car,pos
	
	si vector(pos) == "" o vector(pos) == " " Entonces
		vector(pos) = car 
		Para i=0 Hasta 19 Hacer
			Escribir Sin Saltar vector(i) , " , "
		FinPara
	SiNo
		Escribir "Ese espacio ya esta ocupado "
	FinSi
	
FinAlgoritmo
