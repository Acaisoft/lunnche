"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require('angular2/core');
var mock_orders_1 = require('./mock-orders');
var Order_1 = require('./Order');
var OrderNewItemComponent = (function () {
    function OrderNewItemComponent() {
        this.pubName = "";
        this.dishName = "";
        this.order = new Order_1.Order('dupa', this.pubName, this.dishName, 10);
    }
    OrderNewItemComponent.prototype.addClicked = function () {
        mock_orders_1.Orders.push(this.order);
        console.log('Add clicked', this.order);
    };
    OrderNewItemComponent.prototype.newItemChanged = function (event, inpChanged) {
        var target = event.target;
        switch (inpChanged) {
            case "pubName":
                this.order.pubName = target.value;
                break;
            case "dishName":
                this.order.dishName = target.value;
                break;
        }
    };
    OrderNewItemComponent = __decorate([
        core_1.Component({
            selector: '.order-newItem',
            templateUrl: 'app/orders/order-newItem.component.html'
        })
    ], OrderNewItemComponent);
    return OrderNewItemComponent;
}());
exports.OrderNewItemComponent = OrderNewItemComponent;
//# sourceMappingURL=order-newItem.component.js.map