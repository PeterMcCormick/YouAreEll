public class Message {

    private String sequence;
    private String timestamp = "2018-03-21T01:00:00:0Z";
    private String fromid;
    private String toid;
    private String message;

    public Message(String sequence) {
        this.sequence = sequence;
        this.timestamp = timestamp;
        this.fromid = fromid;
        this.toid = toid;
        this.message = message;

    }

    public Message(String fromid, String toid, String message) {
        this.fromid = fromid;
        this.toid = toid;
        this.message = message;
    }

    public Message(String fromid, String message) {
        this.fromid = fromid;
        this.message = message;
    }


    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormid() {
        return fromid;
    }

    public void setFormid(String formid) {
        this.fromid = formid;
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


