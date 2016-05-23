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
var router_1 = require('angular2/router');
var common_1 = require('angular2/common');
var users_service_1 = require('./users.service');
var search_users_component_1 = require('./search-users.component');
var users_pipe_1 = require('./users.pipe');
var dashboard_list_user_component_1 = require('./dashboard-list-user.component');
var DashboardComponent = (function () {
    function DashboardComponent(_usersService) {
        this._usersService = _usersService;
        this.filter = '';
    }
    DashboardComponent.prototype.usersFilterChange = function (event) {
        this.filter = event.value;
    };
    DashboardComponent.prototype.addFullName = function () {
        for (var _i = 0, _a = this.users; _i < _a.length; _i++) {
            var aa = _a[_i];
            aa.fullName = aa.firstName + " " + aa.lastName + " " + aa.username;
        }
    };
    DashboardComponent.prototype.getUsers = function () {
        var _this = this;
        this._usersService
            .GetAll()
            .subscribe(function (data) { return _this.users = data; }, function (error) { return console.log(error); }, function () { return _this.addFullName(); });
    };
    DashboardComponent.prototype.ngOnInit = function () {
        this.getUsers();
    };
    DashboardComponent = __decorate([
        core_1.Component({
            selector: 'my-dashboard',
            templateUrl: 'app/dashboard.component.html',
            directives: [router_1.ROUTER_DIRECTIVES, search_users_component_1.SearchUsersComponent, dashboard_list_user_component_1.DashboardListUserComponent],
            pipes: [users_pipe_1.UsersFilter, common_1.CurrencyPipe]
        }),
        __param(0, core_1.Inject(users_service_1.UsersService))
    ], DashboardComponent);
    return DashboardComponent;
}());
exports.DashboardComponent = DashboardComponent;
//# sourceMappingURL=dashboard.component.js.map