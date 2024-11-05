module example.persistence {
    requires jakarta.persistence;
    requires java.sql;

    requires org.hibernate.orm.core;
    requires spring.core;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.jdbc;
    requires spring.orm;
    requires spring.tx;

    exports red.jackal.training.spring.jpms.entity;
    exports red.jackal.training.spring.jpms.repository to example.service, example.web;

    opens red.jackal.training.spring.jpms.config to spring.core, spring.beans, spring.context;
    opens red.jackal.training.spring.jpms.entity to org.hibernate.orm.core, spring.core;
}