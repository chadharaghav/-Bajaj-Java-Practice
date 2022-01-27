// importing dependencies
const fs = require("fs");
path = require('path');

// reading data from a file

firstFilePath = path.join(__dirname, 'file_one.txt');
let firstFileData = fs.readFileSync(firstFilePath, {encoding: 'utf8'});

secondFilePath = path.join(__dirname, 'file_two.txt');
let secondFileData = fs.readFileSync(secondFilePath, {encoding: 'utf8'});

// combining and writing the data to a new text file
fs.writeFileSync("merged.txt", firstFileData + secondFileData);