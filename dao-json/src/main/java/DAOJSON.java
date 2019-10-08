import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import webprog.model.Kocsi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class DAOJSON {
    File file;
    ObjectMapper mapper;

    public DAOJSON(String filepath) {
        this.file = new File(filepath);
        this.mapper= new ObjectMapper();
    }

    public Collection<Kocsi> readAllKocsi() throws IOException {
        Collection<Kocsi> result = new ArrayList<>();
        result= mapper.readValue(file,
                new TypeReference<ArrayList<Kocsi>>(){});
        return result;
    }
}
