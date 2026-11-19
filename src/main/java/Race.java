public class Race {
    String leadersName = "";
    int leadersDistance = 0;

    public void findTheLeader (Car newCar) {
        int newDistance = newCar.speed * 24;

        if (newDistance > leadersDistance) {
            leadersName = newCar.name;
            leadersDistance = newDistance;
        }
    }
}