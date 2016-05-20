"use strict";
var json = {
    _embedded: {
        users: [
            {
                firstName: "Jan",
                lastName: "Kowalski",
                balance: 50,
                username: "jan.kowalski",
                password: "password",
                _links: {
                    self: {
                        href: "http://localhost:8080/users/1"
                    },
                    user: {
                        href: "http://localhost:8080/users/1"
                    }
                }
            },
            {
                firstName: "Stefan",
                lastName: "Nowak",
                balance: 100,
                username: "stefan.nowak",
                password: "password",
                _links: {
                    self: {
                        href: "http://localhost:8080/users/2"
                    },
                    user: {
                        href: "http://localhost:8080/users/2"
                    }
                }
            }
        ]
    },
    _links: {
        self: {
            href: "http://localhost:8080/users"
        },
        profile: {
            href: "http://localhost:8080/profile/users"
        }
    }
};
exports.USERS = json._embedded.users;
//# sourceMappingURL=mock-users.js.map