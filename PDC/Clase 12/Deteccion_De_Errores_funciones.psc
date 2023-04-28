Algoritmo Deteccion_De_Errores_funciones
	Definir ent Como Entero
	
	Escribir "ingrese un numero"
	Leer ent
	
	Escribir "Es ese numero par?"
	
	Escribir Paridad(ent)
FinAlgoritmo

Funcion  retorno <- Paridad (num)
	Definir retorno Como Logico
	
	retorno = num MOD 2 == 0
FinFuncion
