class Account
{
    Id:number;
    Name:string;
    Balance:number;
    constructor()
    {
        this.Id=121;
        this.Name="ahmen";
        this.Balance=20;
    }
    getBalance()
    {
        return this.Balance;
    }

}
class CurrentAccount extends Account
{
    cash_credit:number;
    constructor(cash_credit)
    {
        super();
        this.Balance=this.Balance+cash_credit;
    }
}
let a=new Account();
console.log(a);


let ca1=new CurrentAccount(20);
console.log(ca1);
