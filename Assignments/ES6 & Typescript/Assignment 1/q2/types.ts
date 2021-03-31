/*ERROR:line12 (greet out of scope or cannot find greet)
function fun(name)
{
    if (name=='rishav')
    {
        let greet="hello rishav";
    }
    else
    {
        let greet="hello";
    }
    console.log(greet);
}
fun("rishav");*/

function fun(name)
{
    let greet;
    if (name=='rishav')
    {
        greet="hello rishav";
    }
    else
    {
        greet="hello";
    }
    console.log(greet);
}
fun("ris")

var a=10;
var b=20;
if (a==10)
{
    var a=1;
    let b=2;
    console.log(a);//1 
    console.log(b);//2
}
console.log(a);//1 - functional scope
console.log(b);//20 - blockscope