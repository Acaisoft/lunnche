import { Component } from 'angular2/core';

import { OrderItemComponent } from './order-item.component';
import { Orders } from './mock-orders'

const order = new Orders();

@Component({
    selector: 'order-list',
    directives: [OrderItemComponent],
    templateUrl: 'app/orders/order-list.component.html'
})

export class OrderListComponent {
    // public orders = order.orders;
    constructor() {
        console.log(Orders.orders);
    }
}
