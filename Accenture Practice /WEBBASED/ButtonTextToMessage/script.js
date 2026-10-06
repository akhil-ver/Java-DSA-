const buttons = document.querySelectorAll("button");
const message = document.getElementById("message");


buttons.forEach(button => {
    button.addEventListener("click",(event)=>{
    event.preventDefault;
    message.textContent = button.textContent;
})
});