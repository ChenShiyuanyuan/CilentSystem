const signinBtn =document.getElementById("signin");
const signupBtn =document.getElementById("signup");
const fistForm =document.getElementById("from1");
const secondForm =document.getElementById("from2");
const container =document.getElementById(".container");

// signinBtn.addEventListener("click",() =>{
//     container.classList.remove("right-panel-active")
// })
//
// signupBtn.addEventListener("click",()=>{
//     container.classList.add("right-panel-active")
// })

signinBtn.addEventListener("click",() =>{
    container.className = "container--signup"
})

signupBtn.addEventListener("click",()=>{
    container.className = "container--signin"
})

fistForm.addEventListener("submit",(e) => e.preventDefault())
secondForm.addEventListener("submit",(e) => e.preventDefault())