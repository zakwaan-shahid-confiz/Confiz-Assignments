package com.company;

import java.util.ArrayList;
import java.util.List;

public class CityThreadedHelper implements Runnable {

    Thread mainThread;
    private String cityName;
    private List<Candidate> completeList;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public CityThreadedHelper(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public void run() {
        ArrayList<Candidate> cityData = new ArrayList<>();
        completeList.forEach(candidate->{
            if (this.cityName.equals(candidate.getCity()))
                cityData.add(candidate);
        });
        new CSVHelper().writeCityData(cityData);
    }

    public void start(List<Candidate> completeList) {
        if (mainThread == null) {
            mainThread = new Thread(this, cityName);
            mainThread.start();
        }
        this.completeList = completeList;
    }
}
