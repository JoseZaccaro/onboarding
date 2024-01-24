package test;

public class MenuImpl implements Menu{
    @Override
    public void desplegarMenu() {
        System.out.println(menu());

    }

    public String menu(){
        String asda = """
                Opcion 1
                Opcion 2
                Opcion 3
                """;
        return asda;
    }
}
