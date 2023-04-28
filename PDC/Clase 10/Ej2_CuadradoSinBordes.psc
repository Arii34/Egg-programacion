Algoritmo Ej2_CuadradoSinBordes
	DEFINIR I,J,LADO Como Entero
	MOSTRAR "INGRESE LADO DEL CUADRADO"
	LEER LADO
	
	PARA I=1 HASTA LADO CON PASO 1 Hacer
		PARA J=1 HASTA LADO CON PASO 1 Hacer
			SI (I>1 Y I<LADO) Y (J>1 Y J<LADO) Entonces
				MOSTRAR SIN SALTAR "  "
			SiNo
				MOSTRAR SIN SALTAR "* "
			FinSi			
		FinPara
		MOSTRAR ""
	FinPara
FinAlgoritmo
