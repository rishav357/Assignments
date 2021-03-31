var Order={
    id:1,
    title:"order1",
    price:100,
    printOrder:function()
    {
        console.log(this.id);
        console.log(this.title);
    },
    getPrice:function()
    {
        console.log(this.price);
    }
};
var orderDetails =(<any>Object).assign({},Order);
console.log(orderDetails);