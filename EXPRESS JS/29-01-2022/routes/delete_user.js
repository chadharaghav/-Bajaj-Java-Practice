const express = require("express");
const router = express.Router();
const user = require("../user.js");

// for deleting the details of a user
router.post("/delete-user", async(req, res) => {
    const data = req.body;
    const result = await user.findByIdAndDelete(data.id);
    res.send("user deleted successfully!");
})