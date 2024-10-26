package fs;

public abstract class Component {
    protected String name;
    protected int level = 0;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void ls();

    protected String getTabs() {
        StringBuilder tabs = new StringBuilder();
        tabs.append("\t".repeat(Math.max(0, level)));
        return tabs.toString();
    }
}
