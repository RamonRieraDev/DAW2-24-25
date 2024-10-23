function xaparText() {
  textXapat = document.getElementById("demo").innerText;

  textXapatMitat = textXapat.length / 2;

  document.getElementById("text1").innerText = textXapat.slice(
    0,
    textXapatMitat
  );

  document.getElementById("text2").innerText = textXapat.slice(textXapatMitat);
}
