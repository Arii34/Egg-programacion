Algoritmo sin_titulo
	Definir bebidaCaliente Como Caracter
	Definir check Como Caracter
	
	Escribir "¿Quiere beber té o café?"
	Leer bebidaCaliente
	bebidaCaliente = Mayusculas(bebidaCaliente)
	
	Si bebidaCaliente == "CAFÉ" o bebidaCaliente == "TÉ" Entonces
		
		
		Si bebidaCaliente == "CAFÉ" Entonces			
			Escribir "¿Lo quiere cortado? SI o NO."
			Leer check
			check = Mayusculas(check)
			
			Si check == "SI"
				Escribir "¿Prefiere leche vegetal? SI o NO."
				Leer check
				check = Mayusculas(check)
				
				Si check == "SI"
					Escribir "Marche un cafe cortado con leche vegetal."
				SiNo
					Escribir "Marche un cafe cortado con leche animal."
				FinSi
			SiNo
				Escribir "Sale un cafe puro."
			FinSi
		SiNo
			Escribir "Le servire un té entonces."
		FinSi
	Sino Escribir "Aqui no servimos lo que usted quiere."
	FinSi
	
FinAlgoritmo
