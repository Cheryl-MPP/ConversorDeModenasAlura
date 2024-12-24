class ExchangeRateResponse {
    private String result;
    private String documentation;
    private String terms_of_use;
    private long time_last_update_unix;
    private String time_last_update_utc;
    private long time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private double conversion_rate;

    ExchangeRateResponse() {
    }

    public double getConversion_rate() {
        return this.conversion_rate;
    }

    public String getBase_code() {
        return this.base_code;
    }

    public String getTarget_code() {
        return this.target_code;
    }
}
