let obj = { a: 4, b: 0.5 , c: 0.35, d: 5 };

let arr = Object.values(obj);
let min = Math.min(...arr);
let max = Math.max(...arr);

console.log( `Min value: ${min}, max value: ${max}` );