module example.web {
    requires example.persistence;
    requires example.service;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.web;

    exports red.jackal.training.spring.jpms.web.controller;

    opens red.jackal.training.spring.jpms.web.controller to spring.beans, spring.web;
}