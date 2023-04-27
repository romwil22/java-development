package com.functional.programming.fp.streams;

import com.functional.programming.fp.imperative.Frequency;

public class ReportFiles {
    private String fileName;
    private Frequency frequency;

    public ReportFiles(String fileName, Frequency frequency) {
        this.fileName = fileName;
        this.frequency = frequency;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "ReportFiles{" +
                "fileName='" + fileName + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
