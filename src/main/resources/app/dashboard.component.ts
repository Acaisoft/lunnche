import {Component, OnInit, Inject} from 'angular2/core';
import {Router, ROUTER_DIRECTIVES} from 'angular2/router';

import {User} from './user';
import {UsersService} from './users.service';

@Component({
    selector: 'my-dashboard',
    templateUrl: 'app/dashboard.component.html',
    directives: [ROUTER_DIRECTIVES],
})
export class DashboardComponent implements OnInit {
    users:User[];

    constructor(@Inject(UsersService) private _usersService:UsersService) { }

    /*
     getUsers() {
     this.usersService.getUsers()
     .then(users => this.users = users)
     }
     */

    private getUsers() {
        this._usersService
            .GetAll()
            .subscribe((data:User[]) => this.users = data,
                error => console.log(error),
                () => console.log(this.users));
    }

    ngOnInit() {
        this.getUsers();
    }
}