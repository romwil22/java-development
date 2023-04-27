package com.functional.programming.fp.streams;

import com.functional.programming.fp.imperative.Frequency;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<ReportFiles> reportFiles = Arrays.asList(
                new ReportFiles("Summary of TYL for the month of December 2022.xlsx", Frequency.DAILY),
                new ReportFiles("Summary of TYL for the month of January 2023.xlsx", Frequency.WEEKLY),
                new ReportFiles("Summary of TYL for the month of January 2023.xlsx", Frequency.MONTHLY),
                new ReportFiles("Summary of TYL for the month of November 2022.xlsx", Frequency.MONTHLY),
                new ReportFiles("Summary of TYL for the month of February 2023.xlsx", Frequency.MONTHLY)

        );

        reportFiles.stream()
                .map(reportFile -> reportFile.getFrequency())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean isInList = reportFiles.stream()
                .anyMatch(frequency -> Frequency.MONTHLY.equals(frequency.getFrequency()));

        System.out.println(isInList);
    }
}
