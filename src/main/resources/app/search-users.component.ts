import {Component, Input, Output, EventEmitter} from 'angular2/core';

@Component({
    selector: 'search-users',
    templateUrl: 'app/search-users.component.html'
})
export class SearchUsersComponent {
    filterTerm:string = "";
}