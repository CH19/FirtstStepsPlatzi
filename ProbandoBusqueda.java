import java.util.Scanner;

public class ProbandoBusqueda{
    public static void main(String[] args) {
        int AP1, AP2, APM, Busqueda;
        int i = 1;
        Scanner respuest = new Scanner(System.in);
       System.out.println("introduce el numero que deseas buscar");
        String usuario;
     //   String informacion[] = {"juan","pedro","emilio","christian","fabian","cristina","juana","daniel"};
    AP1 = 1;
  
    
    boolean BusquedaExitosa = false;
    
      /*   do {
           usuario = respuest.nextLine();
            for (int j = 0; j < informacion.length; j++) {
                BusquedaExitosa = usuario.equalsIgnoreCase(informacion[j]); 
                if(BusquedaExitosa){
                    break;
                }
            }
            if(!BusquedaExitosa){
                System.out.println("intentalo nuevamente");
            }
        } while (!BusquedaExitosa);
        System.out.println("Bien hecho el nombre" + usuario + " existe en la base de datos");
*/
    int information[] = {10,20,30,40,50,60,70,80,100, 110, 120};
    AP2 = information.length;
   
    int user = respuest.nextInt();
  
    do {
        APM = (AP1 + AP2)/2;
        BusquedaExitosa = user == APM;
        if(user > APM){
            AP1 = AP1 + 1;
        }else if(user < APM){
            AP2 = AP2- 1;
        }
        if(!BusquedaExitosa){
            System.out.println(i +"cargando");
            i++;
        }
    } while (!BusquedaExitosa);
    System.out.println("la busqueda fue exitosa " + user);
    }
}