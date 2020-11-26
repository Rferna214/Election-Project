class State{
        private String stateNames;
        private int electoralVoteCounts;
        private String party;

        public State(String stateNames, int electoralVoteCounts, String party) {
            this.stateNames = stateNames;
            this.electoralVoteCounts = electoralVoteCounts;
            this.party = party;
        }

        public String getStateNames() {
            return stateNames;
        }

        public void setStateNames(String stateNames) {
            this.stateNames = stateNames;
        }

        public int getElectoralVoteCounts() {
            return electoralVoteCounts;
        }

        public void setElectoralVoteCounts(int electoralVoteCounts) {
            this.electoralVoteCounts = electoralVoteCounts;
        }

        public String getParty() {
            return party;
        }

        public void setParty(String party) {
            this.party = party;
        }

}
