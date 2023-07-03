//anonymous functions
/*

*/
let person = {
  firstName: "John",
  lastName: "Doe",
};

(function () {
  console.log(person.firstName + " " + person.lastName);
})(person);
(function () {
  console.log("Hello");
})();
