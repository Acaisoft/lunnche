// import {Order} from './Order';

export var RESTAURANTS =
{
    _embedded: {
        restaurants: [
            {
                name: "Restaurant #1",
                _links: {
                    self: {
                        href: "http://localhost:8080/restaurants/1"
                    },
                    restaurant: {
                        href: "http://localhost:8080/restaurants/1"
                    },
                    meals: {
                        href: "http://localhost:8080/restaurants/1/meals"
                    }
                }
            },
            {
                name: "Restaurant #2",
                _links: {
                    self: {
                        href: "http://localhost:8080/restaurants/2"
                    },
                    restaurant: {
                        href: "http://localhost:8080/restaurants/2"
                    },
                    meals: {
                        href: "http://localhost:8080/restaurants/2/meals"
                    }
                }
            }
        ]
    },
    _links: {
        self: {
            href: "http://localhost:8080/restaurants"
        },
        profile: {
            href: "http://localhost:8080/profile/restaurants"
        }
    }
}