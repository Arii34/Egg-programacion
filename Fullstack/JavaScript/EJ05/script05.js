function calcular() {
    let num1 =parseInt(document.getElementById('num1').value) ;
    let num2 =parseInt(document.getElementById('num2').value) ;
    let operador = document.getElementById('operador').value;
    let res = 0

    switch(operador.toUpperCase()) {
        case 'S':
            res = num1 + num2;
            document.getElementById('Resultado').value = res
            break;
            
        case 'R':
            res = num1 - num2;
            document.getElementById('Resultado').value = res;
            break;
        
        case 'M':
            res = num1 * num2
            document.getElementById('Resultado').value = res;
            break;
            
        case 'D':
            res = num1 / num2
            document.getElementById('Resultado').value = res.toFixed(2);
            break;
            
        default:
            alert("Operador incorrecto");efefeef
            res = 0 
            break;
        
    }
    
}