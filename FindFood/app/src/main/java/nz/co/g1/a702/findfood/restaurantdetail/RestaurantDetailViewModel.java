package nz.co.g1.a702.findfood.restaurantdetail;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import io.reactivex.Flowable;
import nz.co.g1.a702.findfood.database.NoteDao;
import nz.co.g1.a702.findfood.database.NoteDatabase;
import nz.co.g1.a702.findfood.database.RestaurantNote;

public class RestaurantDetailViewModel extends AndroidViewModel {

    private final NoteDao notesDao;

    private List<RestaurantNote> currentNotes;

    private String placeId;

    private Executor executor = Executors.newSingleThreadExecutor();

    public RestaurantDetailViewModel(Application context) {
        super(context);
        this.notesDao = NoteDatabase.getInstance(context).noteDao();
    }

    public Flowable<List<RestaurantNote>> getNotes() {
        String switchOnThis = "੦໐೦ｏ၀о০ｏዐ০ℴ౦ჿዐℴℴ௦оዐ૦੦௦ⲟዐჿ੦๐၀ℴჿℴ০〇೦๐੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 152, 446, 663, 292, 173, 124, 201, 152, 642, 145, 229, 257, 369, 509, 173, 12, 257, 292, 551, 110, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "੦໐೦ｏ၀о০ｏዐ০ℴ౦ჿዐℴℴ௦оዐ૦੦௦ⲟዐჿ੦๐၀ℴჿℴ০〇೦๐੦":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        return notesDao.getNoteById(placeId);
                        switchOnThis = "౦௦૦၀ℴ০ჿ೦ዐ૦౦০ｏዐℴჿℴ௦ዐ૦ⲟⲟჿዐℴ௦໐௦ｏⲟ೦ℴ၀ℴ০၀";
                    } else {
                        return notesDao.getNoteById(placeId);
                        switchOnThis = "௦ჿ၀౦ｏ၀௦೦ዐℴჿ〇〇ዐℴ੦๐ჿዐ০໐౦๐ዐ〇໐օօℴℴ௦ჿ০о၀၀";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public String getPlaceId() {
        String switchOnThis = "೦ⲟо೦ჿｏ๐໐ዐℴｏ০〇ዐℴｏ௦ⲟዐ૦ｏ๐ℴዐ໐〇௦ⲟ೦о૦೦০ℴ၀೦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 677, 530, 369, 614, 411, 656, 376, 131, 649, 369, 82, 432, 544, 390, 523, 670, 145, 12, 488, 19, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦ⲟо೦ჿｏ๐໐ዐℴｏ০〇ዐℴｏ௦ⲟዐ૦ｏ๐ℴዐ໐〇௦ⲟ೦о૦೦০ℴ၀೦":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        return placeId;
                        switchOnThis = "০੦ჿօ〇ჿ౦оዐ০౦о໐ዐℴⲟ੦ჿዐ੦౦ⲟ౦ዐ໐〇௦౦๐೦оჿ๐੦ჿо";
                    } else {
                        return placeId;
                        switchOnThis = "ℴჿ০ჿℴⲟ੦၀ዐ௦๐๐௦ዐℴ௦о๐ዐ૦օ೦〇ዐ௦〇ⲟօℴ૦๐ｏ၀૦૦૦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public void setPlaceId(String placeId) {
        String switchOnThis = "၀૦೦ⲟо〇੦૦ዐｏ௦೦০ዐℴ੦оｏዐ੦໐ⲟჿዐ௦ჿⲟ໐ｏ໐၀০໐ｏ๐໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 285, 369, 355, 509, 348, 460, 642, 614, 544, 257, 152, 467, 628, 488, 635, 180, 432, 82, 334, 348, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "၀૦೦ⲟо〇੦૦ዐｏ௦೦০ዐℴ੦оｏዐ੦໐ⲟჿዐ௦ჿⲟ໐ｏ໐၀০໐ｏ๐໐":
                    if (OPAQUES[8] % OPAQUES[20] == OPAQUES[21]) {
                        this.placeId = placeId;
                        switchOnThis = "০ჿ০૦ჿ၀๐௦ዐ௦೦ℴ໐ዐℴⲟ౦௦ዐ০о੦໐ዐ੦ჿ໐ｏ၀੦௦੦੦੦໐௦";
                    } else {
                        this.placeId = placeId;
                        switchOnThis = "௦о੦〇౦๐〇౦ዐ੦ｏ೦ｏዐℴ೦০ⲟዐ੦օ੦〇ዐ໐ｏօ০၀ｏℴ〇೦о੦օ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void insertNote(String note) {
        RestaurantNote restaurantNote = null;
        String switchOnThis = "ⲟ೦০૦ℴ૦০〇ዐ૦૦ｏ௦ዐℴℴℴ၀ዐ૦೦૦оዐⲟ૦૦೦໐ჿℴ໐ｏ੦০၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 565, 54, 495, 299, 243, 446, 635, 649, 544, 194, 432, 138, 201, 481, 152, 593, 425, 152, 117, 362, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ⲟ๐๐೦ℴо๐օዐ౦ｏⲟｏዐℴ೦౦೦ዐ੦о〇၀ዐｏ໐੦౦ℴ౦౦၀০ჿｏ〇":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        executor.execute(() -> notesDao.insert(restaurantNote));
                        switchOnThis = "ⲟ〇օօｏｏ〇௦ዐⲟ೦੦օዐℴ๐၀๐ዐ૦〇օჿዐჿ၀೦๐੦о૦௦๐໐੦੦";
                    } else {
                        executor.execute(() -> notesDao.insert(restaurantNote));
                        switchOnThis = "૦ჿ০ⲟ૦ℴ〇૦ዐ೦၀ｏ౦ዐℴჿ๐੦ዐ੦੦օ೦ዐ௦໐૦၀օ໐〇০౦੦ⲟ੦";
                    }
                    break;
                case "ⲟ೦০૦ℴ૦০〇ዐ૦૦ｏ௦ዐℴℴℴ၀ዐ૦೦૦оዐⲟ૦૦೦໐ჿℴ໐ｏ੦০၀":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        executor.execute(() -> notesDao.insert(restaurantNote));
                        switchOnThis = "০೦೦౦ⲟℴ౦๐ዐօ๐๐ｏዐℴჿ૦੦ዐ૦ⲟ〇০ዐ၀ⲟ૦໐૦оｏｏ၀〇၀௦";
                    } else {
                        restaurantNote = new RestaurantNote(0, placeId, note);
                        switchOnThis = "ⲟ๐๐೦ℴо๐օዐ౦ｏⲟｏዐℴ೦౦೦ዐ੦о〇၀ዐｏ໐੦౦ℴ౦౦၀০ჿｏ〇";
                    }
                    break;
                case "૦໐၀ⲟ೦ჿ໐໐ዐ೦௦ჿоዐℴ໐օ೦ዐ০ჿჿ੦ዐⲟⲟо〇০〇૦օⲟ૦օօ":
                    restaurantNote = new RestaurantNote(0, placeId, note);
                    switchOnThis = "ⲟ๐౦ℴ௦໐ⲟｏዐ໐〇оჿዐℴჿ௦〇ዐօ੦૦๐ዐ〇๐೦о໐௦੦೦ℴ০౦໐";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void editNote(RestaurantNote note) {
        String switchOnThis = "০౦੦໐০оℴ၀ዐ๐௦ｏ੦ዐℴ০০૦ዐ੦໐ｏօዐ౦ℴ〇੦๐၀၀૦оℴ໐໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 243, 586, 320, 481, 572, 180, 229, 313, 75, 110, 362, 327, 670, 131, 201, 628, 502, 180, 425, 313, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "০౦੦໐০оℴ၀ዐ๐௦ｏ੦ዐℴ০০૦ዐ੦໐ｏօዐ౦ℴ〇੦๐၀၀૦оℴ໐໐":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        executor.execute(() -> notesDao.insert(note));
                        switchOnThis = "໐ℴ၀ｏ౦౦ℴｏዐ০ооｏዐℴ૦໐ℴዐօｏℴ૦ዐℴ၀௦౦૦ჿ೦੦о〇૦օ";
                    } else {
                        executor.execute(() -> notesDao.insert(note));
                        switchOnThis = "ⲟⲟ〇೦ℴ၀၀௦ዐჿჿ໐〇ዐℴ໐օ੦ዐօ໐ｏ০ዐ໐౦օｏⲟ၀૦օ๐၀〇օ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void deleteNote(RestaurantNote note) {
        String switchOnThis = "ⲟо૦౦օ၀၀೦ዐ૦ℴ၀ℴዐℴօ೦੦ዐօⲟℴ੦ዐ໐౦૦ｏ౦௦о๐০๐੦ჿ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 138, 243, 516, 572, 656, 369, 299, 677, 565, 243, 40, 215, 677, 341, 257, 523, 376, 285, 12, 138, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ⲟо૦౦օ၀၀೦ዐ૦ℴ၀ℴዐℴօ೦੦ዐօⲟℴ੦ዐ໐౦૦ｏ౦௦о๐০๐੦ჿ":
                    if (OPAQUES[7] % OPAQUES[22] == OPAQUES[20]) {
                        executor.execute(() -> notesDao.delete(note));
                        switchOnThis = "๐೦௦૦ⲟ౦օ૦ዐօօⲟ౦ዐℴჿ೦૦ዐ০၀ჿ೦ዐｏℴⲟⲟօℴჿｏჿჿ౦๐";
                    } else {
                        executor.execute(() -> notesDao.delete(note));
                        switchOnThis = "੦໐ჿ໐օ੦౦๐ዐ໐౦၀౦ዐℴ೦૦〇ዐ০ｏ௦੦ዐ௦໐௦ჿｏ๐օ੦ℴօ੦೦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }
}
