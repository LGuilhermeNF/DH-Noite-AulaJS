let produtos = [
    {
        nome: "aguas", 
        valor: 15
    }, 
    {
        nome: "pizza", 
        valor: 10
    },
    {
        nome: "refri", 
        valor: 35
    }
];

let total = produtos.reduce((soma, precos) => {
        return soma + precos.valor;
    }, 0
)

console.log(total);
