package principal;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {
	 public static void main(String[] args) {
	 Map <String, String> map = new HashMap<>();

     Funcionario a = new Funcionario("a1234", "Steve Jobs");
     Funcionario b = new Funcionario("a1235", "Scott McNealy");
     Funcionario c = new Funcionario("a1236", "Jeff Bezos");
     Funcionario d = new Funcionario("a1237", "Larry Ellison");
     Funcionario e = new Funcionario("a1238", "Bill Gates");

     map.put(a.getID(), a.getNome());
     map.put(b.getID(), b.getNome());
     map.put(c.getID(), c.getNome());
     map.put(d.getID(), d.getNome());
     map.put(e.getID(), e.getNome());

     Set<String> chaves = map.keySet();

   
     System.out.println("Contem a ID a1234: " + map.containsKey("a1234"));
     System.out.println("Contem a ID a1235: " + map.containsKey("a1235"));
     System.out.println("Contem a ID a1236: " + map.containsKey("a1236"));
     System.out.println("Contem a ID a1237: " + map.containsKey("a1237"));
     System.out.println("Contem a ID a1238: " + map.containsKey("a1238"));
     System.out.println("Contem a ID inexistente a1239: " + map.containsKey("a1239"));

     System.out.println("\n" + map.get("a1234"));
     System.out.println("\n" + map.get("a1235"));
     System.out.println("\n" + map.get("a1236"));
     System.out.println("\n" + map.get("a1237"));
     System.out.println("\n" + map.get("a1238"));
     System.out.println("\n" + map.get("a9999"));

     for (String id : chaves) {
         System.out.println("ID: " + id + "\nNome: " + map.get(id) + "\n");
     }


     Mapa a2 = new Mapa("Steve Jobs", "Professor", 2200);
     Mapa b2 = new Mapa("Scott McNealy", "Pedreiro", 1100);
     Mapa c2 = new Mapa("Jeff Bezos", "Contador", 149.90);
     Mapa d2 = new Mapa("Larry Ellison", "Engenheiro", 11000);
     Mapa e2 = new Mapa("Bill Gates", "Maquinista", 7000);

     Map<String, Mapa> mapV2 = new HashMap<>();

     mapV2.put("a1234", a2);
     mapV2.put("a1235", b2);
     mapV2.put("a1236", c2);
     mapV2.put("a1237", d2);
     mapV2.put("a1238", e2);

     Set<String> chavesV2 = map.keySet();

     for (String id : chavesV2) {
         System.out.println("ID: " + id + mapV2.get(id) + "\n");
     }

     pesquisaMapa("a1238", mapV2);
    
     pesquisaMapa("A1238", mapV2);

 }

 public static void pesquisaMapa(String id, Map<String, Mapa> mapV2) {

     id = id.toLowerCase();
     System.out.println(mapV2.get(id));
 }

}