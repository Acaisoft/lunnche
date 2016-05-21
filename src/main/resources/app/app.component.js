"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require('angular2/core');
var router_1 = require('angular2/router');
//import './rxjs-operators';
var top_nav_component_1 = require('./top-nav.component');
var new_order_component_1 = require('./newOrder/new-order.component');
var dashboard_component_1 = require('./dashboard.component');
var users_service_1 = require('./users.service');
var AppComponent = (function () {
    function AppComponent() {
    }
    AppComponent = __decorate([
        router_1.RouteConfig([
            {
                path: '/dashboard',
                name: 'Dashboard',
                component: dashboard_component_1.DashboardComponent,
                useAsDefault: true
            },
            {
                path: '/new-order',
                name: 'NewOrder',
                component: new_order_component_1.NewOrderComponent
            }
        ]),
        core_1.Component({
            selector: 'my-app',
            template: "\n        <top-nav></top-nav>\n        <router-outlet></router-outlet>\n    ",
            directives: [router_1.ROUTER_DIRECTIVES, top_nav_component_1.TopNavComponent],
            providers: [users_service_1.UsersService]
        })
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map