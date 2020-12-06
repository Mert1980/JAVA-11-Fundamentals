package be.intecbrussel.gameshop;

public class Stock {

        private static int fortniteAmount;
        private static int callOfDutyAmount;
        private static int fifa21Amount;
        private static int robloxAmount;
        private static int avengersAmount;

        public GameShop.Game gameSold(GameShop.Game game){
            if(game != null && game.getName().equalsIgnoreCase("fortnite")){
                setFortniteAmount(getFortniteAmount()-1);
            }
            if(game != null && game.getName().equalsIgnoreCase("callOfDuty")){
                setCallOfDutyAmount(getCallOfDutyAmount()-1);
            }
            if(game != null && game.getName().equalsIgnoreCase("fifa21")){
                setFifa21Amount(getFifa21Amount());
            }
            if(game != null && game.getName().equalsIgnoreCase("roblox")){
                setRobloxAmount(getRobloxAmount()-1);
            }
            if(game != null && game.getName().equalsIgnoreCase("avengers")){
                setAvengersAmount(getAvengersAmount()-1);
            }
            return game;
        }

        public static int getFortniteAmount() {
            return fortniteAmount;
        }

        public void setFortniteAmount(int fortniteAmount) {
            this.fortniteAmount = fortniteAmount;
        }

        public static int getCallOfDutyAmount() {
            return callOfDutyAmount;
        }

        public void setCallOfDutyAmount(int callOfDutyAmount) {
            this.callOfDutyAmount = callOfDutyAmount;
        }

        public static int getFifa21Amount() {
            return fifa21Amount;
        }

        public void setFifa21Amount(int fifa21Amount) {
            this.fifa21Amount = fifa21Amount;
        }

        public static int getRobloxAmount() {
            return robloxAmount;
        }

        public void setRobloxAmount(int robloxAmount) {
            this.robloxAmount = robloxAmount;
        }

        public static int getAvengersAmount() {
            return avengersAmount;
        }

        public void setAvengersAmount(int avengersAmount) {
            this.avengersAmount = avengersAmount;
        }
    }

