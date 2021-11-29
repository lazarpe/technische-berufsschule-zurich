package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IO_Handler io_handler = new IO_Handler();
        TripManager tripManager = new TripManager();

        io_handler.askUserToSelectAction();
    }
}