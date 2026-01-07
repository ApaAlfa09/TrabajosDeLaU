const titulo = document.getElementById("miTitulo");
console.log(titulo.textContent);
titulo.style.color = "blue";

function cambiarTexto(){
    let elemento = document.getElementById("miTitulo");
    elemento.innerHTML = "Hola Mundo";
    elemento.style.color = "red";
}

const nuevoParrafo = document.createElement("p");
nuevoParrafo.textContent = "Hola desde JS";
document.body.appendChild(nuevoParrafo);

const boton = document.getElementById("miBoton");
boton.addEventListener("click", function () {
    alert("Click Dectectado");
})

console.log("Hello world");
alert("hello");
const value = prompt("ingrese un valor");
alert(value);
console.log(value);


"use strict"
height = 180;
console.log(height); //->180
console.log("height"); //->height
console.log("hola");