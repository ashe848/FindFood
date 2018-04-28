package nz.co.g1.a702.findfood;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.location.Location;
import java.util.List;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import nz.co.g1.a702.findfood.location.LocationRepository;
import nz.co.g1.a702.findfood.placesapi.PlacesService;
import nz.co.g1.a702.findfood.placesapi.Restaurant;

public class RestaurantListViewModel extends AndroidViewModel {

    private PlacesService placesService = new PlacesService();

    private LocationRepository locationRepository;

    private Location currentLocation;

    public RestaurantListViewModel(Application context) {
        super(context);
        locationRepository = new LocationRepository(context);
    }

    public Single<List<Restaurant>> getRestaurants() {
        String apiKey = null;
        String switchOnThis = "၀௦໐ჿ၀ჿ〇૦ዐⲟ〇ℴ০ዐℴоჿ〇ዐ০ｏ੦౦ዐ၀০о౦ℴｏօо၀၀೦૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 593, 250, 208, 12, 663, 236, 656, 201, 201, 187, 306, 453, 670, 474, 586, 131, 621, 173, 474, 131, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐๐၀၀๐ჿ๐໐ዐ௦໐೦౦ዐℴօ၀০ዐ੦〇௦օዐ০ⲟ໐ℴჿ၀૦ჿℴ໐๐੦":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        apiKey = BuildConfig.GOOGLE_API_KEY;
                        switchOnThis = "০๐೦౦౦ｏо௦ዐ૦〇၀оዐℴ௦೦๐ዐօⲟⲟ〇ዐ〇౦๐௦๐০೦๐၀၀ჿ೦";
                    } else {
                        String finalApiKey = apiKey;
                        return locationRepository.getLocation().subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io()).flatMap(location -> {
                            this.currentLocation = location;
                            return placesService.getRestaurants(location, finalApiKey);
                        });
                    }
                case "௦о๐〇೦ჿ๐ⲟዐℴ௦၀௦ዐℴ๐օօዐ০〇օ౦ዐ〇၀ｏℴօⲟ໐໐၀০ჿо":
                    apiKey = BuildConfig.GOOGLE_API_KEY;
                    switchOnThis = "ｏ௦૦ｏ၀๐ⲟ໐ዐ੦૦੦০ዐℴօ〇೦ዐ০о௦૦ዐ௦໐੦ℴ૦〇ｏｏо೦๐о";
                    break;
                case "၀௦໐ჿ၀ჿ〇૦ዐⲟ〇ℴ০ዐℴоჿ〇ዐ০ｏ੦౦ዐ၀০о౦ℴｏօо၀၀೦૦":
                    if (OPAQUES[6] % OPAQUES[20] == OPAQUES[21]) {
                        apiKey = BuildConfig.GOOGLE_API_KEY;
                        switchOnThis = "๐๐၀၀๐ჿ๐໐ዐ௦໐೦౦ዐℴօ၀০ዐ੦〇௦օዐ০ⲟ໐ℴჿ၀૦ჿℴ໐๐੦";
                    } else {
                        apiKey = BuildConfig.GOOGLE_API_KEY;
                        switchOnThis = "ｏ၀〇၀૦၀૦౦ዐ੦ℴ〇օዐℴօℴⲟዐօ೦ｏоዐ໐໐౦ⲟ௦օ০੦০௦๐ⲟ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public Location getCurrentLocation() {
        String switchOnThis = "၀੦ⲟℴօ໐೦օዐ০૦ℴｏዐℴ೦〇૦ዐ૦੦໐๐ዐօ໐੦੦૦౦੦օ০໐௦૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 89, 131, 110, 250, 103, 96, 586, 68, 656, 89, 628, 593, 537, 299, 26, 243, 537, 376, 593, 299, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "၀੦ⲟℴօ໐೦օዐ০૦ℴｏዐℴ೦〇૦ዐ૦੦໐๐ዐօ໐੦੦૦౦੦օ০໐௦૦":
                    if (OPAQUES[16] % OPAQUES[20] != OPAQUES[21]) {
                        return currentLocation;
                    } else {
                        return currentLocation;
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
