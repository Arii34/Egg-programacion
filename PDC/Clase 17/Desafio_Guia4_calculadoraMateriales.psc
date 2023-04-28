Algoritmo calculadoraMateriales
	definir cal Como Entero
	
	Repetir 
		Escribir "***********************************"
		Escribir "	    QUE OPCION DESEA CALCULAR"
		Escribir "***********************************"
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		Leer cal
		
		Mientras  cal<1 O cal >9 Hacer
			Escribir "****************************************************"
			Escribir "EL DATO INTRODUCIDO NO ESTA EN EL RANGO DEL 1 AL 9"
			Escribir "****************************************************"
			
			
			Escribir "***********************************"
			Escribir "	    QUE OPCION DESEA CALCULAR"
			Escribir "***********************************"
			Escribir "1. Calcular muro de ladrillo"
			Escribir "2. Calcular viga de hormigón"
			Escribir "3. Calcular columnas de hormigón"
			Escribir "4. Calcular contrapisos"
			Escribir "5. Calcular techo"
			Escribir "6. Calcular pisos"
			Escribir "7. Calcular pintura"
			Escribir "8. Calcular iluminación"
			Escribir "9. Salir"
			Leer cal
			
		FinMientras
	
		
		Segun cal Hacer
			1:
				calcularMuro
			2:
				calcularViga
			3:
				calcularColumna
			4:
				calcularContrapisos
			5:
				calcularTecho
			6:
				calcularPisos
			7:
				calcularPintura
			8:
				calcularIluminacion
				
			De Otro Modo:
				Escribir "ha decidido salir"
		Fin Segun
		
	Mientras Que cal <> 9
FinAlgoritmo

SubProceso calcularMuro ()
	Definir espesor, cemento, arena, ladrillos, alto, largo, m2 como Real
	
	Repetir 
		Escribir "Ingrese el espesor del muro si es 20 o 30 cm"
		Leer espesor
		
	Mientras que (espesor <> 20) Y (espesor <> 30)
		
	
	Escribir "Ingrese el largo y el alto del muro"
	Leer alto, largo
	
	m2 = alto*largo
	
	Si espesor == 20 Entonces
		cemento = 10.9 * m2
		arena = 0.09 * m2
		ladrillos = 90 * m2
	SiNo
		cemento = 15.2 * m2
		arena = 0.115 * m2
		ladrillos = 120 * m2
	FinSi
	
	Escribir "Necesita ", cemento, " kg de cemento más ", arena, " m3 de arena y ", ladrillos, " de ladrillos"
	
FinSubProceso

SubProceso calcularViga ()
	Definir largoV, cementoV, arenaV, piedraV, hierro8V, hierro4V Como Real
	
	Escribir "Ingrese el largo de la viga"
	Leer largoV
	
	cementoV = 9 * largoV
	arenaV = 0.02 * largoV
	piedraV = 0.02 * largoV
	hierro8V = 4 * largoV
	hierro4V = 3 * largoV
	
	Escribir "Se necesita ", cementoV, " kg de cemento, ", arenaV, " m3 de arena, ", piedraV, " m2 de piedra, ", hierro8V, " m de hierro del 8 y ", hierro4V, " m de hierro 4."
	
FinSubProceso

SubProceso calcularColumna ()
	Definir largoC, cementoC, arenaC, piedraC, hierro10C, hierro4C Como Real
	
	Escribir "Ingrese la altura de la columna"
	Leer largoC
	
	cementoC = 7.5 * largoC
	arenaC = 0.016 * largoC
	piedraC = 0.016 * largoC
	hierro10C = 6 * largoC
	hierro4C = 3 * largoC
	
	Escribir "Se necesita ", cementoC, " kg de cemento, ", arenaC, " m3 de arena, ", piedraC, " m2 de piedra, ", hierro10C, " m de hierro del 10 y ", hierro4C, " m de hierro 4."
	
FinSubProceso

SubProceso calcularContrapisos ()
	Definir espesorCP, anchoCP, largoCP, cementoCP, arenaCP, piedraCP, m3 Como Real
	
	Escribir "Ingrese el espesor, el ancho y el largo de los contrapisos"
	Leer espesorCP, anchoCP, largoCP
	
	m3 = espesorCP * anchoCP * largoCP
	
	cementoCP = 105 * m3
	arenaCP = 0.45 * m3
	piedraCP = 0.9 * m3
	
	Escribir "Se necesita ", cementoCP, " kg de cemento, ", arenaCP, " m3 de arena, ", piedraCP, " m3 de piedra"
	
FinSubProceso

SubProceso calcularTecho ()
	Definir espesorT, anchoT, largoT, cementoT, arenaT, piedraT, hierro8T, hierro6T, m2, m3 Como Real
	
	Escribir "Ingrese el espesor, el ancho y el largo del techo" 
	Leer espesorT, anchoT, largoT
	
	m2 = anchoT*largoT
	m3 = espesorT * anchoT * largoT
	
	cementoT = 33 * m2
	arenaT = 0.072 * m3
	piedraT = 0.072 * m3
	hierro8T = 7 * m2
	hierro6T = 4 * m2
	
	Escribir "Se necesita ", cementoT, " kg de cemento, ", arenaT, " m3 de arena, ", piedraT, " m3 de piedra", hierro8T, " m de hierro del 8" hierro6T, " m de hierro del 6."
	
FinSubProceso

SubProceso  calcularPisos
	Definir anchoP, largoP, superficieP Como Real
	
	Escribir "Ingrese el ancho y el largo del paño de piso a colocar"
	Leer anchoP, largoP
	
	superficieP = (anchoP*largoP)*1.10
	
	Escribir "Se necesita de ", superficieP, " m2"
FinSubProceso

SubProceso calcularPintura ()
	Definir superficiePin, pintura Como Real
	
	Escribir "Ingrese la superficie del muro que desea pintar"
	Leer superficiePin
	
	pintura = superficiePin / 6 
	
	Escribir "Se necesita de ", pintura, " litros de pintura"
	
FinSubProceso


SubProceso  calcularIluminacion
	Definir superficieHab, iluminacion Como Real
	
	Escribir "Ingrese la superficie de la habitación"
	Leer superficieHab
	
	iluminacion = superficieHab *0.20
	
	Escribir "La iluminación natural de ", superficieHab, " m2 es de ", iluminacion
FinSubProceso






	