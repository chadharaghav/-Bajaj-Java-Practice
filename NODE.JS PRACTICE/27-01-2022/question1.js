// importing dependencies
const fs = require("fs");
const os = require("os");
  
// getting the os version
let os_version = os.version();
// writing the os version to a file
fs.writeFileSync("osVersion.txt", os_version);