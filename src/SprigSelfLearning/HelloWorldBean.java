package SprigSelfLearning;


public class HelloWorldBean {

    private String message;

    private String myName;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void print(){
        System.out.println(message + " to " + myName);
    }
}
