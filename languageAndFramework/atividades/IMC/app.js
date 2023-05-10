async function appAsync() {
    console.log('\x1b[36m%s\x1b[0m', "** Calculadora IMC ** \n ");
    const weight = await readPositiveNumbericValue("Digite seu peso em kg: ");
    const height = await readPositiveNumbericValue("Digite sua altura em metro: ");
    const imc = (weight / Math.pow(height, 2)).toFixed(1);
    const classification = IMCClassification(imc);
    console.log(`\n Seu IMC é de ${imc}kg/m². Este valor é considerado como ${classification}\x1b[37m.\n`);
}
async function readPositiveNumbericValue(message) {
    let result = await ask(`\n ${message}`);

    while (isNaN(result) || result <= 0) {
        console.error(
            `\n O valor digitado ${result} não é um valor númérico positivo. Tente novamente!`
        );
        result = await ask(`\n ${message}`);
    }
    return result;
}
function IMCClassification(imc) {
    if (isNaN(imc)) {
        throw error('O valor informado não é um valor numérico!');
    }
    switch (true) {
        case imc <= 18.5:
            return "\x1b[33mMagreza";
        case imc >= 18.5 && imc <= 24.9:
            return "\x1b[32mNormal";
        case imc > 24.9 && imc <= 30:
            return "\x1b[33mSobrepeso";
        case imc > 30:
            return "\x1b[31mObesidade";
    }
}
function ask(message) {
    const rlp = require("readline");
    const rl = rlp.createInterface({
        input: process.stdin,
        output: process.stdout,
    });
    return new Promise((resolve) => {
        rl.question(`${message}`, (input) => { rl.close(); return resolve(input) });
    });
}
appAsync();
