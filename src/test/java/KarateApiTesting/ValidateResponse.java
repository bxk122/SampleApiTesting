package KarateApiTesting;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class ValidateResponse {

    String response;
    public int validateResponseFromJson(String response) {
        int failCount = 0;
        Gson g = new Gson();
        Info p = g.fromJson(response, Info.class);

        Map<String, String> results = new HashMap<>();

        //check integer
        if(p.getId() > 0) {
            results.put("id", "Pass");
        }
        else {
            results.put("id", "Fail");
        }

        //check age
        if(p.getAge() > 0 && p.getAge() < 120) {
            results.put("age", "Pass");
        }
        else {
            results.put("age", "Fail");
        }
        
        //check first name
        if(p.getName().length() <= 10) {
            results.put("Name", "Pass");
        }
        else {
            results.put("Name", "Fail");
        }
        
        //check last name
        if(p.getLast().length() <=10) {
            results.put("Last", "Pass");
        }
        else {
            results.put("Last", "Fail");
        }
        
        //check gender
        if(p.getGender() == 'F' || p.getGender() == 'M') {
            results.put("Gender", "Pass");
        }
        else {
            results.put("Gender", "Fail");
        }
        
        //print out all the possible result to track pass and fail info 
        System.out.println(results);

        //loop to track the no of fail items 
        for (Map.Entry<String, String> entry : results.entrySet()) {
            if(entry.getValue() == "Fail")
            {
                failCount++;
            }
        }
        return failCount;
    }

    //method to validate the response time 
    public Boolean validateResponseTime(int responseTime) {
        Boolean checkResponseTime = false;
        if(responseTime < 500) {
            checkResponseTime = true;
        }
        return checkResponseTime;
    }
}
