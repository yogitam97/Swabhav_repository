//console.log(window)
console.log("welcome node")
var index=2
console.log(this)
f1();
function f1(){
    console.log("inside f1")
}

let f2=function(){
    console.log("inside f2")
}
f2()
console.log(global)