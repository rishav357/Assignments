
/*
Q1
*/
var promise1 = new Promise(function(resolve,reject){
    let x=2;
    if(x!=0){
        resolve(x);
    }
    else{
        reject("x value is 0");
    }
 })
 var promise2 = new Promise(function(resolve,reject){
    let y=5;
    if(y!=0){
        resolve(y);
    }
    else{
        reject("y value is 0");
    }
 })
 
 
 Promise.all([promise1,promise2]).then(function(values){
     const sum =0;
    for(let num in values){
        sum+=values[num];
    }
    console.log(sum)
 })
 var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();

/*
Q2
*/

class Account1{
    id:number;
    name:string;
    balance:number;
   constructor(id:number,name:string,balance:number){
       this.id=id;
       this.name= name;
       this.balance = balance;
   }
}

class SavingAccount1 extends Account1{
   interest:number;
   totalBalance:number;
  constructor(id:number,name:string,balance:number,interest:number){
         super(id,name,balance)
         this.interest  = interest;
  }
  getBalance(){
      this.totalBalance=0;
      this.totalBalance = this.balance + (this.balance*this.interest);
      return this.totalBalance;
  }
}

class CurrentAccount1 extends Account1{
   cash_credit:number;
   totalBalance:number;
  constructor(id:number,name:string,balance:number,cash_credit:number){
         super(id,name,balance);
         this.cash_credit  = cash_credit;
  }
  getBalance(){
      this.totalBalance=0;
      this.totalBalance = this.balance -this.cash_credit;
      return this.totalBalance;
  }
}

let SavingAccountObj = new SavingAccount1(11,"john",1500,10);
console.log(SavingAccountObj.getBalance())

let CurrentAccountObj = new CurrentAccount1(11,"jack",15000,500);
console.log(CurrentAccountObj.getBalance())

/*
Q3
*/

interface Printable{
    print():string;
}

class Circle implements Printable{
    radius:number;
    constructor(radius:number){
        this.radius=radius;
    }
    print(): string {
        return "The radius of Cicle is "+this.radius +"\nArea is "+ (Math.PI*this.radius*this.radius);
    }

}
class Employee implements Printable{
    ename:string;
    eid:number;
    edesignatio:string;
    constructor( ename:string,eid:number,edesignatio:string){
        this.eid=eid;
        this.ename=ename;
        this.edesignatio=edesignatio;
    }
    print(): string {
        return "Employee Details:\n"+"Employee Id:"+this.eid+"\n"+"Employee Name: "+this.ename 
              +"\n"+"Employee Designation: "+this.edesignatio;
    }

}
function printAll(obj1,obj2){
    console.log(obj1.print());
    console.log(obj2.print());
}
let circleObj = new Circle(2);
let employeeObj = new Employee("suresh",32,"senior developer");

printAll(circleObj,employeeObj);
