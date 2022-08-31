package airConnection;

public class FlightLeg {

    private String from;
    private String to;
    boolean delayed = false;
    private int price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.price = flightLegBuilder.price;
    }


    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", delayed=" + delayed +
                '}';
    }

    public static class FlightLegBuilder{
        private String from;
        private String to;
        boolean delayed = false;
        private int price;

        public FlightLeg build(){
            return new FlightLeg(this);
        }

        public FlightLegBuilder buildFrom(String from){
            this.from = from;
            return this;
        }

        public FlightLegBuilder buildTo(String to){
            this.to = to;
            return this;
        }

        public FlightLegBuilder buildPrice(int price){
            this.price = price;
            return this;
        }

    }
}

