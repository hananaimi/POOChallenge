package POOChallenge;

public class Wilder {
    public String firstname;
    public boolean aware;

    public Wilder(String firstname, boolean aware){
        this.firstname= firstname;
        this.aware= aware;
    }
    public String getFirstname() {
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public boolean isAware(){
        return this.aware;
    }
    public void setAware(boolean aware){
        this.aware=aware;
    }
    public String whoAmI(){
        if (isAware()) {
            return ("Je m'appelle "+ getFirstname()+" et je suis aware");
        }
        else {
            return ("Je m'appelle "+ getFirstname()+" et je ne suis pas aware");
        }
    }


    }

