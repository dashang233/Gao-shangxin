package orderSystem;

public enum Member {
    M1("111","金卡"),M2("222","银卡"),M3("333","普通"),
    M4("444","普通"),M5("555","普通");
    private String MemberID;
    private String level;
    private double discount;

    Member(String memberID, String level) {
        MemberID = memberID;
        this.level = level;
        switch(level){
            case "金卡":
                this.discount = 0.7;
                break;
            case "银卡":
                this.discount = 0.8;
                break;
            case "普通":
                this.discount = 0.9;
                break;
        }
    }

    public String getMemberID() {
        return MemberID;
    }

    public String getLevel() {
        return level;
    }

    public double getDiscount() {
        return discount;
    }
}
