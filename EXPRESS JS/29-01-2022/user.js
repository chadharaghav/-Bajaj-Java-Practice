const express = require("express")
const mongoose = require("mongoose")
const app = express()

mongoose.connect(creds, {useNewUrlParser: true, useUnifiedTopology: true})

const user = mongoose.model("Customer", {
   email : {
    type : String,
    unique : true,
    required : [true, "ENTER YOUR EMAIL"],
   },

   password : {
       type : String,
       required : [true, "ENTER YOUR PASSWORD"],
   },

   phone : {
        type : Number,
        required : [true, "ENTER YOUR MOBILE NUMBER"],
        minlength : 10,
        maxlenghth : 10,
   }
})

module.exports = User