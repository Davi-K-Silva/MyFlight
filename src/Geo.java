public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static double distancia(Geo origin, Geo destiny){
        double R = 6371;
        double lat1 = Math.toRadians(origin.getLatitude());
        double lat2 = Math.toRadians(destiny.getLatitude());
        double lon1 = Math.toRadians(origin.getLongitude());
        double lon2 = Math.toRadians(destiny.getLongitude());

        double a = Math.pow(Math.sin((lat2 - lat1)/2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin((lon2 - lon1)/2), 2);
        double c = 2 * Math.atan(Math.sqrt(a) / Math.sqrt(1-a));
        double d = R * c ;
        return d;
    }
}
