//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.
Algoritmo Ej1_VentaDeSeguros
	
	Definir cantVendedores,i,j,n Como Entero
	Definir sueldoBase,ventas,precioVenta, totalVentas,tempVentas,comision, totalSueldo Como Real
	totalVentas=0
	
	Escribir "ingrese la cantidad de vendedores"
	Leer cantVendedores
	Para i=1 Hasta cantVendedores Hacer
		
		Escribir "ingrese el sueldo base del empleado"
		Leer sueldoBase
		Escribir "ingrese la cantidad de ventas que reliz�"
		Leer ventas
		Para j=1 Hasta ventas Hacer
			
			Escribir "ingrese el monto de las ventas"
			Leer tempVentas
			
			totalVentas = totalVentas+tempVentas
			
		FinPara
		comision=totalVentas*0.1		
		
		totalSueldo= sueldoBase+comision
		
		Escribir "el total que hay que pagar a este empleado por comision es de: ", comision
		
		Escribir "el sueldo total de este empleado es de: " totalSueldo
		
	FinPara
	
FinAlgoritmo
