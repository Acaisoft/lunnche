///<reference path="../../node_modules/angular2/typings/browser.d.ts"/>

import {bootstrap} from 'angular2/platform/browser';
import {ROUTER_PROVIDERS} from "angular2/router";
import {AppComponent} from './app.component';
import {FORM_PROVIDERS} from "angular2/common";
import {HTTP_PROVIDERS, ConnectionBackend} from 'angular2/http';

bootstrap(AppComponent, [ROUTER_PROVIDERS, FORM_PROVIDERS, HTTP_PROVIDERS, ConnectionBackend]);