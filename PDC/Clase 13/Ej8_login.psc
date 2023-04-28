
	Algoritmo Ejercicio8
		Definir user, pass Como Caracter
		Definir i Como Entero;
		i=0
		
		Repetir
			Escribir "Ingrese el usuario"
			Leer user
			Escribir "Ingrese la contraseña"
			Leer pass
			i=i+1
			
		Mientras Que i < 3 y Login(user,pass, i)=Falso 
		
		Escribir Login(user, pass, i)
		
FinAlgoritmo

//Inicio de la funcion
Funcion retorno <- Login(user, pass, i)
	Definir retorno Como Logico
	Definir cont Como Entero
	cont = 0

		si user="u" Y pass="a" Entonces
			retorno=Verdadero
			Escribir "Welcome David";
			cont=3
		SiNo
			Escribir i ," Intento Fallido";	
		FinSi
		

FinFuncion

