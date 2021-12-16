package weatherstation;

import java.util.Arrays;

public class WeatherStation {
    public static void main(String[] args) {
        double yearTemperatureSum = 0;
        // @formatter:off
        int[][] dailyMeanTemperatures = {
                { -3, 2, 6, 3, -1, 0, 4, 9, 9, 13, 5, 7, 11, 8, 10, 7, 4, 1, 1, 1, 1, 1, 1, 1, 2, 1, 3, 4, 4, 3, 3 },
                { 2, 1, 0, -1, -1, 0, -2, -2, 0, 2, 0, -1, 1, 6, 1, 1, 1, 2, 2, 7, 5, 3, 4, 5, 5, 5, 5, 4 },
                { 8, 9, 8, 5, 4, 4, 5, 7, 8, 9, 8, 6, 5, 4, 4, 6, 9, 10, 10, 8, 8, 7, 9, 9, 8, 6, 8, 8, 11, 11, 12 },
                { 7, 6, 6, 6, 5, 5, 6, 8, 12, 15, 14, 15, 14, 15, 17, 19, 13, 10, 12, 13, 14, 14, 12, 14, 14, 16, 15, 9, 10, 13 },
                { 10, 12, 16, 19, 18, 16, 15, 16, 17, 17, 19, 22, 20, 18, 10, 14, 16, 17, 15, 11, 12, 13, 15, 16, 16, 13, 12, 15, 18, 16, 17 },
                { 18, 21, 23, 21, 25, 24, 23, 16, 16, 17, 21, 21, 21, 21, 18, 17, 17, 16, 16, 14, 16, 18, 15, 16, 18, 20, 21, 21, 22, 24 },
                { 26, 28, 29, 29, 30, 26, 27, 22, 20, 19, 24, 23, 22, 24, 24, 26, 29, 25, 24, 26, 27, 25, 22, 24, 21, 17, 19, 19, 16, 17, 17 },
                { 18, 21, 24, 21, 22, 27, 29, 27, 23, 22, 24, 25, 25, 21, 19, 16, 17, 16, 17, 18, 19, 20, 18, 17, 18, 19, 24, 25, 23, 26, 26 },
                { 22, 17, 17, 16, 14, 13, 13, 15, 16, 15, 15, 19, 18, 16, 15, 17, 16, 16, 14, 14, 14, 15, 12, 14, 13, 15, 14, 12, 14, 12 },
                { 10, 11, 16, 14, 15, 18, 16, 12, 12, 12, 12, 9, 8, 7, 5, 7, 6, 8, 8, 6, 7, 10, 12, 12, 15, 8, 8, 10, 12, 8, 9 },
                { 7, 7, 6, 10, 12, 16, 18, 16, 17, 13, 9, 8, 11, 11, 14, 15, 14, 15, 15, 12, 4, 3, 2, 0, 4, 4, -1, 3, 8, 10 },
                { 11, 8, 2, 9, 7, 11, 10, 7, 8, 1, 9, 9, 6, 3, 8, 12, 13, 12, 8, 10, 11, 12, 12, 11, 12, 11, 9, 4, 7, 4, 7 } };
        // @formatter:on
        // year temperature average
        for (int rows = 0; rows < dailyMeanTemperatures.length; rows++) {
            for (int cols = 0; cols < dailyMeanTemperatures[rows].length; cols++) {
                yearTemperatureSum = yearTemperatureSum + dailyMeanTemperatures[rows][cols];
            }
        }
        System.out.println("Jahresdurchschnittstemperatur: " + Math.round((yearTemperatureSum / 365) * 10) / 10.0 + " Grad");

        //the average for each month
        System.out.println("Monatsdurchschnittstemperaturen:");
        for (int rows = 0; rows < dailyMeanTemperatures.length; rows++) {
            double sumOfTempFor1Month = 0;
            double avgFor1Month = 0;
            int numOfDays = 0;
            for (int cols = 0; cols < dailyMeanTemperatures[rows].length; cols++) {
                numOfDays = dailyMeanTemperatures[rows].length;
                sumOfTempFor1Month = sumOfTempFor1Month + dailyMeanTemperatures[rows][cols];
            }
            avgFor1Month = (sumOfTempFor1Month / numOfDays);
            double roundedAvg = Math.round(avgFor1Month * 10) / 10.0;
            System.out.println("-> Monat " + (rows + 1) + ": " + roundedAvg + " Grad");
        }

        // to find the warmest day in the year
        double warmstGrade = dailyMeanTemperatures[0][0];
        int warmstDay = 0;
        int warmstMonth = 0;
        for (int rowsWarmst = 0; rowsWarmst < dailyMeanTemperatures.length; rowsWarmst++) {
            for (int colsWarmst = 0; colsWarmst < dailyMeanTemperatures[rowsWarmst].length; colsWarmst++) {
                if (dailyMeanTemperatures[rowsWarmst][colsWarmst] > warmstGrade) {
                    warmstGrade = dailyMeanTemperatures[rowsWarmst][colsWarmst];
                    warmstDay = colsWarmst + 1;
                    warmstMonth = rowsWarmst + 1;
                }
            }
        }
        System.out.println("Wärmster Tag am " + warmstDay + "." + warmstMonth + ".2015 mit " + (int) warmstGrade + " Grad.");

        // every 100 days
        int[] temperatures = new int[365];
        int counter = 0;
        for (int rows = 0; rows < dailyMeanTemperatures.length; rows++) {
            for (int cols = 0; cols < dailyMeanTemperatures[rows].length; cols++) {
                temperatures[counter] = dailyMeanTemperatures[rows][cols];
                counter++;
            }
        }
        System.out.println("Jeder 100. Tag:");
        System.out.println("-> Tag 100: " + temperatures[99] + " Grad, Tag 200: " + temperatures[199] + " Grad, Tag 300: "
                + temperatures[299] + " Grad");

        int[] sorted = new int[365];
        Arrays.sort(temperatures);
        int sortCounter = (temperatures.length - 1);
        for (int i = 0; i < temperatures.length; i++) {
            sorted[i] = temperatures[sortCounter];
            sortCounter--;
        }

        String firstFiveGerades = "";
        for (int a = 0; a < 5; a++) {
            firstFiveGerades = firstFiveGerades + sorted[a] + " Grad";
            if (a != 4) {
                firstFiveGerades += ", ";
            }
        }
        System.out.println("Die fünf wärmsten Tage:");
        System.out.println("-> " + firstFiveGerades);
    }
}
