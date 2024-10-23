function textEmailDomini(){
    
    emailInput = document.getElementById("email")
    usuariInput = emailInput.value

    email = usuariInput.split("@")

    document.getElementById("usuari").innerText = "L'usuari és: " + email[0]

    dominiInput = usuariInput
    domini = dominiInput.value
    document.getElementById("domini").innerText = "El domini és: " + email[1]
}

// info@ramonriera.es