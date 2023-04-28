//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567. 
//El programa finaliza cuando ingresa los datos correctos.


Algoritmo sin_titulo
	
	Definir usuario, contrasenia, num, num2 Como Entero
	usuario = 1024
	contrasenia = 4567
	
	Hacer
		
		escribir "ingrese usuario de 4 digitos"
		leer num
		num = abs(num)
		
		escribir "ingrese contrasenia de 4 digitos"
		leer num2
		num2 = abs(num2)
		
	Mientras Que (num <> usuario) o (num2 <> contrasenia)
	
	Escribir "BIENVENIDO USUARIO ", usuario, " no olvide nunca su contraseña: ", contrasenia
	
FinAlgoritmo
