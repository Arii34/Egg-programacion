//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//?M? o ?m? para la multiplicación y ?D? o ?d? para la división.
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
