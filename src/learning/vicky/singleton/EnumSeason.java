package learning.vicky.singleton;

public enum EnumSeason {
    Spring, Summer, Autumn, Winter;


    @Override
    public String toString(){
        switch(this.name()){
            case "Spring":
                return "we can see flowers...";
            case "Summer":
                return "Let's swimming!";
            case "Autumn":
            case "Winter":
                return "so cold";
            default:
                return "wrong!";
        }
    }
}
