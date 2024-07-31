public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length()>=3 & name.length()<=19 & !name.startsWith(" ") & !name.endsWith(" ")){
            String[]  split = name.split(" ");
            if (split.length==2) {
                System.out.println("It is suitable");
                return true;
            }
        }
        System.out.println("It is not suitable");
        return false;
    }
}
