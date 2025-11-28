# 🔐Gerador de Senhas

O Gerador de Senhas é uma aplicação simples e prática que permite criar senhas personalizadas de forma rápida e segura.
Você pode escolher o tamanho da senha e definir se deseja incluir letras maiúsculas, minúsculas, números e símbolos.

Após gerar, a senha pode ser copiada com um clique para ser usada onde quiser — garantindo praticidade e mais segurança nas suas contas.

## 🚀Tecnologias utilizadas

Back-end ->
Java 17+,
Spring Boot,
Maven

Front-end ->
HTML, CSS e JavaScript puro


## ⚙️Como executar o projeto  

🖥️ 1. Clonar o repositório  
```  
git clone https://github.com/seu-usuario/gerador-senhas.git

```


### 🔧2. Executar o back-end (Spring Boot)

1 - Acesse a pasta do projeto back-end:  
```bash
cd gerador-senhas/back-end
```

2 - Compile e execute o projeto com Maven:  
```bash
mvn spring-boot:run
```

3 - O servidor iniciará em:  
```
http://localhost:8080
```

### 💻3. Executar o front-end

1 - Acesse a pasta do front-end:  
```bash
cd gerador-senhas/front-end
```
2 - Abra o arquivo index.html diretamente no navegador
ou utilize uma extensão de servidor local (como Live Server no VS Code).

3 - O front-end fará requisições para o back-end na ```porta 8080```.
Certifique-se de que o back-end está rodando antes de gerar senhas.
