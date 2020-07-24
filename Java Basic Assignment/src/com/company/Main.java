package com.company;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {

        Set<String> cityNames;
        List<Candidate> data = new CSVHelper().readData(new File("alldata.csv"));
        cityNames = new CSVHelper().getUniqueCities(data);
        Collections.sort(data,Comparator.comparing(Candidate::getCity));
        data.forEach(candidate -> candidate.display());
        cityNames.forEach(name->new CityThreadedHelper(name).start(data));
    }
}

