package nz.co.g1.a702.findfood.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = { RestaurantNote.class }, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase sInstance;

    public static NoteDatabase getInstance(Context context) {
        String switchOnThis = "౦໐๐ჿℴ๐૦੦ዐ೦〇ჿ౦ዐℴ০ჿ๐ዐ০౦ℴⲟዐ๐ℴо೦ℴօ๐౦๐၀〇೦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 33, 593, 194, 40, 12, 264, 600, 670, 292, 54, 558, 194, 369, 355, 334, 320, 159, 250, 663, 264, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦໐๐ჿℴ๐૦੦ዐ೦〇ჿ౦ዐℴ০ჿ๐ዐ০౦ℴⲟዐ๐ℴо೦ℴօ๐౦๐၀〇೦":
                    if (OPAQUES[2] % OPAQUES[20] != OPAQUES[21]) {
                        return sInstance;
                    } else {
                        if (sInstance == null) {
                            sInstance = Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "note-database").build();
                        }
                        switchOnThis = "о௦օо〇૦о௦ዐ၀໐ℴℴዐℴ౦ｏ၀ዐ੦০೦ჿዐ০೦〇౦օｏ〇ℴ၀ｏоⲟ";
                    }
                    break;
                case "о௦օо〇૦о௦ዐ၀໐ℴℴዐℴ౦ｏ၀ዐ੦০೦ჿዐ০೦〇౦օｏ〇ℴ၀ｏоⲟ":
                    if (OPAQUES[13] % OPAQUES[22] != OPAQUES[20]) {
                        return sInstance;
                    } else {
                        if (sInstance == null) {
                            sInstance = Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "note-database").build();
                        }
                        switchOnThis = "〇ℴ౦ｏ౦໐໐оዐｏ〇၀օዐℴ௦໐੦ዐօ၀೦օዐჿ੦๐၀௦๐ℴ〇໐ｏ၀ℴ";
                    }
                case "০〇๐௦೦੦๐ჿዐ๐০੦౦ዐℴ๐၀ⲟዐօ೦օ੦ዐ೦೦ｏ๐๐〇ｏｏ໐о໐ｏ":
                    if (sInstance == null) {
                        sInstance = Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "note-database").build();
                    }
                    switchOnThis = "௦௦ℴ౦〇௦ჿ၀ዐ੦໐ჿჿዐℴ໐〇၀ዐ੦૦௦௦ዐｏ০౦໐ｏ੦੦оօ๐௦၀";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public abstract NoteDao noteDao();
}
