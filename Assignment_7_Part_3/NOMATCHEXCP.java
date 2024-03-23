package Assignment_7.Assignment_7_Part_3;

class NOMATCHEXCP extends Exception{
    private int lineNumber;
    private String erroneousString;

    public NOMATCHEXCP(int lineNumber, String erroneousString) {
        this.lineNumber = lineNumber;
        this.erroneousString = erroneousString;
    }

    @Override
    public String toString() {
        return "NOMATCHEXCP at line " + lineNumber + ": Input string '" + erroneousString + "' does not match 'India'.";
    }
}
