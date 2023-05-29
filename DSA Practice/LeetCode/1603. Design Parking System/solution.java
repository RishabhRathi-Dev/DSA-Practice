class ParkingSystem {
    private static int big = 0;
    private static int medium = 0;
    private static int small = 0;
    

    public ParkingSystem(int big, int medium, int small) {
        ParkingSystem.big = big;
        ParkingSystem.medium = medium;
        ParkingSystem.small = small;
        
    }
    
    public boolean addCar(int carType) {
        if (carType == 3){
            small--;

            if (small < 0){
                return false;
            }
        } else if (carType == 2){
            medium--;

            if(medium < 0){
                return false;
            }
        } else if (carType == 1){
            big--;

            if (big < 0){
                return false;
            }
        }

        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */