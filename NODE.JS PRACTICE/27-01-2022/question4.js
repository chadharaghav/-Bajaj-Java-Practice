const fs = require('fs');
const { PassThrough } = require('stream');
path = require('path');

// JSON objects to store all the files and sub folders
var contents = {}

// function to recursively read all the file names and nested folders inside the root folder.
function listContents(folderName) {
    if (folderName in contents) {
        
    } else {
        contents[folderName] = [];
    }
    fs.readdirSync(folderName).forEach(file => {
        if (file.includes('.')) {
            contents[folderName].push(file);
        } else {
            contents[folderName].push(file);
            listContents(folderName.concat(`/${file}`));
        }
    });
}

// path to the 'root' folder
const folder = __dirname;
listContents(folder);
console.log(contents);