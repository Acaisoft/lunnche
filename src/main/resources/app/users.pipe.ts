import {Pipe, PipeTransform} from 'angular2/core';

@Pipe({
    name: 'usersFilter'
})
export class UsersFilter {
    transform(value, term) {
        return value.filter((user) => user.fullName.includes(term));
    }
}