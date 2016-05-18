"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var browser_1 = require('angular2/platform/browser');
var core_1 = require('angular2/core');
var order_list_component_1 = require('./orders/order-list.component');
var order_newItem_component_1 = require('./orders/order-newItem.component');
var OrdersMain = (function () {
    // orders: Order[];
    function OrdersMain() {
        /* this.orders = [
             new Order('Adrian Castillo', 'Magiczny Chinczyk', 'Wołowina smażona na gorącym półmisku', 16.00),
             new Order('Maciuś', 'Kebson na cienkim z mieszanym', 'Kebab u Szweda', 10.00)
         ]; */
    }
    OrdersMain = __decorate([
        core_1.Component({
            selector: 'app',
            directives: [order_list_component_1.OrderListComponent, order_newItem_component_1.OrderNewItemComponent],
            templateUrl: 'app/orders/main.component.html'
        })
    ], OrdersMain);
    return OrdersMain;
}());
browser_1.bootstrap(OrdersMain);
//# sourceMappingURL=app.js.map