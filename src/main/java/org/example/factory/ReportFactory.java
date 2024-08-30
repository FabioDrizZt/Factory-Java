package org.example.factory;

import org.example.interfaces.Report;
import org.example.reports.ExcelReport;
import org.example.reports.PdfReport;

public class ReportFactory {
    public static Report createReport(ReportType type) {
        switch (type) {
            case PDF:
                return new PdfReport();
            case EXCEL:
                return new ExcelReport();
            default:
                throw new IllegalArgumentException("Unknown report type");
        }
    }
}
