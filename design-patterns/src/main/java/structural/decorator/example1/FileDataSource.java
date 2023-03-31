package structural.decorator.example1;

import structural.decorator.example1.DataSource;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream os = new FileOutputStream(file)){
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader fr = new FileReader(file)){
            buffer = new char[(int) file.length()];
            fr.read(buffer);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return new String(buffer);
    }
}
