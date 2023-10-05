const palabra = document.getElementById('palabra');
const boton = document.getElementById('boton');
const resultado = document.getElementById('resultado');
boton.addEventListener('click', voltear);

function voltear(){
    console.log(palabra);
    let palabra1=palabra.value;
    console.log(palabra1);
    let arr= palabra1.split("");
   resultado.value = arr.reverse().join("");

}