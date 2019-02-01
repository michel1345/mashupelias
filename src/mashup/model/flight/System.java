package mashup.model.flight;

public class System {

        private String squawk;

        private String updated;

        public String getSquawk ()
        {
            return squawk;
        }

        public void setSquawk (String squawk)
        {
            this.squawk = squawk;
        }

        public String getUpdated ()
        {
            return updated;
        }

        public void setUpdated (String updated)
        {
            this.updated = updated;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [squawk = "+squawk+", updated = "+updated+"]";
        }
}
