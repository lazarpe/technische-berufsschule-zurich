package com.company;

import java.util.ArrayList;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class BusTerminal {
    private ArrayList<Platform> platformList = new ArrayList<>();
    private String terminalName;

    public BusTerminal(String terminalName) {
        this.terminalName = terminalName;

        addPlatformToArrayList(new Platform(1, 30, Service.INTERNATIONAL));
        addPlatformToArrayList(new Platform(2, 45, Service.INTERNATIONAL));
        addPlatformToArrayList(new Platform(3, 15, Service.NATIONAL));
    }

    public void addPlatformToArrayList(Platform platform) {
        this.platformList.add(platform);
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
