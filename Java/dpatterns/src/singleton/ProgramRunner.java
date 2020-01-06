package singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("fist log");
        ProgramLogger.getProgramLogger().addLogInfo("second log");
        ProgramLogger.getProgramLogger().addLogInfo("last log");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
