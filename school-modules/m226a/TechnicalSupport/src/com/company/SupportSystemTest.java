package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lazar on 21.09.2021.
 * Project name: TechnicalSupport
 **/
class SupportSystemTest {
    SupportSystem supportSystem = new SupportSystem();

    @BeforeEach
    void setUp() {
        supportSystem.fillSupportList();
    }

    ArrayList<String> problems = new ArrayList<>();

    @Test
    void findSolution_Bug_SolutionForBug() {
        problems.add("bug");
        assertTrue("Nobody is perfect. There are bugs in every program. Taking a break can help!".equals(supportSystem.findSolution(problems)));
    }

    @Test
    void findSolution_Slow_SolutionForSlow() {
        problems.add("slow");
        assertTrue("I think it has to do with the hardware.".equals(supportSystem.findSolution(problems)));
    }

    @Test
    void findSolution_Empty_DefaultMsgForNotFoundProblem() {
        problems.add("");
        assertTrue("Sorry man, cant help you out. Ask your baba.".equals(supportSystem.findSolution(problems)));
    }
}