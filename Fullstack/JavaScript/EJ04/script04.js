function sn(){
    let siNo = document.getElementById("sn").value;
   
    if (siNo.toUpperCase() == "S"){
        alert("Correcto")
    } else if (siNo.toUpperCase() == "N"){
        alert("Incorrecto")
    } else{
        alert("Ingrese S/N")
    }
}