
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        VehicleRegister register = new VehicleRegister();

        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }

        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        Map<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        register.add(newPlate, "chungus");
        System.out.println(register.add( new RegistrationPlate("FI", "ABC-123"), "Arto"));
//Getting a plate which is already in the register should return its owner
VehicleRegister ar = new VehicleRegister(); 
ar.add( new RegistrationPlate("FI", "AAA-111"), "Arto");
ar.add( new RegistrationPlate("FI", "BBB-222"), "Pekka");
ar.add( new RegistrationPlate("FI", "CCC-333"), "Arto");
ar.printOwners();
// expected:<Arto> but was:<null
        // if the hashCode hasn't been overwritten, the owners are not found
    }
}
