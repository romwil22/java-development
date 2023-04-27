package com.functional.programming.fp.functionalinterface;

import com.functional.programming.fp.imperative.Frequency;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        ReportFiles reportFile = new ReportFiles("Summary of TYL for the month of December 2022", Frequency.MONTHLY);
        reportFilesMessage.accept(reportFile);

        //BICONSUMER
        System.out.println("BICONSUMER");
        reportFileMonthly.accept(reportFile, true);
        reportFileMonthly.accept(reportFile, false);
    }

    static Consumer<ReportFiles> reportFilesMessage = reportFile
            -> System.out.println(reportFile.toString());

    static BiConsumer<ReportFiles, Boolean> reportFileMonthly = (reportFile, isMonthly) ->
            System.out.println(isMonthly ? reportFile.toString() : reportFile.getFileName() + " " + "not monthly");
}
