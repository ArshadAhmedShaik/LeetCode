class ParkingSystem {
    
    int[] space;

    public ParkingSystem(int big, int medium, int small) {
        this.space = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
         return space[carType-1]-- > 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */