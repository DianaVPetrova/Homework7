package bg.softuni.diana.material_design_fragment.data;

import java.util.Arrays;
import java.util.List;

public class DummyDatabase {

    private static List<StoryItem> database;

    public static List<StoryItem> getDatabase() {
        if(database == null) {
            database = generateData();
        }
        return database;
    }

    private static List<StoryItem> generateData() {
        return Arrays.asList(
                new StoryItem(
                        "FRANCISCO WATSON",
                        "https://raw.githubusercontent.com/android-soft-uni/03-Views-Layouts/master/Homework4/assets/xxxhdpi/avatar_1.png",
                        "TODAY 10:52, PM",
                        "Some text about the story...",
                        "https://raw.githubusercontent.com/android-soft-uni/03-Views-Layouts/master/Homework4/assets/xxxhdpi/image_story.png",
                        23),
                new StoryItem(
                        "FRANC PAGE",
                        "https://raw.githubusercontent.com/android-soft-uni/03-Views-Layouts/master/Homework4/assets/xxxhdpi/avatar_2.png",
                        "11:23",
                        "dsdsadas",
                        "ds",
                        23),
                new StoryItem(
                        "FRANCISCO WATSON",
                        "https://raw.githubusercontent.com/android-soft-uni/03-Views-Layouts/master/Homework4/assets/xxxhdpi/avatar_1.png",
                        "11:23",
                        "dsdsadas",
                        "ds",
                        23),
                new StoryItem(
                        "FRANCISCO WATSON",
                        "https://raw.githubusercontent.com/android-soft-uni/03-Views-Layouts/master/Homework4/assets/xxxhdpi/avatar_1.png",
                        "11:23",
                        "dsdsadas",
                        "ds",
                        23),
                new StoryItem(
                        "FRANCISCO WATSON",
                        "https://raw.githubusercontent.com/android-soft-uni/03-Views-Layouts/master/Homework4/assets/xxxhdpi/avatar_1.png",
                        "11:23",
                        "dsdsadas",
                        "ds",
                        23)


        );
    }
}
