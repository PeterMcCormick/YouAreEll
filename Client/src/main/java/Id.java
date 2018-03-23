
public class Id {

    private String id;
    private String name;
    private String github;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public Id(String id, String name, String github) {

        this.id = id;
        this.name = name;
        this.github = github;

    }

    public Id(String name, String github) {
        this.name = name;
        this.github = github;
    }

    public Id() {

    }

    @Override
    public String toString() {
        return "Id{" +
                "id='" + this.id + '\'' +
                ", name='" + this.name + '\'' +
                ", gitHubId='" + this.github + '\'' +
                '}';
    }
}



