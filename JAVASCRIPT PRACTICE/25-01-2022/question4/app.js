function extractCurrencyValue(str) {
    let result = str.slice(1, str.length);
    result = parseInt(result);
    return result;
}

console.log(extractCurrencyValue('$43789'))