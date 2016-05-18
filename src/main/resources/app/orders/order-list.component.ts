import { Component } from 'angular2/core';

import { OrderItemComponent } from './order-item.component';
import { Orders } from './mock-orders'

const order = new Orders();

@Component({
    selector: 'order-list',
    directives: [OrderItemComponent],
    templateUrl: 'app/purchaseOrders/order-list.component.html'
})

export class OrderListComponent {
    // public purchaseOrders = order.purchaseOrders;
    constructor() {
        console.log(Orders.orders);
    }
}
