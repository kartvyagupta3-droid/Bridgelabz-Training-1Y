package org.example;

import java.sql.PreparedStatement;

public class Driver {

    String name;
        RouteLinkedList route;

        Driver(String name) {
            this.name = name;
            this.route = new RouteLinkedList();

//            String query = "INSERT INTO Driver VALUES (?, ?)";
//
//            PreparedStatement ps = con.prepareStatement(query);
//            Object driver = null;
//            ps.setString(1, driver.driverId);
//            ps.setString(2, driver.name);
//
//            ps.executeUpdate();
        }
    }

