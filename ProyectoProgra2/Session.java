public class Session {
    private int sessionId;
    private String clientId;
    private boolean active;

    public Session(int sessionId, String clientId) {
        this.sessionId = sessionId;
        this.clientId = clientId;
        this.active = true;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
