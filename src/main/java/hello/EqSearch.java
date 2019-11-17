package hello;


public class EqSearch {
    private int distance;
    private int minmag;

    public EqSearch(int distance, int minmag){
        this.distance = distance;
        this.minmag   = minmag;
    }
    public EqSearch(){}

    public int getDistance(){return distance;}
    public int getMinmag(){return minmag;}

    public void setDistance(int distance){this.distance = distance;}
    public void setMinmag(int minmag){this.minmag = minmag;}
}