module com.example.xxistays {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens com.example.xxistays to javafx.fxml;
    exports com.example.xxistays;
    exports com.example.xxistays.controller;
    opens com.example.xxistays.controller to javafx.fxml;
    exports com.example.xxistays.model;
    opens com.example.xxistays.model to javafx.fxml;/*
    exports com.example.xxistays.repository;
    exports com.example.xxistays.service;
    exports com.example.xxistays.util;*/
}