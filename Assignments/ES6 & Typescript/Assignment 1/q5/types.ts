let sum=function add(a=2,b=2)
{
    console.log(a+b);
};
sum();
sum(4);
sum(4,4);
sum(undefined,8);


function userFriends(username,...friends)
{
    console.log(username);
    console.log(friends);
}
let username="rishav";
userFriends(username,'Maamin','Alok','Ashutosh','himanshu');


function printCapitalNames(...friends)
{
    console.log(friends.map(i=>i.toUpperCase()));
    for (let i in friends)
    {
        console.log(friends[i]);
    }
}
let friendslist=['rishav','Maamin','Alok','Ashutosh','himanshu'];
printCapitalNames(...friendslist);
