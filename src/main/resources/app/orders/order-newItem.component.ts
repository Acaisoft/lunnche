import { Component } from 'angular2/core';

import { Orders } from './mock-orders'
import { Order } from './Order';

@Component({
    selector: '.order-newItem',
    templateUrl: 'app/orders/order-newItem.component.html'
})

export class OrderNewItemComponent {
    pubName: string = "";
    dishName: string = "";
    order: Order = new Order('dupa', this.pubName, this.dishName, 10);

    addClicked() {
        Orders.push(this.order);
        console.log('Add clicked', this.order);
    }
    newItemChanged(event: KeyboardEvent, inpChanged): void {
        const target = <HTMLInputElement> event.target;
        switch (inpChanged) {
            case "pubName":
                this.order.pubName = target.value;
                break;
            case "dishName":
                this.order.dishName = target.value;
                break;
        }
    }
    constructor() {

    }
}
