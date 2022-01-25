function unique_elements(arr) {
    const unique = new Set();
    for (var i=0; i<arr.length; ++i) {
        unique.add(arr[i]);
    }
    
    let result = Array.from(unique);
    return result;
}

let strings = ["React Js", "JavaScript", "React Js", "JavaScript",
"JavaScript", "JavaScript", "React Js", "React Js"
];

console.log(unique_elements(strings));