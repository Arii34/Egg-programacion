Algoritmo Ej5_Espaciado
	
	Definir frase Como Caracter
	
	Escribir "ingrese una frase que espaciar"
	Leer frase
	
	espaciado(frase)
	
FinAlgoritmo


SubProceso espaciado (palablras)
	Definir aux,final Como Caracter
	Definir i,long Como Entero
	
	final=""
	aux=""
	long=Longitud(palablras)
	
	Para i=0 Hasta long Hacer
		aux=Subcadena(palablras,i,i)
		
		Escribir aux, " " Sin Saltar
	FinPara
	Escribir ""
	
	
	
FinSubProceso
	