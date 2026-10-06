const input = document.getElementById("input");

const addbtn = document.getElementById("addbtn");

const list = document.getElementById("listitem");

addbtn.addEventListener("click", (event) => {

    event.preventDefault();

    const value = input.value.trim();

    if (value === "") return;

    const li = document.createElement("li");

    li.textContent = value;

    // Create Delete button
    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";

    // Delete item
    deleteBtn.addEventListener("click", () => {
        li.remove();
    });
    li.appendChild(deleteBtn);

    list.appendChild(li);

    input.value = "";
});