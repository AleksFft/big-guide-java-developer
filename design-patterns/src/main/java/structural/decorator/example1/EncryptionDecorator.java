package structural.decorator.example1;

import structural.decorator.example1.DataSource;
import structural.decorator.example1.DataSourceDecorator;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] bytes = data.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] += 1;
        }
        return Base64.getEncoder().encodeToString(bytes);
    }

    private String decode(String data) {
        byte[] bytes = Base64.getDecoder().decode(data);
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= 1;
        }
        return new String(bytes);
    }

}
