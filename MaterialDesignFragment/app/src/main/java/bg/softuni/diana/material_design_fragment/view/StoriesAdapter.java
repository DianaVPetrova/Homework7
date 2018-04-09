package bg.softuni.diana.material_design_fragment.view;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import bg.softuni.diana.material_design_fragment.R;
import bg.softuni.diana.material_design_fragment.data.StoryItem;

public class StoriesAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    public static final int TYPE_ITEM = 1;
    public static final int TYPE_FOOT = 2;
    private List<StoryItem> data;

    public StoriesAdapter(List<StoryItem> data) {
        this.data = data;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TYPE_FOOT) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.footer_layout, parent, false);
            FooterViewHolder viewHolder = new FooterViewHolder(view);
            return viewHolder;
        } else
        if (viewType == TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story, parent, false);
            BaseViewHolder vh = new StoryViewHolder(view);
            return vh;
        }

        return null;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

        if (holder instanceof StoryViewHolder) {
            StoryItem item = data.get(position);
            holder.setData(item);
        }

    }



    @Override
    public int getItemViewType(int position) {
        if (isMyFooter(position)) {
            return TYPE_FOOT;
        }
        return TYPE_ITEM;
    }


    private boolean isMyFooter(int position) {
        return position == data.size();
    }


    @Override
    public int getItemCount() {
        return data.size()+1;
    }
}
