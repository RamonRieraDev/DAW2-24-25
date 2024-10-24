function separarParaules() {
  let text = prompt("Escriu un text: ");

  textSplit = text.split(" ");

  contador = 0;

  for (i = 0; i < textSplit.length; i++) {
    contador++;
  }

  alert("Hi han " + contador + " paraules");

  alert("La primera paraula és: " + textSplit[0] + " i l'última és: " + textSplit[textSplit.length -1])

  textInvers = ""

  for (i = textSplit.length -1; i < textSplit.length; i--) {
    textInvers = textInvers + textSplit[i] + " ";
  }

  alert("El text invers és: " + textInvers)
  // hola que tal hola que tal
}
