const teste01 = new Promise((resolve) => {setTimeout( function(){resolve("a vem primeiro");}, 3000)});
const teste02 = new Promise((resolve) => {resolve("b vem depois");});

const asyncFunction = async () => {
    try {
        const firstPart = await teste01;
        const secondPart = await teste02;
        console.log(firstPart);
        console.log(secondPart);
    }
    catch(err){
        console.log(err);
    }
}

asyncFunction();