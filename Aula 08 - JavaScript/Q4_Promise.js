const teste01 = new Promise((resolve) => {
    setTimeout( function(){
        resolve("a vem primeiro");
    }, 3000)
})

const teste02 = new Promise((resolve) => {
        resolve("b vem depois");
})

teste01.then(function(res) {return console.log(res)})
       .then(function(){return teste02})
       .then(function(res) {return console.log(res)})
       