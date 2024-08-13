package co.com.choucair.certificacion.challengeChoucair.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class ModelExample {

    private String example1;
    private String example2;
    private String example3;

    public ModelExample(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        this.example1 = example1;
        this.example2 = example2;
        this.example3 = example3;
    }

}
