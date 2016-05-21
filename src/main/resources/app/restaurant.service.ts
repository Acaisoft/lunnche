import {Injectable} from 'angular2/core';

import {RESTAURANTS} from './mock-restaurants';

@Injectable()
export class RestaurantService {
    getRestaurants() {
        return Promise.resolve(RESTAURANTS);
    }/*
    getRestaurant(id: number) {
        return Promise.resolve(RESTAURANTS).then(
            restaurants => restaurants.filter(restaurant => restaurant.id === id)[0]
        );
    }*/
    constructor() {
        console.log('chuj');
    }
}