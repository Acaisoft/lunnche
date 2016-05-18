"use strict";
var Order_1 = require('./Order');
exports.ORDERS = [
    new Order_1.Order('Adrian Castillo', 'Magiczny Chinczyk', 'Wołowina smażona na gorącym półmisku', 16.00),
    new Order_1.Order('Maciuś', 'Kebson na cienkim z mieszanym', 'Kebab u Szweda', 10.00)
];
var Orders = (function () {
    function Orders() {
        this.orders = [];
    }
    Orders.prototype.addItem = function (newItem) {
        Orders.push(this.order);
        console.log('Add clicked', this.order);
    };
    return Orders;
}());
exports.Orders = Orders;
//# sourceMappingURL=mock-orders.js.map