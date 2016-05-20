import {Component, Input} from 'angular2/core';

@Component({
    selector: 'order-item',
    templateUrl: 'app/newOrder/item.component.html'
})
export class ItemComponent {
    @Input() order;
    constructor() {
        console.log(orders);
    }
}