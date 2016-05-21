import {Component, Inject} from 'angular2/core';
import {ROUTER_DIRECTIVES, RouteConfig} from 'angular2/router';

//import './rxjs-operators';
import {TopNavComponent} from './top-nav.component';
import {NewOrderComponent} from './newOrder/new-order.component';
import {DashboardComponent} from './dashboard.component';

import {User} from './user';
import {UsersService} from './users.service';

@RouteConfig([
    {
        path: '/dashboard',
        name: 'Dashboard',
        component: DashboardComponent,
        useAsDefault: true
    },
    {
        path: '/new-order',
        name: 'NewOrder',
        component: NewOrderComponent
    }
])

@Component({
    selector: 'my-app',
    template: `
        <top-nav></top-nav>
        <router-outlet></router-outlet>
    `,
    directives: [ROUTER_DIRECTIVES, TopNavComponent],
    providers: [UsersService]
})
export class AppComponent {
    constructor(){ }
}