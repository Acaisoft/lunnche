import { Component, Input } from 'angular2/core';
import { Order } from './Order';

@Component({
    selector: 'order-item',
    templateUrl: 'app/purchaseOrders/order-item.component.html'
})

export class OrderItemComponent {
    @Input() order;
    constructor() {
    }
}
