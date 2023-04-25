package com.functional.programming.fp.imperative;

public class ReportFiles {
    private final String fileName;
    private final Frequency frequency;

    public ReportFiles(String fileName, Frequency frequency) {
        this.fileName = fileName;
        this.frequency = frequency;
    }

    public String getFileName() {
        return fileName;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "ReportFiles{" +
                "fileName='" + fileName + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
