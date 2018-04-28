package nz.co.g1.a702.findfood.restaurantdetail;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import nz.co.g1.a702.findfood.R;
import nz.co.g1.a702.findfood.database.RestaurantNote;

public class RestaurantNotesListAdapter extends RecyclerView.Adapter<RestaurantNotesListAdapter.RestaurantViewHolder> {

    private List<RestaurantNote> dataset;

    private ItemClickListener itemClickListener;

    private ItemClickListener itemLongClickListener;

    RestaurantNotesListAdapter() {
        dataset = new ArrayList<>();
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = null;
        String switchOnThis = "〇໐๐౦໐໐੦౦ዐօ૦〇೦ዐℴ੦ჿ〇ዐօჿ௦੦ዐ໐૦ⲟｏ၀ℴｏ૦ℴჿ๐ⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 607, 166, 82, 467, 222, 117, 12, 355, 558, 460, 131, 418, 677, 117, 509, 670, 257, 404, 544, 82, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦๐ℴо๐оо௦ዐ੦๐〇ℴዐℴჿ๐ℴዐօｏ໐〇ዐⲟ੦౦০๐օо၀ⲟ〇੦౦":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false);
                        switchOnThis = "૦ｏ〇〇໐௦౦ჿዐ০௦೦௦ዐℴჿ૦໐ዐ૦૦੦૦ዐ๐౦௦௦໐๐๐оჿ໐〇೦";
                    } else {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "๐೦〇௦оⲟ০ｏዐ໐੦੦ჿዐℴоჿ౦ዐօ೦ჿօዐℴｏ〇੦๐௦о౦ℴⲟ౦௦";
                    }
                case "〇໐๐౦໐໐੦౦ዐօ૦〇೦ዐℴ੦ჿ〇ዐօჿ௦੦ዐ໐૦ⲟｏ၀ℴｏ૦ℴჿ๐ⲟ":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false);
                        switchOnThis = "౦๐ℴо๐оо௦ዐ੦๐〇ℴዐℴჿ๐ℴዐօｏ໐〇ዐⲟ੦౦০๐օо၀ⲟ〇੦౦";
                    } else {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "ჿ౦ჿ〇оօ೦০ዐℴօ౦օዐℴо੦〇ዐ૦оℴ૦ዐჿｏ၀оօ௦၀ℴ๐ｏⲟℴ";
                    }
                    break;
                case "၀〇ｏｏ๐໐〇௦ዐ০੦о〇ዐℴ௦௦૦ዐօ၀০౦ዐ০೦ｏ০ℴℴ௦ℴ〇о௦௦":
                    return new RestaurantViewHolder(itemView);
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        RestaurantNote note = null;
        String switchOnThis = "օ೦ｏ௦੦૦ℴ੦ዐ০૦౦ჿዐℴჿ௦௦ዐօ০〇੦ዐ೦໐౦౦ⲟ౦০೦ⲟ੦౦ⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 446, 61, 635, 327, 215, 432, 201, 677, 586, 68, 677, 180, 82, 313, 152, 243, 47, 649, 621, 474, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ⲟ০օ໐ⲟ௦၀оዐ૦о၀ჿዐℴ੦੦ⲟዐօ໐ჿ೦ዐօℴ০ჿ૦ჿჿоｏ၀০о":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        note = dataset.get(position);
                        switchOnThis = "ჿ〇໐ℴჿоօ၀ዐｏ௦ｏჿዐℴ๐౦೦ዐօⲟⲟ၀ዐ၀օ၀ℴｏо໐௦ჿ౦౦০";
                    } else {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(note));
                        }
                        switchOnThis = "ჿ૦໐о၀౦೦〇ዐჿ๐০೦ዐℴ၀౦೦ዐ੦၀〇ℴዐ๐໐ｏ၀૦੦о๐೦о০〇";
                    }
                    break;
                case "ｏⲟоℴｏ໐๐૦ዐо໐০၀ዐℴ೦ｏჿዐօ๐੦০ዐℴ੦ჿ௦оⲟ০໐૦๐ℴ೦":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        note = dataset.get(position);
                        switchOnThis = "ℴ๐օℴｏｏ๐၀ዐⲟ౦๐໐ዐℴ໐੦೦ዐ০ჿоｏዐ౦૦໐໐о૦๐ｏ೦ｏｏ௦";
                    } else {
                        holder.noteView.setText(note.getNote());
                        switchOnThis = "ⲟ০օ໐ⲟ௦၀оዐ૦о၀ჿዐℴ੦੦ⲟዐօ໐ჿ೦ዐօℴ০ჿ૦ჿჿоｏ၀০о";
                    }
                    break;
                case "օ೦ｏ௦੦૦ℴ੦ዐ০૦౦ჿዐℴჿ௦௦ዐօ০〇੦ዐ೦໐౦౦ⲟ౦০೦ⲟ੦౦ⲟ":
                    if (OPAQUES[8] % OPAQUES[20] == OPAQUES[21]) {
                        note = dataset.get(position);
                        switchOnThis = "ｏⲟоℴｏ໐๐૦ዐо໐০၀ዐℴ೦ｏჿዐօ๐੦০ዐℴ੦ჿ௦оⲟ০໐૦๐ℴ೦";
                    } else {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(note));
                        }
                        switchOnThis = "ჿ૦੦о௦о೦ℴዐჿ〇оჿዐℴჿօ௦ዐ০ℴо০ዐ໐〇೦ჿℴ〇ჿ๐໐〇೦၀";
                    }
                    break;
                case "໐ⲟ௦০০೦〇๐ዐ௦੦௦๐ዐℴｏ੦〇ዐ੦੦ⲟ૦ዐⲟ೦೦੦௦ⲟօ੦ℴօ౦೦":
                    note = dataset.get(position);
                    switchOnThis = "ჿоℴ০ჿ૦օ౦ዐℴｏ੦ｏዐℴ೦օ໐ዐ੦〇о౦ዐ೦ჿ၀๐০၀๐௦௦ℴ〇౦";
                    break;
                case "ჿ૦໐о၀౦೦〇ዐჿ๐০೦ዐℴ၀౦೦ዐ੦၀〇ℴዐ๐໐ｏ၀૦੦о๐೦о০〇":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        if (itemLongClickListener != null) {
                            holder.itemView.setOnLongClickListener(view -> {
                                itemLongClickListener.onItemClicked(note);
                                return true;
                            });
                        }
                        switchOnThis = "๐੦ｏօ੦౦๐ｏዐ౦ℴｏօዐℴ௦૦ჿዐ੦ⲟ೦໐ዐ〇௦օօჿჿ၀໐০ჿ౦〇";
                    } else {
                        holder.noteView.setText(note.getNote());
                        switchOnThis = "၀ｏ੦໐໐૦օоዐ〇〇ℴ೦ዐℴ૦౦௦ዐ૦૦૦০ዐｏ໐௦੦ჿ〇〇〇၀๐օ௦";
                    }
                    break;
                case "ｏⲟօ೦ｏⲟｏ૦ዐ๐օⲟ໐ዐℴ೦ჿ౦ዐ০ჿ૦оዐ၀๐੦օ౦೦౦๐໐੦໐ｏ":
                    note = dataset.get(position);
                    switchOnThis = "๐ｏ໐〇օ౦၀౦ዐჿ০੦೦ዐℴℴ೦๐ዐօ૦૦௦ዐ๐〇〇૦๐০ｏо૦၀౦ჿ";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    public int getItemCount() {
        String switchOnThis = "ჿｏℴℴоⲟ૦〇ዐ૦ℴ૦௦ዐℴ੦໐੦ዐ૦௦໐၀ዐօ၀౦໐ｏℴ௦੦օ໐၀ⲟ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 656, 544, 418, 159, 334, 152, 12, 418, 33, 215, 502, 523, 537, 222, 145, 607, 222, 348, 467, 663, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ჿｏℴℴоⲟ૦〇ዐ૦ℴ૦௦ዐℴ੦໐੦ዐ૦௦໐၀ዐօ၀౦໐ｏℴ௦੦օ໐၀ⲟ":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        return dataset.size();
                        switchOnThis = "ჿ໐ℴ০၀໐૦ℴዐ〇੦੦੦ዐℴℴօ၀ዐօ໐၀૦ዐоⲟℴ೦оⲟ੦໐೦ｏⲟ೦";
                    } else {
                        return dataset.size();
                        switchOnThis = "০๐ⲟ〇০ⲟ၀౦ዐ೦౦௦ჿዐℴ၀၀੦ዐ੦০ℴ〇ዐჿ૦๐౦๐о๐௦ｏ੦ⲟⲟ";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return 0;
    }

    void setItems(List<RestaurantNote> notes) {
        String switchOnThis = "ｏ๐ℴ೦၀੦ⲟ๐ዐ੦౦〇оዐℴ੦၀оዐ૦၀օօዐⲟ໐〇໐ｏｏⲟооℴ૦օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 187, 432, 551, 236, 243, 152, 376, 222, 425, 124, 474, 446, 481, 215, 649, 635, 187, 586, 138, 138, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ｏ๐ℴ೦၀੦ⲟ๐ዐ੦౦〇оዐℴ੦၀оዐ૦၀օօዐⲟ໐〇໐ｏｏⲟооℴ૦օ":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        Log.d(Decrypt.decrypt("NjdUVVpLWWVSVUdKS0pzZmpseGVhbXVndHF2eXZwZWp5YnhzaHBpeXl6Z21xbGhweXpzbmVtdG95dmx0YWNxaQ=="), Decrypt.decrypt("MTF2d2hCeXNjZTogZHNvdGZvcW15b293dmVicnRocm5menNzbnFpZmZhd2JsYWZnc3B0dGNoaWRtbGhocWk=") + notes.size());
                        switchOnThis = "౦๐〇ჿ౦౦օ೦ዐ၀ⲟ௦ჿዐℴ〇૦ℴዐ૦о๐〇ዐ౦〇໐ⲟ০ⲟ೦૦೦၀ℴ〇";
                    } else {
                        this.dataset = notes;
                        switchOnThis = "օօ௦оօ౦၀оዐ౦๐ⲟ๐ዐℴ〇၀๐ዐ૦੦ℴ౦ዐ੦၀௦ჿ၀೦օ૦௦໐օ০";
                    }
                    break;
                case "〇੦օ০၀ჿⲟⲟዐ๐ｏ૦০ዐℴ໐౦০ዐօ੦౦௦ዐ૦о௦ჿｏｏｏ೦੦〇੦〇":
                    this.dataset = notes;
                    switchOnThis = "௦ⲟ੦౦๐௦૦ჿዐօ০၀၀ዐℴ၀ⲟоዐ০౦ｏჿዐℴ૦ჿօо૦೦о௦౦ⲟ၀";
                    break;
                case "ⲟℴօ੦੦໐௦ჿዐ೦௦೦๐ዐℴ၀੦ⲟዐօ௦౦௦ዐⲟ၀օⲟ౦௦о௦੦〇০〇":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        notifyDataSetChanged();
                        switchOnThis = "௦оо໐ℴ໐ℴоዐ૦૦໐౦ዐℴｏ௦ჿዐօⲟօℴዐ௦໐૦೦ｏ౦೦೦ℴჿｏⲟ";
                    } else {
                        notifyDataSetChanged();
                        switchOnThis = "〇оо๐૦о౦оዐ૦೦໐೦ዐℴ၀ⲟ੦ዐ૦ℴｏⲟዐｏ০〇оօ੦໐০၀੦໐〇";
                    }
                    break;
                case "౦๐〇ჿ౦౦օ೦ዐ၀ⲟ௦ჿዐℴ〇૦ℴዐ૦о๐〇ዐ౦〇໐ⲟ০ⲟ೦૦೦၀ℴ〇":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        Log.d(Decrypt.decrypt("NjdUVVpLWWVSVUdKS0pzZmpseGVhbXVndHF2eXZwZWp5YnhzaHBpeXl6Z21xbGhweXpzbmVtdG95dmx0YWNxaQ=="), Decrypt.decrypt("MTF2d2hCeXNjZTogZHNvdGZvcW15b293dmVicnRocm5menNzbnFpZmZhd2JsYWZnc3B0dGNoaWRtbGhocWk=") + notes.size());
                        switchOnThis = "೦օⲟⲟ౦๐ⲟ၀ዐ௦໐௦օዐℴ০օ੦ዐ੦၀၀օዐ௦о౦೦೦ⲟ௦௦੦০ⲟ০";
                    } else {
                        this.dataset = notes;
                        switchOnThis = "ⲟℴօ੦੦໐௦ჿዐ೦௦೦๐ዐℴ၀੦ⲟዐօ௦౦௦ዐⲟ၀օⲟ౦௦о௦੦〇০〇";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        String switchOnThis = "౦၀օօ၀〇ჿоዐⲟჿօ০ዐℴℴ၀௦ዐ૦೦၀օዐ〇໐ｏ೦ℴ೦ℴℴ೦〇ｏ〇";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 558, 271, 89, 516, 89, 488, 257, 502, 362, 614, 453, 572, 390, 19, 544, 54, 82, 537, 152, 313, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦၀օօ၀〇ჿоዐⲟჿօ০ዐℴℴ၀௦ዐ૦೦၀օዐ〇໐ｏ೦ℴ೦ℴℴ೦〇ｏ〇":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "໐၀໐၀০໐ჿ၀ዐ๐ⲟჿ૦ዐℴℴ০౦ዐօ〇౦၀ዐ௦оօⲟ๐၀০௦ⲟ૦০၀";
                    } else {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "໐૦ⲟо੦ℴℴ૦ዐ௦၀օ೦ዐℴ〇๐ჿዐ૦੦ჿℴዐｏ๐ｏｏｏℴⲟⲟ೦౦๐၀";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setOnItemLongClickListener(ItemClickListener itemLongClickListener) {
        String switchOnThis = "௦০০੦੦໐〇੦ዐℴ௦௦օዐℴℴ੦၀ዐ੦౦໐௦ዐ໐໐၀о০ⲟ೦оօо೦๐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 47, 145, 600, 404, 117, 502, 635, 82, 327, 278, 404, 544, 152, 152, 229, 96, 474, 404, 40, 593, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦০০੦੦໐〇੦ዐℴ௦௦օዐℴℴ੦၀ዐ੦౦໐௦ዐ໐໐၀о০ⲟ೦оօо೦๐":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        this.itemLongClickListener = itemLongClickListener;
                        switchOnThis = "੦০ℴо໐၀௦౦ዐｏℴօｏዐℴ๐౦໐ዐ੦૦೦໐ዐооⲟ૦оⲟо௦〇๐௦๐";
                    } else {
                        this.itemLongClickListener = itemLongClickListener;
                        switchOnThis = "ｏჿ૦ⲟ၀〇೦ｏዐօ௦〇ℴዐℴ၀੦ｏዐ૦ⲟ০ℴዐօ০〇〇੦๐௦о〇೦๐օ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    interface ItemClickListener {

        void onItemClicked(RestaurantNote note) {
            String switchOnThis = "ｏ০ⲟ໐ჿჿℴ௦ዐ〇౦օ੦ዐℴჿ໐ⲟዐ੦০о૦ዐ〇ⲟ੦໐〇੦〇౦օ๐௦໐";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 677, 96, 152, 313, 565, 544, 320, 243, 565, 138, 334, 649, 418, 677, 614, 26, 166, 460, 621, 474, 7, 5, 7, 5 };
            while (infiniteLoop) {
                switch(switchOnThis) {
                    default:
                        infiniteLoop = false;
                }
            }
        }
    }

    static class RestaurantViewHolder extends RecyclerView.ViewHolder {

        TextView noteView;

        RestaurantViewHolder(View view) {
            super(view);
            noteView = view.findViewById(R.id.note_list_title);
        }
    }
}
