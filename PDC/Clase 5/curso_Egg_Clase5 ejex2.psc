//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//debe cobrar al cliente e imprimirlo por pantalla.
Algoritmo curso_Egg_Clase5
	Definir mes Como Caracter
	Definir monto Como real
	
	Escribir "ingrese el mes de la compra y el monto"
	Leer mes,monto
	
	mes=Mayusculas(mes)
	si mes="SEPTIEMBRE" O mes = "OCTUBRE" O mes ="NOVIEMBRE"
		Escribir "el monto a pagar es ",(monto*0.9)
	SiNo
		Escribir "El monto a pagar es ", monto
	FinSi
FinAlgoritmo
