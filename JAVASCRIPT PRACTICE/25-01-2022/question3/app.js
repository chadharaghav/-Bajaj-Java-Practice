function truncate(str, maxlength) {
    if (str.length <= maxlength) {
        return str;
    }

    let result = str.slice(0, maxlength - 1);
    result += "...";
    return result;
}

console.log(truncate("What I'd like to tell on this topic is:", 20));
console.log(truncate("Hi everyone!", 20));