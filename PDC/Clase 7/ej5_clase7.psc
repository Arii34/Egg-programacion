//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
//continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
//m�ximo y m�nimo. Cada vez que un n�mero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//n�meros ingresados dentro del intervalo.
Algoritmo ej5_clase7
	Definir numMax,numMin,num, contador Como Entero
	
	contador=0
	
	Escribir "ingrese un maximo y un minimo"
	Leer numMax,numMin
	
	Escribir "ingrese un valor entre los limites establecidos"
	Leer num
	
	Mientras (numMin < num) y (num < numMax)
		Escribir "muy bien, ingrese otro"
		Leer num
		
		contador= contador+1
		
	FinMientras
	Escribir "ingresaste ", contador, " numeros correctos"
FinAlgoritmo
