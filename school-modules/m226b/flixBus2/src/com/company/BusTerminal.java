package com.company;

import java.util.ArrayList;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class BusTerminal {
    private ArrayList<Platform> platformList;
    private String terminalName;

    public BusTerminal(ArrayList<Platform> platformList, String terminalName) {
        this.platformList = platformList;
        this.terminalName = terminalName;
    }

    public ArrayList<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(ArrayList<Platform> platformList) {
        this.platformList = platformList;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }
}
