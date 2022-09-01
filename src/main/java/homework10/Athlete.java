package homework10;

public class Athlete {
    private final String athleteNumber;
    private final String athleteName;
    private final String countryCode;
    private final String skiTimeResult;
    private final String firstShootingResult;
    private final String secondShootingResult;
    private final String thirdShootingResult;
    private int totalTime;
    private int missed;

    public Athlete(String athleteNumber, String athleteName, String countryCode, String skiTimeResult, String firstShootingResult, String secondShootingResult, String thirdShootingResult) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingResult = firstShootingResult;
        this.secondShootingResult = secondShootingResult;
        this.thirdShootingResult = thirdShootingResult;
        calculateTotalTime();
    }

    @Override
    public String toString() {
        return "Athlete" +
                "athleteNumber='" + athleteNumber + '\'' +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResult='" + skiTimeResult + '\'' +
                ", firstShootingResult='" + firstShootingResult + '\'' +
                ", secondShootingResult='" + secondShootingResult + '\'' +
                ", thirdShootingResult='" + thirdShootingResult;
    }

    public void calculateTotalTime() {
        String[] tokens = skiTimeResult.split(":");
        int minutes = Integer.parseInt(tokens[0]);
        int seconds = Integer.parseInt(tokens[1]);
        missed = 0;
        String shootResults = firstShootingResult + secondShootingResult + thirdShootingResult;
        for (int i=0; i<shootResults.length(); i++) {
            if (shootResults.charAt(i) == 'o') {
                missed += 10;
            }
        }
        totalTime = minutes * 60 + seconds + missed;
    }
    public int getTotalTime() {
        return totalTime;
    }

    public String getAthleteName() {
        return athleteName;
    }
}
