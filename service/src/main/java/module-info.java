module example.service {
    requires example.persistence;

    exports red.jackal.training.spring.jpms.service;
    exports red.jackal.training.spring.jpms.service.impl to example.app;

    opens red.jackal.training.spring.jpms.service.impl to spring.beans;
}