const express = require("express");
const router = express.Router();
const user = require("../user.js");

// for displaying user data
router.get("/display-all", async(req, res) => {
    const result = await user.find();
    console.log(result);
    users_list = [];
    result.map((item)=>{
        users_list.push(item.email);
    })

    res.send(users_list);
})