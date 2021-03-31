var array=["Rishav","Das","Mohapatra","Male"];
var [fname,mname,lname,gender]=array;
console.log(array[2]);
console.log(fname);
console.log(mname);
console.log(lname);
console.log(gender);

var organization ={
    Name:"ABCD",
    Address:
    {
        City:"Rourkela",
        Pin:"769042"
    }
};
var {Name,Address:{City,Pin}}=organization;
console.log(Pin);