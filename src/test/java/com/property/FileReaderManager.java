package com.property;

public class FileReaderManager {
private FileReaderManager() {}

public static FileReaderManager getInstance() {
FileReaderManager helper= new FileReaderManager();
return helper;
}
public static ConfigurationReader getInstanceCR() throws Throwable {
ConfigurationReader reader= new ConfigurationReader();
return reader;
}

}
