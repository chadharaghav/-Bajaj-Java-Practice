const express = require("express");
const router = express.Router();
const user = require("../user.js");

// for updating data of a specific user
router.post("/update-user", async (req, res) => {
    const data = req.body;
    const result = await user.findByIdAndUpdate(data.id);
    console.log(result);
    res.send("data updated");
})