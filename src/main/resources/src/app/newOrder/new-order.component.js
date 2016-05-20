"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
var core_1 = require('angular2/core');
var router_1 = require('angular2/router');
var restaurant_service_1 = require('../restaurant.service');
var item_component_1 = require('./item.component');
var common_1 = require("angular2/common");
var NewOrderComponent = (function () {
    function NewOrderComponent(formBuilder, restaurantService) {
        this.formBuilder = formBuilder;
        this.restaurantService = restaurantService;
        this.comps = [
            { id: 1, name: "lol" },
            { id: 2, name: "olo" }
        ];
        this.dishes = [
            { id: 1, name: "mom" },
            { id: 2, name: "omo" }
        ];
        this.orders = [];
        this.formnew = this.formBuilder.group({
            compName: ['', common_1.Validators.required],
            dishName: ['', common_1.Validators.required]
        });
    }
    NewOrderComponent.prototype.add = function () {
        this.formnew.value.dishName = returnValue("newItem-dish");
        this.formnew.value.compName = returnValue("newItem-comp");
        this.orders.push(this.formnew.value);
        console.log(this.formnew.value);
    };
    NewOrderComponent.prototype.remove = function (name) {
    };
    NewOrderComponent.prototype.ngAfterViewInit = function () {
        jQueryTest();
    };
    NewOrderComponent = __decorate([
        core_1.Component({
            selector: 'new-order',
            templateUrl: 'app/newOrder/new-order.component.html',
            directives: [router_1.ROUTER_DIRECTIVES, item_component_1.ItemComponent, common_1.FORM_DIRECTIVES, common_1.NgFormModel],
            providers: [common_1.FORM_PROVIDERS]
        }),
        __param(0, core_1.Inject(common_1.FormBuilder)),
        __param(1, core_1.Inject(restaurant_service_1.RestaurantService))
    ], NewOrderComponent);
    return NewOrderComponent;
}());
exports.NewOrderComponent = NewOrderComponent;
//# sourceMappingURL=new-order.component.js.map