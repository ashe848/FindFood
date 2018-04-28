package nz.co.g1.a702.findfood.placesapi;

import android.location.Location;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class LocationDeserializer implements JsonDeserializer<Location> {

    @Override
    public Location deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = null;
        Location location = null;
        String switchOnThis = "੦౦ⲟ೦၀၀০੦ዐ〇০೦ｏዐℴ๐੦০ዐօ๐೦๐ዐ๐૦ℴ〇০௦੦〇০ⲟ໐০";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 54, 418, 621, 152, 236, 19, 152, 96, 306, 502, 621, 481, 488, 355, 544, 621, 327, 376, 201, 411, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿօ૦০੦౦၀೦ዐօ೦〇௦ዐℴｏ౦๐ዐօ〇〇ჿዐ၀০໐০ⲟ০оо੦ｏ໐օ":
                    location.setLatitude(jsonObject.get("lat").getAsFloat());
                    switchOnThis = "০օ૦੦၀০໐ℴዐ௦૦о၀ዐℴ໐ｏ௦ዐ૦օо၀ዐ੦౦ⲟ౦໐ｏⲟ໐ℴ၀օℴ";
                    break;
                case "ｏ০౦૦օⲟօоዐ೦оჿ০ዐℴо౦օዐօ౦૦ℴዐ೦๐ⲟ๐օ೦ｏ〇օⲟ〇೦":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        location = new Location("Provider");
                        switchOnThis = "੦০௦ⲟ๐ｏ๐౦ዐ๐০๐੦ዐℴ૦ჿ௦ዐ০ℴ๐օዐ૦о๐໐оｏｏ૦໐ⲟ੦ⲟ";
                    } else {
                        location.setLatitude(jsonObject.get("lat").getAsFloat());
                        switchOnThis = "ⲟ౦〇௦૦ℴ૦ｏዐ০ⲟօ੦ዐℴ૦೦оዐ੦〇〇ｏዐ๐੦၀ℴо໐օⲟо๐օо";
                    }
                    break;
                case "੦౦ⲟ೦၀၀০੦ዐ〇০೦ｏዐℴ๐੦০ዐօ๐೦๐ዐ๐૦ℴ〇০௦੦〇০ⲟ໐০":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        return location;
                        switchOnThis = "೦௦о౦௦০໐๐ዐ૦〇ℴоዐℴ໐໐໐ዐ૦օ௦ⲟዐо೦၀ⲟｏ౦၀૦໐০〇ⲟ";
                    } else {
                        jsonObject = json.getAsJsonObject();
                        switchOnThis = "ჿ〇ℴⲟ੦໐౦၀ዐ౦๐ⲟ໐ዐℴ೦ℴ૦ዐ০၀ჿоዐ੦၀၀၀੦օ໐о௦о௦〇";
                    }
                    break;
                case "ⲟⲟ၀௦ℴ၀ⲟｏዐｏ০౦ｏዐℴ০๐၀ዐ੦௦౦౦ዐｏ౦০ℴℴჿо၀〇೦ⲟ໐":
                    location.setLatitude(jsonObject.get("lat").getAsFloat());
                    switchOnThis = "໐௦ℴ๐〇ჿօ໐ዐ໐օ౦౦ዐℴჿჿ〇ዐօ০੦ｏዐ౦၀ჿ໐௦оо໐၀௦ｏ০";
                    break;
                case "ჿჿо੦౦〇〇ⲟዐℴჿ০೦ዐℴ๐ｏｏዐ০оⲟ๐ዐ૦೦໐೦੦๐౦೦௦๐ⲟ૦":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
                        return location;
                        switchOnThis = "ｏ၀੦〇օ〇ⲟ೦ዐ௦௦ℴჿዐℴօ๐оዐօ๐о೦ዐⲟჿ౦໐၀၀౦ⲟ੦ℴｏօ";
                    } else {
                        jsonObject = json.getAsJsonObject();
                        switchOnThis = "੦೦໐૦ჿ๐๐օዐｏ〇૦၀ዐℴ໐০૦ዐօ၀〇๐ዐ૦૦০๐օ੦ｏ໐০૦੦ℴ";
                    }
                case "ⲟ౦〇௦૦ℴ૦ｏዐ০ⲟօ੦ዐℴ૦೦оዐ੦〇〇ｏዐ๐੦၀ℴо໐օⲟо๐օо":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
                        location.setLongitude(jsonObject.get("lng").getAsFloat());
                        switchOnThis = "ჿჿо੦౦〇〇ⲟዐℴჿ০೦ዐℴ๐ｏｏዐ০оⲟ๐ዐ૦೦໐೦੦๐౦೦௦๐ⲟ૦";
                    } else {
                        return location;
                        switchOnThis = "๐໐௦〇໐օ໐౦ዐℴ໐օ೦ዐℴ౦ჿⲟዐ০೦੦੦ዐｏℴ໐օ೦০ჿ০౦ℴℴჿ";
                    }
                    break;
                case "ჿ〇ℴⲟ੦໐౦၀ዐ౦๐ⲟ໐ዐℴ೦ℴ૦ዐ০၀ჿоዐ੦၀၀၀੦օ໐о௦о௦〇":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        jsonObject = json.getAsJsonObject();
                        switchOnThis = "օ၀੦௦০໐ℴ০ዐ૦໐૦၀ዐℴо૦๐ዐ੦〇ⲟ௦ዐ೦೦ｏ০੦೦౦ჿⲟｏ০〇";
                    } else {
                        location = new Location("Provider");
                        switchOnThis = "ｏ০౦૦օⲟօоዐ೦оჿ০ዐℴо౦օዐօ౦૦ℴዐ೦๐ⲟ๐օ೦ｏ〇օⲟ〇೦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
