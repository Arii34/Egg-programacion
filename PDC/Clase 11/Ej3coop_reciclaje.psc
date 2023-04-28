
Algoritmo Ej3coop_reciclaje
	Definir usuario,clave,confirmacion Como Caracter
	Definir login Como Logico
	Definir contador,n,botellas,i,peso, saldo , saldoFinal Como Entero
	
	contador=0
	login=Falso
	n=0
	saldo=0
	saldoFinal=0
	
	Escribir "ingrese el nombre de usuario"
	Leer usuario
	
	Mientras usuario<>"Albus_D"
		Escribir "usuario incorrecto, intente de nuevo"
		Leer usuario
	FinMientras
	
	Mientras contador < 3 Hacer
			Escribir "ingrese su contraseña"
			Leer clave
			
			si clave <>"caramelosDeLimon"
				Escribir "clave incorrecta"
				login=Falso
			SiNo
					si clave="caramelosDeLimon"
						login=Verdadero
						contador = 4
						
				FinSi
			FinSi
			contador=contador+1
		
	FinMientras

	si login
		Mientras n<>3
			Escribir "1.ingresar botellas"
			Escribir "2.Consultar saldo"
			Escribir "3.salir"
			Leer n
			Segun n Hacer
				1:
					Escribir "¿cuantas botellas va a ingresar?"
					leer botellas
					
					Para i=1 Hasta botellas Hacer
						peso=Aleatorio(100,3000)
						si peso < 500
							saldo=saldo +50
							Escribir "la botella pesa ", peso," y se le ofrece $50 por ella"
						SiNo
							si peso >501 y peso <1500
								saldo=saldo+125
								Escribir "la botella pesa ", peso," y se le ofrece $125 por ella"
							SiNo
								si peso>1501
									saldo = saldo +200
									Escribir "la botella pesa ", peso," y se le ofrece $200 por ella"
								FinSi
								
							FinSi
						FinSi
						Escribir "¿desea agregar " saldo, " a su saldo? (S/N)"
						Leer confirmacion
						confirmacion=Mayusculas(confirmacion)
						si confirmacion = "S"
							Escribir "se añadio el saldo a su cuenta"
							saldoFinal= saldoFinal+saldo
							saldo=0
						SiNo
							Escribir "devolviendo material"
							saldo=0
						FinSi
					FinPara
					
				2:
					Escribir "su saldo es de $" , saldoFinal
					Escribir " "
					
				De Otro Modo:
					Escribir " "

			Fin Segun
		FinMientras
	FinSi
	
FinAlgoritmo
