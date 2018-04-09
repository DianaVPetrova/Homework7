package bg.softuni.diana.material_design_fragment.data;

public class StoryItem {

    private String name;
    private String profileImageUrl;
    private String time;
    private String storyText;
    private String storyImageUrl;
    private int thanksCount;

    public StoryItem(String name, String profileImageUrl, String time, String storyText, String storyImageUrl, int thanksCount) {
        this.name = name;
        this.profileImageUrl = profileImageUrl;
        this.time = time;
        this.storyText = storyText;
        this.storyImageUrl = storyImageUrl;
        this.thanksCount = thanksCount;
    }

    public String getName() {
        return name;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getTime() {
        return time;
    }

    public String getStoryText() {
        return storyText;
    }

    public String getStoryImageUrl() {
        return storyImageUrl;
    }

    public int getThanksCount() {
        return thanksCount;
    }
}
