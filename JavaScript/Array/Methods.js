var Stud = new Object();
Stud.Maths = 30;
Stud.Physics = 20;
Stud.Chemistry = 10;

let x = 0;
let ans = "";
for (let i in Stud) {
  console.log(i);
  if (Stud[i] > x) {
    x = Stud[i];
    ans = i;
  }
}
console.log(ans);
