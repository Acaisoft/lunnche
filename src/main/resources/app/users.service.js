"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
var core_1 = require('angular2/core');
var http_1 = require('angular2/http');
require('rxjs/add/operator/map');
// import {USERS} from './mock-users';
var UsersService = (function () {
    function UsersService(_http) {
        var _this = this;
        this._http = _http;
        this.GetAll = function () {
            return _this._http.get(_this.actionUrl).map(function (res) { return res.json()._embedded.users; });
        };
        this.actionUrl = '/api/' + 'users';
        this.headers = new http_1.Headers();
        this.headers.append('Content-Type', 'application/json');
        this.headers.append('Accept', 'application/json');
    }
    UsersService = __decorate([
        core_1.Injectable(),
        __param(0, core_1.Inject(http_1.Http))
    ], UsersService);
    return UsersService;
}());
exports.UsersService = UsersService;
//# sourceMappingURL=users.service.js.map