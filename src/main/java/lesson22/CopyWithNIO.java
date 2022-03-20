package lesson22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyWithNIO implements CopyUtils{
    @Override
    public void copy(String from, String to) throws IOException {

            Path pathFrom = Paths.get(from);
            Path pathTo = new File(to).toPath();
            Files.copy(pathFrom, pathTo, StandardCopyOption.REPLACE_EXISTING);


    }
}
