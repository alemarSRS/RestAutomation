package Resources;

import pojo.AddPlace;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class testDataBuild {

    public AddPlace addPlacePayLoad(String name, String language, String address) {

        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setAddress(address);
        p.setLanguage(language);
        p.setName(name);
        p.setPhone_number("443255134 432");
        p.setWebsite("https://rahulshetty.com");
        List<String> myList = new ArrayList<>();
        myList.add("shoe park");
        myList.add("shop");
        p.setTypes(myList);
        Location loc = new Location();
        loc.setLat(-38.383494);
        loc.setLng(33.427362);
        p.setLocation(loc);
        return p;
    }

    public String deletePlacePayload(String placeId) {
        return "{\r\n    \"place_id\":\"" + placeId + "\"\r\n}";
    }
}
