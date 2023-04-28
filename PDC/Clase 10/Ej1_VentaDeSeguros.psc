//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
		Escribir "ingrese la cantidad de ventas que relizó"
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
