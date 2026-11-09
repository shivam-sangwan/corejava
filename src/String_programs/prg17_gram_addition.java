//find sum of elements of given array
const a = ["10kg", "100gm", "100gm"];
let sum = 0;
for(let e of a)
{
  if(e.endsWith("kg"))
  {
    sum += parseInt(e);
  }
  else if(e.endsWith("gm"))
  {
    sum += parseInt(e)/1000;
  }
}
console.log(sum + " kg")
