Algoritmo numerosEnEscalera
	Definir escalon como Entero
	Escribir "Escriba la cantidad de escalones deseado: "
	Leer escalon
	escaleraNumeros(escalon)
	
FinAlgoritmo

SubProceso escaleraNumeros(escalones)
	Definir i, j como entero
	Para i <- 1 Hasta escalones Con Paso 1 Hacer
		Para j <- 1 Hasta  i Con Paso 1 Hacer
			Escribir sin saltar j " "			
		FinPara
		Escribir ""
	FinPara	
FinSubProceso