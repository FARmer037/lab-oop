public class Air {
    private String status = "off";
    private int temp;

    public Air() {
        
    }

    public Air(String status) {
        this.status = status;
    }

    public Air(String status, int temp) {
        this.status = status;
        if (status.compareTo("on") == 0) {
            this.temp = temp;
        }
        else if (status.compareTo("off") == 0){
            throw new IllegalArgumentException("** Please turn on !! **");
        }
        else {
            throw new IllegalArgumentException("** on / off only !! **");
        }
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int temp) {
        if (this.status.compareTo("on") == 0) {
            this.temp = temp;
        }
        else if (status.compareTo("off") == 0){
            throw new IllegalArgumentException("** Please turn on !! **");
        }
        else {
            throw new IllegalArgumentException("** on / off only !! **");
        }
    }

    public void changeTemp(char change) {
        if (status.compareTo("on") == 0) {
            if (change == '+') {
                this.temp += 1;
            }
            else if (change == '-') {
                this.temp -= 1;
            }
        }
        else if (status.compareTo("off") == 0){
            throw new IllegalArgumentException("** Please turn on !! **");
        }
        else {
            throw new IllegalArgumentException("** on / off only !! **");
        }
    }
}