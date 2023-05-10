
console.log('olá, seja bem vindo ao app...');

const readLine = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readLine.question('Digite seu nome', function (userInput) {
    console.log('Obrigado ' + userInput);
    readLine.close();
})
