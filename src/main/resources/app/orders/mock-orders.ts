import { Order } from './Order';

export var ORDERS: Order[] = [
    new Order('Adrian Castillo', 'Magiczny Chinczyk', 'Wołowina smażona na gorącym półmisku', 16.00),
    new Order('Maciuś', 'Kebson na cienkim z mieszanym', 'Kebab u Szweda', 10.00)
];

export class Orders {
    orders: Order[];

    constructor() {
        this.orders = [];
    }

    addItem(newItem: string) {
        Orders.push(this.order);
        console.log('Add clicked', this.order);
    }
    /*orders: Order[] = [
        new Order('Adrian Castillo', 'Magiczny Chinczyk', 'Wołowina smażona na gorącym półmisku', 16.00),
        new Order('Maciuś', 'Kebson na cienkim z mieszanym', 'Kebab u Szweda', 10.00)
    ];*/
}
