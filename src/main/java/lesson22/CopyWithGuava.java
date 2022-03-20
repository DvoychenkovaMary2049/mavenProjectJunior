package lesson22;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements CopyUtils{
    @Override
    public void copy(String from, String to) throws IOException {
        File copyFrom= new File(from);
        File copyTo = new File(to);
        com.google.common.io.Files.copy(copyFrom, copyTo);
    }
}
