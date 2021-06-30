/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@XmlRootElement(name = "common")
public class Common {

    private String snapshotMinuteFilePath;
    private String snapshotDayFilePath;
    private String snapshotMinuteFileNameFormat;
    private String snapshotDayFileNameFormat;
    private String snapshotPrefixFilename;
    private String snapshotSuffixFilename;

    public Common() {
    }

    public Common(String snapshotMinuteFilePath, String snapshotDayFilePath, String snapshotMinuteFileNameFormat, String snapshotDayFileNameFormat, String snapshotPrefixFilename, String snapshotSuffixFilename) {
        this.snapshotMinuteFilePath = snapshotMinuteFilePath;
        this.snapshotDayFilePath = snapshotDayFilePath;
        this.snapshotMinuteFileNameFormat = snapshotMinuteFileNameFormat;
        this.snapshotDayFileNameFormat = snapshotDayFileNameFormat;
        this.snapshotPrefixFilename = snapshotPrefixFilename;
        this.snapshotSuffixFilename = snapshotSuffixFilename;
    }

    @XmlElement
    public String getSnapshotMinuteFilePath() {
        return snapshotMinuteFilePath;
    }

    public void setSnapshotMinuteFilePath(String snapshotMinuteFilePath) {
        this.snapshotMinuteFilePath = snapshotMinuteFilePath;
    }

    @XmlElement
    public String getSnapshotDayFilePath() {
        return snapshotDayFilePath;
    }

    public void setSnapshotDayFilePath(String snapshotDayFilePath) {
        this.snapshotDayFilePath = snapshotDayFilePath;
    }

    @XmlElement
    public String getSnapshotMinuteFileNameFormat() {
        return snapshotMinuteFileNameFormat;
    }

    public void setSnapshotMinuteFileNameFormat(String snapshotMinuteFileNameFormat) {
        this.snapshotMinuteFileNameFormat = snapshotMinuteFileNameFormat;
    }

    @XmlElement
    public String getSnapshotDayFileNameFormat() {
        return snapshotDayFileNameFormat;
    }

    public void setSnapshotDayFileNameFormat(String snapshotDayFileNameFormat) {
        this.snapshotDayFileNameFormat = snapshotDayFileNameFormat;
    }

    @XmlElement
    public String getSnapshotPrefixFilename() {
        return snapshotPrefixFilename;
    }

    public void setSnapshotPrefixFilename(String snapshotPrefixFilename) {
        this.snapshotPrefixFilename = snapshotPrefixFilename;
    }

    @XmlElement
    public String getSnapshotSuffixFilename() {
        return snapshotSuffixFilename;
    }

    public void setSnapshotSuffixFilename(String snapshotSuffixFilename) {
        this.snapshotSuffixFilename = snapshotSuffixFilename;
    }

}
