import {Inject, Injectable} from 'angular2/core';
import {Http, Response, Headers} from 'angular2/http';
import 'rxjs/add/operator/map'
import {Observable} from 'rxjs/Observable';

// import {USERS} from './mock-users';

@Injectable()
export class UsersService {
    private actionUrl:string;
    private headers:Headers;

    constructor(@Inject(Http) private _http:Http) {
        this.actionUrl = '/api/' + 'users';

        this.headers = new Headers();
        this.headers.append('Content-Type', 'application/json');
        this.headers.append('Accept', 'application/json');
    }

    public GetAll = (): Observable<Response> => {
        return this._http.get(this.actionUrl).map(res => res.json()._embedded.users);
    }

    /*
    getUsers() {
        return Promise.resolve(USERS);
    }*/

    /*
     getUser(id: number) {
     return Promise.resolve(USERS).then(
     users => users.filter(user => user.id === id)[0]
     );
     }*/
}