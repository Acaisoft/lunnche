///<reference path="../../node_modules/angular2/typings/browser.d.ts"/>
"use strict";
var browser_1 = require('angular2/platform/browser');
var router_1 = require("angular2/router");
var app_component_1 = require('./app.component');
var common_1 = require("angular2/common");
var http_1 = require('angular2/http');
browser_1.bootstrap(app_component_1.AppComponent, [router_1.ROUTER_PROVIDERS, common_1.FORM_PROVIDERS, http_1.HTTP_PROVIDERS, http_1.ConnectionBackend]);
//# sourceMappingURL=main.js.map