import {Component, OnInit, Inject} from 'angular2/core';
import {Router, ROUTER_DIRECTIVES} from 'angular2/router';

import {User} from './user';
import {UsersService} from './users.service';

import {SearchUsersComponent} from './search-users.component';
import {UsersFilter} from './users.pipe';

@Component({
    selector: 'my-dashboard',
    templateUrl: 'app/dashboard.component.html',
    directives: [ROUTER_DIRECTIVES, SearchUsersComponent],
    pipes: [UsersFilter]
})
export class DashboardComponent implements OnInit {
    users:User[];
    public filter = '';

    constructor(@Inject(UsersService) private _usersService:UsersService) {
    }

    usersFilterChange(event) {
        this.filter = event.value;
    }

    private addFullName() {
        for (let aa of this.users) {
            aa.fullName = aa.firstName + " " + aa.lastName + " " + aa.username;
            console.log(aa.fullName);
        }
    }

    private getUsers() {
        this._usersService
            .GetAll()
            .subscribe((data:User[]) => this.users = data,
                error => console.log(error),
                () => this.addFullName());
    }

    ngOnInit() {
        this.getUsers();
    }
}