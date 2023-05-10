async function appAsync() {
    const rlp = require('readline');
    const rl = rlp.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    function ask() {
        return new Promise(resolve => {
            rl.question('Enter input: ', input => resolve(input));
        });
    }
    const result = await ask();
    console.log(result);
    rl.close()
    console.log('Executado após o await')
}
appAsync();

