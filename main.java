package autopista;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("***************");
        
        auto auto1 = new auto("rojo","grande","Honda",2021,"grandi10");
        System.out.println(auto1.toStringPublic());
     
        auto1.setColor("rosa");
        auto1.setAnio(1990);
        System.out.println("El auto es de color:" + auto1.getColor() );
    }  
}
