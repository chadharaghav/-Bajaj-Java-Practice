const express = require("express");
const router = express.Router();
const user = require("../user.js");

// for adding a new user
router.post("/sign-up", (req, res) => {

    const data = req.body;
    const new_user = new user({
        email : data.email,
        password : data.password,
        phone : data.phone,
    })

    new_user.save().then(() => {
        console.log(data);
    })
})

module.exports = router;