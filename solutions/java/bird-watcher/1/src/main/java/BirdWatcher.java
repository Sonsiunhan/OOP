class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > 7)
            numberOfDays = 7;
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int numberOfBusyDay = 0;
        for (int bird : birdsPerDay) {
            if (bird >= 5) {
                numberOfBusyDay++;
            }
        }
        return numberOfBusyDay;
    }
}
