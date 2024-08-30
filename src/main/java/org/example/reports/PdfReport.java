package org.example.reports;

import org.example.interfaces.Report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PdfReport implements Report {

    @Override
    public File generateReport(String data) {
        File file = new File("report.pdf");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("PDF Report\n");
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
