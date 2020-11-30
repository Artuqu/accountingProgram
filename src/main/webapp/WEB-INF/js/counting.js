document.addEventListener("DOMContentLoaded", function () {
let count1 = document.querySelector(".id.vat");
let count2 = document.querySelector(".id.amountNetto");
let sum = document.querySelector(".id.amountBrutto");
count1.addEventListener("click", function () {
    sum.innerText = count1 * count2;

});
count2.addEventListener("onmouseover", function () {
    sum.innerText = count1 * count2;

});

})