package bg.softuni.diana.material_design_fragment.view;

import android.databinding.DataBindingUtil;
import android.view.View;

import com.squareup.picasso.Picasso;

import bg.softuni.diana.material_design_fragment.data.StoryItem;
import bg.softuni.diana.material_design_fragment.databinding.ItemStoryBinding;


public class StoryViewHolder extends BaseViewHolder<StoryItem> {

  ItemStoryBinding binding;


    public StoryViewHolder(View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }

    @Override
    public void setData(StoryItem item) {
        // name
        binding.textName.setText(item.getName());
        // time
        binding.textStatus.setText(item.getTime());
        // avatar
        Picasso.with(itemView.getContext()).load(item.getProfileImageUrl()).into(binding.imageAvatar);
        // image story
        Picasso.with(itemView.getContext()).load(item.getStoryImageUrl()).into(binding.imageStory);
        // text story
        binding.textStory.setText(item.getStoryText());
        // count
        binding.txtCount.setText(item.getThanksCount());
    }
}
