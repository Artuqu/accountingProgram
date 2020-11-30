document.addEventListener("DOMContentLoaded", function () {

function getVatValue() {
        var count1 = document.querySelector("#vat").value;
    let val = 0

    function TAX() {
        if (count1 === 1) {
            val = 1;
        } else if (count1 === 2) {
            val = 1.05;
        } else if (count1 === 3) {
            val = 1.08;
        } else if (count1 === 4) {
            val = 1.23;

    }
    return val;
    }
return val;
}


let vatValue = document.querySelector("#vat").value=getVatValue();
let count2 = document.querySelector("#amountNetto").value;
let sum = document.querySelector("#amountBrutto").value = vatValue*count2;
// })
// onchange on lost focus
// let value1 = count1.value;
console.log(count2);
console.log(vatValue);
console.log(sum);
// let multiple = count2.value*count1.value;
//     if (typeof sum !== 'undefined') {
// sum.input= multiple};
// count1.addEventListener("onmouseover", function () {
//     sum.innerText = value1 * value2;
//
// });
// count2.addEventListener("onmouseover", function () {
//     sum.innerText = value2;

// });
// sum.innerText=value2;
// console.log(value2);

})