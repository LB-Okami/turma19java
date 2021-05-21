let email = document.querySelector("#email")
let nome = document.querySelector("#nome")
let assunto = document.querySelector("#assunto")

let nomeOk = false
let emailOk = false 
let assuntoOk = false

function validaNome() {
    let txtNome = document.querySelector("#txtNome")

    if(nome.value.length < 2) {
        txtNome.innerHTML= "Insira um nome válido!"
        txtNome.style.color = "red"
    }
    else
    {
        txtNome.innerHTML = "Nome válido"
        txtNome.style.color = "green"
        nomeOk = true
    }
}

function validaEmail() {
    let txtEmail = document.querySelector("#txtEmail")

    if(email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1) {
        txtEmail.innerHTML = "Digite um e-mail válido!"
        txtEmail.style.color = "red"
        txtAssunto.style.display = "block"
    }
    else {
        txtEmail.innerHTML = "Email válido"
        txtEmail.style.color = "green"
        emailOk = true
    }
}

function enviar() {
    if(emailOk == true && nomeOk == true) {
        alert("Formúlário enviado com sucesso!")
    }
    else {
        alert("Corrija os campos antes de enviar!")
    }
}



