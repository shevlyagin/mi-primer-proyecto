package test;

public class Cat {

    /*
    public
    private
    protected

     */

    public String publicName;
    private String privateName;
    protected String protectedName;
    String name;

    public Cat(){

    }

    public Cat(String privateName) {
        this.privateName = privateName;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

}
