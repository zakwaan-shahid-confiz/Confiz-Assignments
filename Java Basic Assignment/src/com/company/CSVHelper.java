package com.company;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class CSVHelper {
    public List<Candidate> readData(File path) {

        ArrayList<Candidate> completeData = new ArrayList<>();
        try(BufferedReader csvReader = new BufferedReader(new FileReader(path));) {
            String singleRowOfData;
            while ((singleRowOfData = csvReader.readLine()) != null) {
                String[] studentData = singleRowOfData.split(",");
                Candidate temp = new Candidate();
                temp.setId(Integer.parseInt(studentData[0]));
                temp.setName(studentData[1]);
                temp.setGender(studentData[2]);
                temp.setAge(Integer.parseInt(studentData[3]));
                temp.setCity(studentData[4]);
                temp.setDob(new SimpleDateFormat("dd-MM-yyyy").parse(studentData[5]));
                completeData.add(temp);
            }
        }
        catch(Exception e) {
            System.out.println("Exception : "+e);
        }
        return completeData;
    }

    public void writeCityData(List<Candidate> cityData) {
        if(!cityData.isEmpty()) {
            File file = new File(cityData.get(0).getCity()+".csv");
            try(BufferedWriter csvWriter = new BufferedWriter(new FileWriter(file));) {
                cityData.forEach(candidate -> {
                    try {
                        csvWriter.write(candidate.getId() + "," + candidate.getName() + "," +
                                candidate.getGender() + "," + candidate.getAge() + "," +
                                candidate.getCity() + "," +
                                new SimpleDateFormat("dd/MM/yyyy").format(candidate.getDob())+"\n");
                    }
                    catch(Exception e) {
                        System.out.println("IOException : "+e);
                    }
                });
            }
            catch(Exception e) {
                System.out.println("Exception : "+e);
            }
        }
    }

    public Set<String> getUniqueCities(List<Candidate> data) {
        Set<String> cityNames = new HashSet<>();
        data.forEach(candidate -> cityNames.add(candidate.getCity()));
        return cityNames;
    }
}
