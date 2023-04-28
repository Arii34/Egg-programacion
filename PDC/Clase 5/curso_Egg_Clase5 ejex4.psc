//La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
//de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
//de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
//regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
//cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
//40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
//de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y
//el total a pagar por el cliente.
Algoritmo curso_Egg_Clase5
	Definir montoTotal,combustible,horas,minutos,tiempo Como real
	//combustible=0 (no hizo falta ¿?)
	
	Escribir "Ingrese la cantidad de horas y minutos usadas"
	leer horas, minutos
	
	tiempo=(horas*60) + minutos
	
	si tiempo <= 120
		Escribir "cobrar $400"
	SiNo
		Escribir "ingrese la cantidad de litros cosumidos"
		leer combustible
		montoTotal=(tiempo*5.20)+(combustible*40)
		Escribir "cobrar $", montoTotal
	FinSi
	
FinAlgoritmo
