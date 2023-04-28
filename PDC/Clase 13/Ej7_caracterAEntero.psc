//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).
Algoritmo Ej7_caracterAEntero
	Definir palabra Como Caracter
	Definir num Como Entero
	
	Escribir "Introduzca un numero de 3 digitos maximo"
	Leer palabra
	Escribir caracterAEntero(palabra)
	
FinAlgoritmo

Funcion retorno = caracterAEntero (x)
	Definir retorno Como Entero
	retorno= ConvertirANumero(x)
FinFuncion
