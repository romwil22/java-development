package com.functional.programming.fp.functionalinterface;

import com.functional.programming.fp.imperative.Frequency;

import java.util.Arrays;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getReportFile.get());
    }

    static Supplier<ReportFiles> getReportFile = () -> new
            ReportFiles("Summary of TYL for the month of December 2022.xlsx", Frequency.MONTHLY);

}
