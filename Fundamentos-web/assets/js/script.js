/* 
por tag = getElementByTagName()
por id = getElementById()
por nome = getElementByName()
por classe = getElementsByClassName()
por seletor = querySelector()
*/

let nome = document.getElementById("nome")
let email = document.querySelector("#email")
let assunto = document.querySelector("#assunto")
let mapa = document.querySelector("#mapa")

let nomeOk = false
let emailOk = false 
let assuntoOk = false

nome.style.width = '39.8%'
email.style.width = '39.8%'

function validaNome () {
    let txtNome = document.querySelector("#txtNome")

    if(nome.value.length < 2) {
        txtNome.innerHTML = "Nome inválido, seu verme"
        txtNome.style.color = "red"
    }
    else {
        txtNome.innerHTML = "Nome válido"
        txtNome.style.color = "green"
        nomeOk = true
    }
}

function validaEmail() {
    let txtEmail = document.querySelector("#txtEmail")

    if(email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1) {
        txtEmail.innerHTML = "Email inválido"
        txtEmail.style.color = "red"
    }
    else {
        txtEmail.innerHTML = "Email válido"
        txtEmail.style.color = "green"
        emailOk = true
    }
}

function validaAssunto() {
    let txtAssunto = document.querySelector("#txtAssunto")

    if(assunto.value.length >= 150) {
        txtAssunto.innerHTML = "Texto muito grande, digite no máximo 150 caracteres."
        txtAssunto.style.color = "red"
        txtAssunto.style.display = "block"
    }
    else {
        txtAssunto.style.display = "none"
        assuntoOk = true
    }
}

function enviar() {
    if(nomeOk == true && assuntoOk == true && emailOk == true) {
        alert("Formulário enviado com sucesso!")
    }
    else {
        alert("Corrija os campos antes de enviar!")
    }
}

function mapaZoom() {
    mapa.style.width = "800px"
    mapa.style.height = "600px"
}

function mapaNormal() {
    mapa.style.width = "400px"
    mapa.style.height = "250px"
}