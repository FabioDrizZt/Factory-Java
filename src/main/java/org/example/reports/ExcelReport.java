package org.example.reports;

import org.example.interfaces.Report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExcelReport implements Report {

    @Override
    public File generateReport(String data) {
        File file = new File("report.csv");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Excel Report\n");
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
