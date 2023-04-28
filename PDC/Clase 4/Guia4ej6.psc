Algoritmo sin_titulo
	Definir correoNoLeido Como Entero
	Definir ordenEjecutivo, soliEmergencia Como Logico
	correoNoLeido = Aleatorio(0,20)
	ordenEjecutivo = Verdadero
	soliEmergencia = Verdadero
	
	
	Escribir "Iniciar sesion como administrador"
	Escribir "Ver informes de marketing"
	Escribir "Completar hojas de calculo con los ingresos mensuales"
	Escribir "Revisar el correo electronico"
	//si hay menos de 10 correos sin leer revisa mi correo de voz
	Si correoNoLeido < 10 Entonces
		Escribir "Revisar correo de voz"
		//ver si hay alguna solicitud de los ejecutivos. Si hay solicitudes, hágalas a menos que tenga una solicitud de emergencia de un departamento.
		Si soliEmergencia
			Escribir "Responder a la solictud de emergencia"
		FinSi
		Si ordenEjecutivo
			Escribir "Atender orden ejecutivos"
			Escribir "Enviar e-mail de confirmación"
		FinSi
	FinSi
	Escribir "Enviar correo electrónico de actualización"
	Escribir "Apagar la computadora"
	Escribir "Regar planta de la oficina"
	
	
FinAlgoritmo
