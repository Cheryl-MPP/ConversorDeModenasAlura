public record Monedas(String base_code, String target_code, double conversion_rate) {
    public Monedas(String base_code, String target_code, double conversion_rate) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public String base_code() {
        return this.base_code;
    }

    public String target_code() {
        return this.target_code;
    }

    public double conversion_rate() {
        return this.conversion_rate;
    }
}

