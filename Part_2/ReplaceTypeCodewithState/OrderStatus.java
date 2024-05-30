package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithState;

public enum OrderStatus {
    NEW("New"),
    PROCESSING("Processing"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}