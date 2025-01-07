module es.juliogtrenard.jaspersupermercado {
    requires javafx.controls;
    requires javafx.fxml;
    requires net.sf.jasperreports.core;
    requires java.sql;


    opens es.juliogtrenard.jaspersupermercado to javafx.fxml;
    exports es.juliogtrenard.jaspersupermercado;
    opens es.juliogtrenard.jaspersupermercado.controller to javafx.fxml;
    exports es.juliogtrenard.jaspersupermercado.controller;
    opens es.juliogtrenard.jaspersupermercado.db to javafx.fxml;
    exports es.juliogtrenard.jaspersupermercado.db;
}