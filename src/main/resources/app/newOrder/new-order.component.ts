import {Component, Inject, AfterViewInit, OnInit} from 'angular2/core';
import {ROUTER_DIRECTIVES} from 'angular2/router';

import {RestaurantService} from '../restaurant.service'
import {Order} from '../Order';

import {ItemComponent} from './item.component'
import {Validators, FormBuilder, ControlGroup, NgFormModel, FORM_DIRECTIVES, FORM_PROVIDERS} from "angular2/common";

@Component({
    selector: 'new-order',
    templateUrl: 'app/newOrder/new-order.component.html',
    directives: [ROUTER_DIRECTIVES, ItemComponent, FORM_DIRECTIVES, NgFormModel],
    providers: [FORM_PROVIDERS],
})
export class NewOrderComponent implements AfterViewInit, OnInit {
    public orders:Order[];
    public formnew:ControlGroup;

    public comps = [
        {id: 1, name: "lol"},
        {id: 2, name: "olo"}
    ];
    public dishes = [
        {id: 1, name: "mom"},
        {id: 2, name: "omo"}
    ];

    constructor(@Inject(FormBuilder) public formBuilder:FormBuilder,
                @Inject(RestaurantService) public restaurantService:RestaurantService) {
        this.orders = [];
        this.formnew = this.formBuilder.group({
            compName: ['', Validators.required],
            dishName: ['', Validators.required]
        });
    }

    add() {
        this.formnew.value.dishName = returnValue("newItem-dish");
        this.formnew.value.compName = returnValue("newItem-comp");
        this.orders.push(this.formnew.value);
        console.log(this.formnew.value);
    }

    remove(name:string):void {

    }

    ngAfterViewInit() {
        jQueryTest();
    }
}