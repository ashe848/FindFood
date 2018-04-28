package nz.co.g1.a702.findfood;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import nz.co.g1.a702.findfood.placesapi.Restaurant;

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder> {

    private Context context;

    private List<Restaurant> dataset;

    private Location currentLocation;

    private ItemClickListener itemClickListener;

    RestaurantListAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = null;
        String switchOnThis = "০๐௦〇ჿ੦೦০ዐⲟ೦о၀ዐℴо၀оዐ੦ⲟⲟｏዐ০౦೦ℴჿ૦௦ჿ໐၀೦օ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 544, 677, 82, 243, 33, 383, 348, 446, 509, 82, 397, 117, 565, 600, 677, 509, 677, 75, 432, 607, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦໐〇ჿ๐〇০ℴዐℴ૦૦໐ዐℴ໐ⲟⲟዐ૦ℴ๐օዐօჿ૦ⲟ໐੦০〇௦੦ｏ౦":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
                        switchOnThis = "〇೦〇౦౦૦ჿ০ዐ໐ჿჿ໐ዐℴ၀౦೦ዐ੦〇০ⲟዐ๐ჿоჿℴ੦〇ჿⲟ੦ⲟ๐";
                    } else {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "ჿ๐໐০ℴ૦〇૦ዐჿ๐ℴ੦ዐℴჿ೦௦ዐ૦၀০০ዐ૦০๐๐ｏօ၀о૦૦ℴ๐";
                    }
                case "੦о௦ℴоօօ๐ዐ૦๐೦օዐℴⲟ௦ｏዐ੦೦ℴ૦ዐ໐੦ℴ౦૦〇೦ｏⲟｏ၀ჿ":
                    return new RestaurantViewHolder(itemView);
                case "০๐௦〇ჿ੦೦০ዐⲟ೦о၀ዐℴо၀оዐ੦ⲟⲟｏዐ০౦೦ℴჿ૦௦ჿ໐၀೦օ":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        return new RestaurantViewHolder(itemView);
                        switchOnThis = "੦೦ⲟ๐౦௦੦ჿዐ〇ℴ౦օዐℴ๐ჿ໐ዐօ૦〇ⲟዐ০໐੦০ⲟ౦০ℴ੦ｏℴ၀";
                    } else {
                        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
                        switchOnThis = "౦໐〇ჿ๐〇০ℴዐℴ૦૦໐ዐℴ໐ⲟⲟዐ૦ℴ๐օዐօჿ૦ⲟ໐੦০〇௦੦ｏ౦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = null;
        String switchOnThis = "ჿ〇ⲟоо၀੦ｏዐჿℴооዐℴｏօ੦ዐ૦๐၀ｏዐо໐๐೦๐ℴ૦໐໐о੦௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 544, 656, 467, 159, 558, 397, 194, 110, 180, 348, 418, 159, 432, 474, 439, 264, 544, 439, 82, 537, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "੦ⲟ੦໐௦০௦໐ዐ੦໐০ⲟዐℴ௦௦౦ዐ૦ｏо౦ዐ೦૦ℴｏ౦౦೦〇০ｏ௦໐":
                    if (OPAQUES[6] % OPAQUES[20] == OPAQUES[21]) {
                        holder.iconView.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getType().getDrawableResId()));
                        switchOnThis = "〇੦〇೦૦ｏ০〇ዐⲟℴ၀〇ዐℴ௦ⲟ೦ዐ০೦օ๐ዐ໐ｏｏｏօ〇೦〇૦ჿｏℴ";
                    } else {
                        holder.iconView.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getType().getDrawableResId()));
                        switchOnThis = "ｏ๐೦౦੦໐ჿჿዐ૦໐၀௦ዐℴ〇௦૦ዐ૦ⲟ੦౦ዐℴℴ၀০௦ℴℴ০ჿ૦о๐";
                    }
                    break;
                case "၀оօ੦၀ｏ௦౦ዐ၀໐০ｏዐℴｏоｏዐ૦〇〇ⲟዐ〇૦ⲟօ੦೦၀๐ჿ๐੦೦":
                    holder.nameView.setText(restaurant.getName());
                    switchOnThis = "оⲟｏ၀০౦০〇ዐ໐০໐೦ዐℴ௦၀оዐօо੦౦ዐ૦օ〇ℴо໐੦૦ｏօօ௦";
                    break;
                case "ჿ〇ⲟоо၀੦ｏዐჿℴооዐℴｏօ੦ዐ૦๐၀ｏዐо໐๐೦๐ℴ૦໐໐о੦௦":
                    if (OPAQUES[7] % OPAQUES[22] == OPAQUES[20]) {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(restaurant));
                        }
                        switchOnThis = "օօоｏօ๐ℴ๐ዐ૦೦ｏоዐℴ၀੦০ዐ০੦ჿ೦ዐօ၀օ౦ჿ၀ℴ໐௦૦ℴ〇";
                    } else {
                        restaurant = dataset.get(position);
                        switchOnThis = "੦ⲟ੦໐௦০௦໐ዐ੦໐০ⲟዐℴ௦௦౦ዐ૦ｏо౦ዐ೦૦ℴｏ౦౦೦〇০ｏ௦໐";
                    }
                    break;
                case "૦၀໐ｏℴоℴ౦ዐჿ໐ⲟ੦ዐℴ೦ｏ௦ዐ০๐૦ｏዐ౦ℴℴօℴⲟℴⲟо໐౦၀":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        restaurant = dataset.get(position);
                        switchOnThis = "౦೦౦০০၀౦০ዐⲟ૦૦ℴዐℴ೦೦໐ዐ੦ⲟ௦੦ዐ໐ჿ੦о౦ⲟօ೦օ౦໐೦";
                    } else {
                        if (itemClickListener != null) {
                            holder.itemView.setOnClickListener(view -> itemClickListener.onItemClicked(restaurant));
                        }
                        switchOnThis = "օօоօ〇૦ჿ၀ዐｏ๐ⲟ౦ዐℴ௦о௦ዐ૦౦ჿоዐჿⲟ၀ℴ๐ℴ໐〇౦๐ｏ၀";
                    }
                    break;
                case "๐౦੦၀о๐౦౦ዐჿ〇оℴዐℴｏℴ૦ዐօ೦௦ჿዐჿ౦੦௦ჿⲟօｏ໐౦௦օ":
                    holder.iconView.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getType().getDrawableResId()));
                    switchOnThis = "໐օ໐໐〇౦੦౦ዐⲟ၀ｏ౦ዐℴ౦௦օዐ૦ℴ໐ჿዐｏჿ੦೦〇ⲟ௦ｏⲟ၀ⲟℴ";
                    break;
                case "〇੦〇೦૦ｏ০〇ዐⲟℴ၀〇ዐℴ௦ⲟ೦ዐ০೦օ๐ዐ໐ｏｏｏօ〇೦〇૦ჿｏℴ":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
                        holder.nameView.setText(restaurant.getName());
                        switchOnThis = "๐௦၀ｏ০০ℴ๐ዐ၀ℴ੦௦ዐℴℴ௦౦ዐ૦೦օօዐ๐о೦၀о૦၀ｏ໐๐ｏ౦";
                    } else {
                        holder.nameView.setText(restaurant.getName());
                        switchOnThis = "ℴ੦օ૦໐〇〇ჿዐ೦ⲟ〇၀ዐℴ੦௦၀ዐ૦০ｏ೦ዐօℴ〇օ๐၀૦оჿჿօ〇";
                    }
                    break;
                case "๐௦၀ｏ০০ℴ๐ዐ၀ℴ੦௦ዐℴℴ௦౦ዐ૦೦օօዐ๐о೦၀о૦၀ｏ໐๐ｏ౦":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        holder.distanceView.setText(restaurant.distanceFrom(currentLocation));
                        switchOnThis = "૦၀໐ｏℴоℴ౦ዐჿ໐ⲟ੦ዐℴ೦ｏ௦ዐ০๐૦ｏዐ౦ℴℴօℴⲟℴⲟо໐౦၀";
                    } else {
                        holder.nameView.setText(restaurant.getName());
                        switchOnThis = "〇੦оℴჿ૦оｏዐоｏ০ｏዐℴ๐໐ⲟዐ੦ⲟ೦ℴዐ໐໐ｏｏჿо၀оჿ૦૦ｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    @Override
    public int getItemCount() {
        String switchOnThis = "၀໐ⲟჿ໐၀೦օዐｏℴ〇ｏዐℴ૦০০ዐ૦օ௦๐ዐ૦ჿօ௦໐੦၀૦о੦੦ℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 33, 103, 649, 649, 537, 383, 369, 180, 299, 278, 397, 138, 593, 208, 201, 271, 530, 173, 68, 481, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "၀໐ⲟჿ໐၀೦օዐｏℴ〇ｏዐℴ૦০০ዐ૦օ௦๐ዐ૦ჿօ௦໐੦၀૦о੦੦ℴ":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        return dataset.size();
                        switchOnThis = "၀໐૦ჿ౦૦੦๐ዐ০ⲟ໐〇ዐℴօ๐௦ዐ০ℴ๐౦ዐ၀૦ჿ௦૦੦໐૦ჿ໐၀೦";
                    } else {
                        return dataset.size();
                        switchOnThis = "օℴ০ｏჿⲟ০ℴዐℴ໐౦๐ዐℴօ໐౦ዐօ๐ｏ໐ዐ౦௦ℴ౦օ೦૦၀০໐ℴօ";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return 0;
    }

    void setItems(List<Restaurant> restaurants) {
        String switchOnThis = "౦๐оⲟ೦оⲟℴዐ০օ౦੦ዐℴ௦໐๐ዐ০ｏօ๐ዐ౦ⲟℴ౦о౦၀๐౦੦૦ｏ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 180, 446, 271, 152, 222, 439, 292, 369, 187, 348, 411, 40, 677, 446, 222, 12, 649, 68, 460, 348, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "օ〇૦ｏо๐ℴ೦ዐⲟ૦๐օዐℴ౦০〇ዐօ〇௦ჿዐ೦௦૦૦໐ⲟ౦௦օ౦ⲟჿ":
                    this.dataset = restaurants;
                    switchOnThis = "օօｏ၀૦օ০໐ዐ০ℴ๐௦ዐℴ〇〇໐ዐ੦૦၀оዐ೦໐၀૦੦೦๐ｏ௦ჿ〇๐";
                    break;
                case "౦๐оⲟ೦оⲟℴዐ০օ౦੦ዐℴ௦໐๐ዐ০ｏօ๐ዐ౦ⲟℴ౦о౦၀๐౦੦૦ｏ":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        this.dataset = restaurants;
                        switchOnThis = "๐౦೦০੦օ೦օዐⲟ໐ჿ၀ዐℴ๐೦၀ዐօ໐੦૦ዐо೦ℴ੦૦೦ｏ০ჿ੦௦໐";
                    } else {
                        this.dataset = restaurants;
                        switchOnThis = "օ〇๐౦〇ⲟჿ೦ዐ೦օ〇оዐℴօօ౦ዐ૦օ໐〇ዐ๐໐၀ｏо၀੦๐๐௦০၀";
                    }
                    break;
                case "օ〇๐౦〇ⲟჿ೦ዐ೦օ〇оዐℴօօ౦ዐ૦օ໐〇ዐ๐໐၀ｏо၀੦๐๐௦০၀":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        notifyDataSetChanged();
                        switchOnThis = "౦๐ⲟ౦౦੦ℴ௦ዐо੦օ௦ዐℴ௦ჿօዐ০૦о໐ዐ೦ℴ೦੦օ၀оℴ๐੦೦೦";
                    } else {
                        notifyDataSetChanged();
                        switchOnThis = "੦ℴ૦ⲟօ๐ჿ০ዐ০ⲟჿ໐ዐℴ੦〇၀ዐ੦〇ｏ੦ዐ໐օ၀૦೦੦ⲟ೦օо੦໐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setDistanceLocation(Location location) {
        String switchOnThis = "ｏჿ〇օℴо௦〇ዐ௦০ჿ〇ዐℴ๐௦௦ዐ੦ჿ૦၀ዐ௦০০ჿօჿ௦ⲟ૦ℴ೦૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 292, 40, 117, 278, 222, 341, 355, 418, 670, 460, 579, 54, 551, 600, 222, 376, 145, 110, 495, 432, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ｏჿ〇օℴо௦〇ዐ௦০ჿ〇ዐℴ๐௦௦ዐ੦ჿ૦၀ዐ௦০০ჿօჿ௦ⲟ૦ℴ೦૦":
                    if (OPAQUES[17] % OPAQUES[22] == OPAQUES[20]) {
                        currentLocation = location;
                        switchOnThis = "ⲟℴо૦૦〇၀ｏዐ௦ℴ௦૦ዐℴ૦၀௦ዐ০௦ⲟჿዐ၀ℴ〇ℴჿℴ໐о౦၀ⲟ๐";
                    } else {
                        currentLocation = location;
                        switchOnThis = "০၀оｏ〇০๐ⲟዐⲟ௦০օዐℴ০૦ｏዐ০ｏ௦〇ዐօ〇౦〇ჿ૦๐౦ⲟօоօ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        String switchOnThis = "๐օ〇௦௦೦ｏ๐ዐ০о໐૦ዐℴօｏｏዐ੦ℴⲟ੦ዐ๐ჿ০〇ჿօ೦੦੦ჿ๐ℴ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 635, 250, 362, 103, 313, 642, 110, 33, 663, 152, 54, 446, 208, 278, 439, 341, 572, 425, 117, 397, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐օ〇௦௦೦ｏ๐ዐ০о໐૦ዐℴօｏｏዐ੦ℴⲟ੦ዐ๐ჿ০〇ჿօ೦੦੦ჿ๐ℴ":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "ჿօ੦໐о໐ℴ๐ዐჿ০໐ｏዐℴℴ〇ჿዐ૦ჿ໐๐ዐｏ໐〇௦о౦౦௦ｏ੦૦೦";
                    } else {
                        this.itemClickListener = itemClickListener;
                        switchOnThis = "〇ჿ๐оօ੦০೦ዐ๐૦૦〇ዐℴｏ੦೦ዐ੦૦ｏℴዐ೦ჿⲟჿоօ໐ｏ೦ℴ૦ｏ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
    }

    interface ItemClickListener {

        void onItemClicked(Restaurant restaurant) {
            String switchOnThis = "ⲟօ౦օ૦೦о௦ዐ੦օ૦૦ዐℴ౦౦ｏዐ০๐ｏ၀ዐ૦௦օ๐ⲟ੦௦ｏｏ౦ⲟо";
            boolean infiniteLoop = true;
            int[] OPAQUES = new int[] { 19, 124, 593, 236, 194, 432, 551, 614, 124, 404, 292, 33, 89, 82, 131, 537, 278, 586, 663, 243, 7, 5, 7, 5 };
            while (infiniteLoop) {
                switch(switchOnThis) {
                    default:
                        infiniteLoop = false;
                }
            }
        }
    }

    static class RestaurantViewHolder extends RecyclerView.ViewHolder {

        ImageView iconView;

        TextView nameView;

        TextView distanceView;

        RestaurantViewHolder(View view) {
            super(view);
            iconView = view.findViewById(R.id.restaurant_list_icon);
            nameView = view.findViewById(R.id.restaurant_list_title);
            distanceView = view.findViewById(R.id.restaurant_list_distance);
        }
    }
}
