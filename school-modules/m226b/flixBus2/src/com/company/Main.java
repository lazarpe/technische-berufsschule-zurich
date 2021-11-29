package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IO_Handler io_handler = new IO_Handler();
        TripManager tripManager = new TripManager();

        tripManager.generateBus(30, BusType.DOUBLE, true);
        tripManager.generateTrip("Madrid", LocalDate.of(2022, 1, 10), LocalDate.of(2022, 1, 11), Service.INTERNATIONAL);


        io_handler.askUserToSelectAction();
    }
}