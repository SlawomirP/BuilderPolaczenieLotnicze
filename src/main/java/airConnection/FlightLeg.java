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
        if (this.price == 0){
            throw new IllegalStateException("brak pola cena");
        }
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
        boolean delayed;
        private int price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
            this.price = 0;
        }

        public FlightLeg build(){
            return new FlightLeg(this);
        }

        public FlightLegBuilder from(String from){
            this.from = from;
            return this;
        }

        public FlightLegBuilder to(String to){
            this.to = to;
            return this;
        }

        public FlightLegBuilder price(int price){
            this.price = price;
            return this;
        }

    }
}

