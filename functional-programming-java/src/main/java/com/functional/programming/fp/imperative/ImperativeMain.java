package com.functional.programming.fp.imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImperativeMain {
    public static void main(String[] args) {
        List<ReportFiles> reportFiles =
                Arrays.asList(
                        new ReportFiles("Summary of TYL for the month of December 2022.xlsx", Frequency.DAILY),
                        new ReportFiles("Summary of TYL for the month of January 2023.xlsx", Frequency.WEEKLY),
                        new ReportFiles("Summary of TYL for the month of January 2023.xlsx", Frequency.MONTHLY),
                        new ReportFiles("Summary of TYL for the month of November 2022.xlsx", Frequency.MONTHLY),
                        new ReportFiles("Summary of TYL for the month of February 2023.xlsx", Frequency.MONTHLY)
                );

        List<ReportFiles> monthlyReports = new ArrayList<>();

        //IMPERATIVE APPROACH
        System.out.println("IMPERATIVE APPROACH");

        for (ReportFiles reportFile: reportFiles) {
            if(Frequency.MONTHLY.equals(reportFile.getFrequency())) {
                monthlyReports.add(reportFile);
            }
        }

        for (ReportFiles monthlyReport: monthlyReports) {
            System.out.println(monthlyReport);
        }

        // DECLARATIVE APPROACH
        System.out.println("DECLARATIVE APPROACH");

        List<ReportFiles> weeklyReports = reportFiles.stream()
                .filter(monthlyReport -> Frequency.WEEKLY.equals(monthlyReport.getFrequency()))
                .collect(Collectors.toList());

        weeklyReports.forEach(System.out::println);

        Predicate<ReportFiles> monthlyReports1 = monthlyReport -> Frequency.MONTHLY.equals(monthlyReport.getFrequency()); //predicate function

        reportFiles.stream()
                .filter(monthlyReports1)
                .forEach(System.out::println);
    }
}
