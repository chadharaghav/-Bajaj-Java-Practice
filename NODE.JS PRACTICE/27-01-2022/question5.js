// importing dependencies
const fs = require('fs');

// reading the text file
var text = fs.readFileSync("question5_read.txt", 'utf-8');
// splitting the text files by lines
var textByLine = text.split('\r\n');

for (line in textByLine) {
    console.log(textByLine[line]);
}