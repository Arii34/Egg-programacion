Algoritmo numero_capicua
	Definir num, num1,num2, i, a,b,c, analizar1, analizar2, queda1, queda2 como entero
	
	Escribir "Qué número desea analizar?"
	Leer num
	num1=num
	num2=num
	i=0
	cifras(num,i)
	c=i
	hacer
		analizar1=num1%10	//nos va dando los digitos de derecha a izquierda uno por uno
		queda1=trunc(num1/10) //elimina el numero que se tomo arriba y se queda con el resto de los digitos
		num1=queda1	//el proximo numero para trabajar son los digitos que quedaron a la izquierda
		escribir "analizar1=",analizar1
		para b<-1 hasta c
			analizar2=num2%10	//nos va dando los digitos de derecha a izquierda uno por uno
			queda2=trunc(num2/10) //elimina el numero que se tomo arriba y se queda con el resto de los digitos
			num2=queda2	//el proximo numero para trabajar son los digitos que quedaron a la izquierda
			Escribir "Analizar2=",analizar2
			Escribir "C=",c
		FinPara
		num2=num //resetea al valor original para el siguiente analisis
		Escribir  c," ", analizar1," " , analizar2
		c=c-1
	Mientras Que c<>0 y analizar1==analizar2
	
	Si c==0 y analizar1==analizar2
		Escribir "Son capicúas"
	SiNo
		Escribir "No son ", c," ", analizar1," ", analizar2
	FinSi
	
FinAlgoritmo

SubProceso cifras(numero,i por referencia) //calcula el numero de digitos
	Definir queda Como Entero
	Hacer
				queda=trunc(numero/10)
		i=i+1
		numero=queda
	Mientras Que queda<>0
		
FinSubProceso
	