function separarParaules() {
  let text = prompt("Escriu un text: ");

  textSplit = text.split(" ");

  contador = 0;

  for (i = 0; i < textSplit.length; i++) {
    contador++;
  }

  alert("Hi han " + contador + " paraules");

  alert(text.indexOf(0))
  // hola que tal hola que tal
}
