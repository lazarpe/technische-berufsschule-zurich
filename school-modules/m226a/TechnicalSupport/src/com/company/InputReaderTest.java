package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lazar on 21.09.2021.
 * Project name: TechnicalSupport
 **/
class InputReaderTest {

    InputReader inputReader = new InputReader();

    @Test
    @DisplayName("Ask for problem")
    void askForProblem() {
        assertTrue(inputReader.askForProblem().size() > 0);
    }


}