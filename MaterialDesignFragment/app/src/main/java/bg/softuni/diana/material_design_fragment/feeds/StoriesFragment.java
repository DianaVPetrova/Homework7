package bg.softuni.diana.material_design_fragment.feeds;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import bg.softuni.diana.material_design_fragment.R;
import bg.softuni.diana.material_design_fragment.data.DummyDatabase;
import bg.softuni.diana.material_design_fragment.data.StoryItem;
import bg.softuni.diana.material_design_fragment.view.StoriesAdapter;

public class StoriesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stories, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<StoryItem> data =  DummyDatabase.getDatabase();
        StoriesAdapter adapter = new StoriesAdapter(data);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
