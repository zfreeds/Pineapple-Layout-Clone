package zfreeds.pineappleclone;

import java.util.Date;

/**
 * Created by Zack on 2017-04-01.
 */

public class RequestPosition {

    String startTime;
    String endTime;
    String jobType;
    public String street, city, province;
    String description;

    public RequestPosition(String startTime, String endTime, String jobType, String street, String city, String province, String description) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.jobType = jobType;
        this.street = street;
        this.city = city;
        this.province = province;
        this.description = description;

    }

    //new methods could be implemented here for this class
    // e.g  add to json
    // e.g send data to server


}
