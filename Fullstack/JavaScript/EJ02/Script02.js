

function Calcular(){
    const radioE=parseFloat(document.getElementById("radio").value);
    let area = Math.PI*(Math.pow(radioE,2));
    document.getElementById("areaR").value = area.toFixed(2);

    let perimetro = 2 * Math.PI*radioE;
     document.getElementById("perimetroR").value = perimetro.toFixed(2)
}