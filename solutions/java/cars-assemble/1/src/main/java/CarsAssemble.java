public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double totalProduct = 221.0 * speed;
        if (speed >= 1 && speed <= 4)
            return totalProduct;
        if (speed >= 5 && speed <= 8)
            return totalProduct * 0.9;
        if (speed == 9)
            return totalProduct * 0.8;
        return totalProduct * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
