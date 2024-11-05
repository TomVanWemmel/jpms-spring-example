module example.persistence {
    requires jakarta.persistence;
    requires java.sql;

    requires org.hibernate.orm.core;
    requires spring.aop;
    requires spring.core;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.jdbc;
    requires spring.orm;
    requires spring.tx;
    requires spring.boot.autoconfigure;

    exports red.jackal.training.spring.jpms.api;
    exports red.jackal.training.spring.jpms to example.app;

    opens red.jackal.training.spring.jpms to spring.core, spring.beans, spring.context;
    opens red.jackal.training.spring.jpms.entity to org.hibernate.orm.core, spring.core;
    opens red.jackal.training.spring.jpms.repository to spring.core, spring.beans, spring.context, spring.aop;
    opens red.jackal.training.spring.jpms.api to org.hibernate.orm.core, spring.core;
}