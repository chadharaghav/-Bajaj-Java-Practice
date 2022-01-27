// importing dependencies
const fs = require("fs");
path = require('path');

// writing data to a file

let dummy_data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tortor lacus, dictum non ornare sed, dignissim eu ligula. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vestibulum pellentesque fringilla risus, id iaculis ex consequat quis. Sed rhoncus libero quis pellentesque mollis. Donec id justo faucibus, auctor ex tristique, consequat erat. Maecenas consequat mi sit amet tellus pellentesque, nec faucibus nulla mattis. Integer iaculis nunc vehicula, condimentum mauris at, dapibus lorem. Duis ornare facilisis diam vitae tempus. Nunc dui orci, pretium eu aliquet vel, vestibulum et est. Integer dapibus augue eget libero aliquet, at pulvinar turpis. ";

fs.writeFileSync("data.txt", dummy_data);

// reading data from a file

filePath = path.join(__dirname, 'data.txt');
let fileData = fs.readFileSync(filePath, {encoding: 'utf8'});
console.log(fileData);