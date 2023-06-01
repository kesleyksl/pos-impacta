const express = require('express');
const router = express.Router();

router.post('/calculate', function (req, res, next) {

    const pessoa = {};
    pessoa.peso = req.body.peso;
    pessoa.altura = req.body.altura;

    if (!pessoa.peso || !pessoa.altura || pessoa.peso <= 0 || pessoa.altura <= 0) {
        return res.status(400).json({ error: 'Você deve fornecer o peso e a altura' });
    }

    pessoa.imc = calculateImc(pessoa.peso, pessoa.altura);
    pessoa.descricao = IMCClassification(pessoa.imc);
    res.json(pessoa);
});

function IMCClassification(imc) {
    if (isNaN(imc)) {
        throw error('O valor informado não é um valor numérico!');
    }
    switch (true) {
        case imc <= 18.5:
            return "Magreza";
        case imc < 24.9:
            return "Normal";
        case imc < 30:
            return "Sobrepeso";
        default:
            return "Obesidade";
    }
}

function calculateImc(peso, altura) {
    const imc = (peso / Math.pow(altura, 2)).toFixed(1);
    return imc;
}
module.exports = router;
