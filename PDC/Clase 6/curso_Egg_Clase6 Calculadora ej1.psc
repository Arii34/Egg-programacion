//Construir un programa que simule un men� de opciones para realizar las cuatro
//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//?M? o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.
Algoritmo curso_Egg_Clase6
	Definir num1,num2, resultado Como Real
	Definir operacion Como Caracter
	
	Escribir "ingrese 2 numeros para operar"
	Leer num1,num2
	
	Escribir "seleccione la operacion a realizar"
	Escribir "S: sumar"
	Escribir "R: restar"
	Escribir "M: multiplicar"
	Escribir "D: dividir"
	Leer operacion
	operacion=Mayusculas(operacion)
	
	Segun operacion 
		"S": 
			resultado=num1+num2
			Escribir "el resultado de la SUMA es: " ,resultado
		"R":
			resultado=num1-num2
			Escribir "el resultado de la RESTA es: " ,resultado
		"M":
			resultado=num1*num2
			Escribir "el resultado de la MULTIPLICACION es: " ,resultado
		"D":
			resultado=num1/num2
			Escribir "el resultado de la DIVISION es: " ,resultado
		
	FinSegun
	
FinAlgoritmo
