package coronaseat;

public class PaymentCanceled extends AbstractEvent {

    private Long id;
    private Long bookingId;
    private String status;
/*
    public PaymentCanceled(){
        super();
    }
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
