function sosMayor(){
    const edad = parseFloat(document.getElementById("Edad").value);
console.log(edad);
    if(edad>=18){
        alert("Sos mayor de edad");
    }else{
        alert("No sos mayor de edad");
    }
}