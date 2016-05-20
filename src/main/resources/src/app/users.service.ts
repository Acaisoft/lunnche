import {Injectable} from 'angular2/core';

import {USERS} from './mock-users';

@Injectable()
export class UsersService {
    getUsers() {
        return Promise.resolve(USERS);
    }
    /*
    getUser(id: number) {
        return Promise.resolve(USERS).then(
            users => users.filter(user => user.id === id)[0]
        );
    }*/
}