package fs;

import java.util.ArrayList;
import java.util.List;

public class Dir extends Component {
    private final List<Component> children = new ArrayList<>();

    @Override
    public void ls() {
        System.out.println(getTabs()+"- Dir: " + name);
        for (Component child : children) {
            child.ls();
        }
    }

    public Dir mkdir(String name) {
        Dir dir = new Dir();
        dir.name = name;
        dir.level = level + 1;
        children.add(dir);
        return dir;
    }

    public Dir touch(String name) {
        File file = new File();
        file.name = name;
        file.level = level + 1;
        children.add(file);
        return this;
    }
}
