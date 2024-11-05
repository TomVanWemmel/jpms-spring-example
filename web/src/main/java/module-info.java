module example.web {
    requires example.persistence;
    requires example.service;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.web;
    requires spring.context;

    exports red.jackal.training.spring.jpms.web to example.app;
    exports red.jackal.training.spring.jpms.web.controller;

    opens red.jackal.training.spring.jpms.web to spring.beans, spring.web;
}