Algoritmo fechaAnterior
	
	Definir dia, mes, anio como entero
		
	Escribir "Ingrese el día"
	leer dia
	Escribir ""
	Escribir "Ingrese el mes"
	leer mes
	Escribir ""
	Escribir "Ingrese el año"
	leer anio
	Escribir ""
	
	
	diaAnterior(dia,mes,anio)
	
	Escribir "la fecha anterior a la ingresa es " dia "/" mes "/" anio 
		
FinAlgoritmo

SubProceso diaAnterior(d Por Referencia,m Por Referencia,a Por Referencia)

	
	Segun m Hacer
		
		1 o 3 o 5 o 7 o 8 o 10 o 12: //meses que terminan en 31
			
			si d = 1 Entonces //si dia es igual a 1
				
				m=m-1
				
				si m <> 2  y m <> 0 Entonces //si mes diferente de 2 y de 0
					
					d=30
					
				SiNo
					
					si m=0 Entonces //si mes es igual a 0
						
						m=12
						d=31
						a=a-1
						
					SiNo
						
						d=28
						
					FinSi
					
					
					
				FinSi
				
				
			SiNo
				
				d=d-1
				
			FinSi
			
		4 o 6 o 9 o 11://meses que terminan en 30
			
			si d = 1 Entonces //si dia es igual a 1
				
				m=m-1
				
				si m <> 2 Entonces  //si mes diferente de 2 
					
					d=31
					
				SiNo
					
					d=28
					
				FinSi
				
				
			SiNo
				
				d=d-1
				
			FinSi
			
			
		De Otro Modo: // si el mes febrero 
			
			si d = 1 Entonces //si dia es igual a 1
				
				m=m-1
				
				d=31
				
			SiNo
				
				d=d-1
				
			FinSi
			
	FinSegun
	
	
	
FinSubProceso
