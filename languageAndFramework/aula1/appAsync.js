// async function appAsync() {
//     const rlp = require('readline');
//     const rl = rlp.createInterface({
//         input: process.stdin,
//         output: process.stdout
//     });

//     function ask() {
//         return new Promise(resolve => {
//             rl.question('Enter input: ', input => resolve(input));
//         });
//     }
//     const result = await ask();
//     console.log(result);
//     rl.close()
//     console.log('Executado após o await')
// }
// appAsync();


// class Age {
//     //TODO: Crie um construtor que receba a data de nascimento como parâmetro
//     construtor(dataNascimento) {
//         this.dataNascimento = dataNascimento;
//     }
//     //TODO Criar uma função que calcula a idade
//     calculateAge() {
//         const hoje = new Date();
//         console.log(this.dataNascimentos)
//         const dataNascimentoDate = new Date(this.dataNascimento);
//         let anos = hoje.getFullYear() - dataNascimentoDate.getFullYear();
//         const meses = hoje.getMonth() - dataNascimentoDate.getMonth();
//         const dias = hoje.getDate() - dataNascimentoDate.getDate();

//         if (meses < 0 || (meses === 0 && dias < 0)) {
//             anos--;
//         }

//         return anos;

//     }

// }

// let a = new Age('1994-01-13');
// console.log(a.dataNascimento)

class Age {
    constructor(dataNascimento) {
        this.dataNascimento = new Date(dataNascimento);
    }

    calculateAge() {
        const hoje = new Date();
        let anos = hoje.getFullYear() - this.dataNascimento.getFullYear();
        const meses = hoje.getMonth() - this.dataNascimento.getMonth();
        const dias = hoje.getDate() - this.dataNascimento.getDate();

        if (meses < 0 || (meses === 0 && dias < 0)) {
            anos--;
        }

        return anos;
    }
}

let a = new Age('1994-01-13');
console.log(a.calculateAge())