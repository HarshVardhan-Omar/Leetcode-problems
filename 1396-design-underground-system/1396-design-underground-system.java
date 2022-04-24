class UndergroundSystem {

    private HashMap<Integer, Boarding> boards;
    private HashMap<String, Pair> journeys;
    public UndergroundSystem() {
        boards= new HashMap<>();
        journeys= new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Boarding b=new Boarding(stationName,t);
        boards.put(id,b);
    }
    
    public void checkOut(int id, String stationName, int t) {
        Boarding boardedAt=boards.get(id);
        String journey=boardedAt.stationName+" - "+stationName;
        int time=t-boardedAt.time;
        Pair p=journeys.getOrDefault(journey,new Pair(0,0));
        p.sum+=time;
        p.cnt++;
        journeys.put(journey,p);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key=startStation+" - "+endStation;
        Pair p= journeys.get(key);
        double avg=(double)p.sum/p.cnt;
        return avg;
    }
    
    class Boarding{
        String stationName;
        int time;
        Boarding(String stationName, int time){
            this.stationName=stationName;
            this.time=time;
        }
    }
    
    class Pair{
        int sum;
        int cnt;
        Pair(int sum,int cnt){
            this.sum=sum;
            this.cnt=cnt;
        }
    }
}