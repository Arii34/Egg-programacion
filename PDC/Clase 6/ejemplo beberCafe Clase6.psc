Algoritmo sin_titulo
	Definir bebidaCaliente Como Caracter
	Definir check Como Caracter
	
	Escribir "�Quiere beber t� o caf�?"
	Leer bebidaCaliente
	bebidaCaliente = Mayusculas(bebidaCaliente)
	
	Si bebidaCaliente == "CAF�" o bebidaCaliente == "T�" Entonces
		
		
		Si bebidaCaliente == "CAF�" Entonces			
			Escribir "�Lo quiere cortado? SI o NO."
			Leer check
			check = Mayusculas(check)
			
			Si check == "SI"
				Escribir "�Prefiere leche vegetal? SI o NO."
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
			Escribir "Le servire un t� entonces."
		FinSi
	Sino Escribir "Aqui no servimos lo que usted quiere."
	FinSi
	
FinAlgoritmo
