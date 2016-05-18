import { bootstrap } from 'angular2/platform/browser';
import { Component } from 'angular2/core';

import { OrderListComponent } from './orders/order-list.component';
import { OrderNewItemComponent } from './orders/order-newItem.component';

@Component({
    selector: 'app',
    directives: [OrderListComponent, OrderNewItemComponent],
    templateUrl: 'app/orders/main.component.html'
})

class OrdersMain {
    // orders: Order[];

    constructor() {
       /* this.orders = [
            new Order('Adrian Castillo', 'Magiczny Chinczyk', 'Wołowina smażona na gorącym półmisku', 16.00),
            new Order('Maciuś', 'Kebson na cienkim z mieszanym', 'Kebab u Szweda', 10.00)
        ]; */
    }
}

bootstrap(OrdersMain);
