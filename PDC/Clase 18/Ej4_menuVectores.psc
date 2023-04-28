//A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.


Algoritmo Ej4_menuVectores
	
	Definir vectorA,vectorB,vectorC,tamano,i, totalS,totalR como real
	Definir eleccion, eleccionE Como Caracter

Escribir "introduzca el tamaño de los vectores"
Leer tamano
Dimension vectorA(tamano)
Dimension vectorB(tamano)
Dimension vectorC(tamano)

Hacer
	Escribir "Ingrese la opcion que quiera hacer"
	Escribir "A . Llenar vector A Aleatoriamente"
	Escribir "B . Llenar el vector B Aleatoriamente"
	Escribir "C . LLenar el vector C con la Suma de A y B "
	Escribir "D . Llenar el vector C con la resta de B y A"
	Escribir "E . Mostrar vectores"
	Escribir "F . Salir"
	Leer eleccion
	eleccion=Mayusculas(eleccion)


Segun eleccion Hacer
	"A":
		Para i=0 Hasta (tamano-1) Hacer
			vectorA(i)=Aleatorio(-100,100)
			
		FinPara
		Escribir "se genero el vector correctamente"
	"B":
		Para i=0 Hasta (tamano-1) Hacer
			vectorB(i)=Aleatorio(-100,100)
			
		FinPara
		Escribir "se genero el vector correctamente"
	"C":
		Para i=0 Hasta (tamano-1) Hacer
			vectorC(i)=vectorA(i)+vectorB(i)
		FinPara
		Escribir "se genero el vector correctamente"
	"D":
		Para i=0 Hasta (tamano-1) Hacer
			vectorC(i)=vectorB(i)-vectorA(i)
		FinPara
		Escribir "se genero el vector correctamente"
	"E":
		Hacer
			Escribir "que vector desea ver (A B C)?"
			Leer eleccionE
			eleccionE=Mayusculas(eleccionE)
		Mientras Que (eleccionE < "A") O (eleccionE > "C")
		Segun eleccionE
			"A":
				Para i=0 Hasta (tamano-1) Hacer
					Escribir vectorA(i) , " , " Sin Saltar
				FinPara
				Escribir ""
			"B":
				Para i=0 Hasta (tamano-1) Hacer
					Escribir vectorB(i) , " , " 
				FinPara
				Escribir ""
			De Otro Modo:
				Para i=0 Hasta (tamano-1) Hacer
					Escribir vectorC(i) , " , " 
				FinPara
				Escribir ""
		FinSegun
	"F":
		Escribir "ha decidido salir" 
	De Otro Modo:
		Escribir "Opcion no valida "
		
FinSegun
Mientras Que ((eleccion >= "A") Y (eleccion <= "E")) O (eleccion > "F")

FinAlgoritmo


