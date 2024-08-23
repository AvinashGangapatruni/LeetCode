class Solution {
    public String fractionAddition(String expression) {
        expression = expression.replace("-", "+-");
        String[] fractionArray = expression.split("\\+"); 

        int totalNumerator = 0, totalDenominator = 1;

        for (String fraction : fractionArray) {
            if (!fraction.isEmpty()) {
                String[] fractionParts = fraction.split("/");
                int currentNumerator = Integer.parseInt(fractionParts[0]);
                int currentDenominator = Integer.parseInt(fractionParts[1]);

                totalNumerator = totalNumerator * currentDenominator + currentNumerator * totalDenominator;
                totalDenominator *= currentDenominator;

                int commonDivisor = findGCD(Math.abs(totalNumerator), Math.abs(totalDenominator));
                totalNumerator /= commonDivisor;
                totalDenominator /= commonDivisor;
            }
        }

        return totalNumerator + "/" + totalDenominator;
    }

    private static int findGCD(int x, int y) {
        while (y != 0) {
            int remainder = y;
            y = x % remainder;
            x = remainder;
        }
        return x;
    }
}
