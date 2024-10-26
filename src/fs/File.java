package fs;

public class File extends Component {
    @Override
    public void ls() {
        System.out.println(getTabs()+"- File: " + name);
    }
}
