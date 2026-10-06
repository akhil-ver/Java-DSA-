const form = document.getElementById("form");

const email = document.getElementById("email");
const password = document.getElementById("password");
const repassword = document.getElementById("re-password");

const result = document.getElementById("result");

form.addEventListener("submit", (event) => {

    event.preventDefault();

    if (password.value !== repassword.value) {

        result.innerHTML = "Password does not match";
        result.style.color = "red";

    } else {

        result.innerHTML = "Password matched successfully";
        result.style.color = "green";

    }

});