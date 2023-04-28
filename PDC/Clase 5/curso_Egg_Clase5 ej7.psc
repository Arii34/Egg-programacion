//Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
//primera letra de la frase es igual a la última letra de la frase. Se deberá de imprimir un
//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//"INCORRECTO".
Algoritmo curso_Egg_Clase5
	Definir palabra Como Caracter
	Definir final Como Entero
	
	Escribir "Introduzca una palabra o frase que comience con A"
	Leer palabra
	
	palabra=Mayusculas(palabra)
	final= Longitud(palabra)-1
	
	Si (Subcadena(palabra,0,0)=="A") Y (Subcadena(palabra,(final),(final))=="A")
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
