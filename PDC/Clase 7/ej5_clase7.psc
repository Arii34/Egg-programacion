//Escriba un programa que solicite dos números enteros (mínimo y máximo). A
//continuación, se debe pedir al usuario que ingrese números enteros situados entre el
//máximo y mínimo. Cada vez que un número se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminará cuando se escriba un número que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//números ingresados dentro del intervalo.
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
