let signup = document.getElementById("submit");
let firstName = document.getElementById("firstname");
let lastName = document.getElementById("lastname");
let email = document.getElementById("email");
let password = document.getElementById("password");
let form = document.forms[0];
let valid = true;
let firstNameValidError;
let lastNameValidError;
let firstNameError = document.getElementById("firstNameError");
let lastNameError = document.getElementById("lastNameError");
let emailError = document.getElementById("emailError");
let passwordError = document.getElementById("passwordError");

// success.style.display = "none";
// error.style.display = "none";




signup.addEventListener("click", function () {
    let firstNameValid = true;
    let lastNameValid = true;
    let emailValid = true;
    let passwordValid = true;

    if (firstName.value == "") {

        firstNameError.innerText = "First name is required";
        firstNamevalid = false;

    }
    if (!firstName.value.match(/^[A-Za-z]+$/)) {

        firstNameError.innerText = "Numbers cannot be included in name";
        firstNamevalid = false;
    }
    if (lastName.value == "") {

        lastNameError.innerText = "Last name is required";
        lastNamevalid = false;
    }
    if (!lastName.value.match(/^[A-Za-z]+$/)) {

        lastNameError.innerText = "Numbers and Special Characters can not be included in Lastname";
        lastNamevalid = false;
    }
    if (email.value == "") {
        emailError.innerText = "Email is mandatory";
        emailValid = false;
    }
    if (!email.value.match(/\S+@\S+\.\S+/)) {
        emailError.innerText = "Enter in valid format. Example abc@gmail.com";
        emailValid = false;
    }
    if (password.value == "") {
        passwordError.innerText = "Password is Mandatory";
        passwordValid = false;
    }
    console.log(valid);
    if (firstNameValid == true && lastNameValid == true && emailValid == true && passwordValid == true && firstNameValidError == true && lastNameValidError == true) {

        console.log("Clicked");
        addCustomer();
    }
});

firstName.addEventListener("keyup", function () {
    //console.log(firstName.value);
    firstNameValidError = true;
    if (firstName.value != "" && firstName.value.length > 20) {
        firstNameValidError = false;
        firstNameError.innerText = "First Name cannot exceed 20 characters";
        return;
    }
    if (firstName.value != "" && firstName.value.length <= 20) {


        firstNameError.innerText = "";
        return;
    }


});
lastName.addEventListener("keyup", function () {
    //console.log(firstName.value);
    lastNameValidError = true;
    if (lastName.value != "" && lastName.value.length > 20) {
        lastNameValidError = false;

        lastNameError.innerText = "Last Name cannot exceed 20 characters";
        return;
    }
    if (lastName.value != "" && lastName.value.length <= 20) {

        //  lastNameError.innerText = "";
        lastNameError.innerText = "";
        return;
    }
});
email.addEventListener("keyup", function () {

    if (email.value != "") {

        emailError.innerText = "";
        return;
    }
});

password.addEventListener("keyup", function () {
    if (password.value != "" && password.value.length <= 20) {

        passwordError.innerText = "";
        return;
    }
})

async function addCustomer() {
    let customer = {
        firstName: firstName.value,
        lastName: lastName.value,
        email: email.value,
        password: password.value
    };

    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(customer)
    };

    try {
        let response = await fetch("http://localhost:8081/bank-app-rest/customers", options);
        clearFormData();
        success.style.display = "block";
        success.innerText = "Customer Added Successfully";
        //window.location.href = "login.html"
    }
    catch (err) {
        error.style.display = "block";
        error.innerText = "Failed to add employee. Retry or report to site administrator."
    }
}
function clearFormData() {
    form.firstname.value = "",
        form.lastname.value = "",
        form.email.value = "",
        form.password.value = ""
}