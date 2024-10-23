function textEmailDomini() {
  emailInput = document.getElementById("email");
  usuariInput = emailInput.value;

  emailSlice = usuariInput.indexOf("@");

  document.getElementById("usuari").innerText =
    "L'usuari és: " + usuariInput.slice(0, emailSlice);

  dominiInput = usuariInput;
  domini = dominiInput.value;
  document.getElementById("domini").innerText =
    "El domini és: " + usuariInput.slice(emailSlice + 1);
}

// info@ramonriera.es
