function gerarSenha(){
    console.log("Função gerarSenha() está sendo chamada do JS");

    const configuracoes = {
        tamanho: parseInt(document.getElementById("quantidadeCaracteres").value),
        maiusculas: document.getElementById("temMaiusculas").checked,
        minusculas: document.getElementById("temMinusculas").checked,
        digitos: document.getElementById("temDigitos").checked,
        simbolos: document.getElementById("temSimbolos").checked
    };

    fetch("http://localhost:8080/api/senhas/gerar", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(configuracoes)
    })

    .then(response =>{
        console.log("Status da resposta: ", response.status);
        if (!response.ok){
            throw new Error("Erro na resposta do servidor");
        }
        return response.text();
    })
    .then(senhaGerada => {
        console.log("Senha recebida: ", senhaGerada);
        document.getElementById("resultado").innerText = senhaGerada;
    })

    .catch (erro => {
        console.error("Erro ao gerar senha: ", erro);
        document.getElementById("resultado").innerText = "Erro ao gerar senha.";
    });

    copiarSenha(senhaGerada);
}


/*function copiarSenha(){
    const resultado = document.getElementById("resultado").innerText;

    if (!resultado){
        alert("Nada para copiar!");
        return;
    }

    const temInput = document.createElement("input");
    temInput.value = resultado;
    document.body.appendChild(temInput);
    temInput.select();
    document.execCommand("copy");
    document.body.removeChild(temInput);

}*/

function copiarSenha(resultado){

    if (!resultado){
        alert("Nada para copiar!");
        return;
    }

    navigator.clipboard.writeText(resultado)
        .then(() => {
            alert("Senha copiada com sucesso!");
        })
        .catch (erro => {
            console.erro("Erro ao copiar a senha.");
            alert("Erro ao copiar a senha.")
        });
}