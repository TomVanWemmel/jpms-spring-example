module example.app {
    requires example.persistence;
    requires example.service;
    requires example.web;

    requires spring.core;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;

    opens red.jackal.training.spring.jpms.app to spring.core, spring.beans, spring.context;
}