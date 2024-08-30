package org.example;

import org.example.interfaces.Report;
import org.example.factory.ReportFactory;
import org.example.factory.ReportType;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Report pdfReport = ReportFactory.createReport(ReportType.PDF);
        File pdfFile = pdfReport.generateReport("This is a sample PDF report.");
        System.out.println("PDF report generated: " + pdfFile.getAbsolutePath());

        Report excelReport = ReportFactory.createReport(ReportType.EXCEL);
        File excelFile = excelReport.generateReport("This is a sample Excel report.");
        System.out.println("Excel report generated: " + excelFile.getAbsolutePath());
    }
}