package com.functional.programming.fp.functionalinterface;

import com.functional.programming.fp.imperative.Frequency;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        ReportFiles reportFile = new ReportFiles("Summary of TYL for the month of December 2022.xlsx", Frequency.MONTHLY);
        ReportFiles reportFile1 = new ReportFiles("Summary of TYL for the month of November 2022.xlsx", Frequency.WEEKLY);

        System.out.println( reportFile + " " + isMonthlyReport.test(reportFile));
        System.out.println( reportFile1 + " " + isMonthlyReport.test(reportFile1));

    }

    static Predicate<ReportFiles> isMonthlyReport = reportFile -> reportFile.getFrequency().equals(Frequency.MONTHLY);
}
