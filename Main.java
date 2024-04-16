package Main;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
		  Scanner myObj = new Scanner(System.in);
		  System.out.println("Enter Spartan Service Number: ");
		  String SID = myObj.nextLine();
		
		  String spartanName = "";
		
		  /* boolean isMasterChief = SID.equals("S-117");
		  boolean isBlueTeam = SID.equals(S-104"") */
		
		  if (SID.equals("S-117")) {
			  spartanName = "Master Chief";
		  } else if (SID.equals("S-104")) {
			  spartanName = "Spartan Frederic Ellsworth";
		  } else if (SID.equals("S-058")) {
			  spartanName = "Spartan Linda Pravdin";
		  } else if (SID.equals("S-087")) {
			  spartanName = "Spartan Kelly Shaddock";
      } else if (SID.equals("73808-3153-JL")) {
        spartanName = "Spartan Jameson Locke";
      } else if (SID.equals("93312-28001-HT")) {
    		spartanName = "Spartan Holly Tanaka";
      } else if (SID.equals("92458-37017-EB")) {
    		spartanName = "Spartan Edward Buck";
      } else if (SID.equals("44482-91201-OV")) {
    		spartanName = "Spartan Olympia Vale";
      } else { 
        System.out.println("Spartan is is neither a part of Blue Team nor Team Osiris.");
        return;
      }
		
		  System.out.println("Welcome, " + spartanName + "!");
		
		  if(SID.equals("S-117")) {
			  System.out.println("It's the Master Chief!");
		  } else if  (SID.equals("S-104") || SID.equals("S-058") || SID.equals("S-87")) {
			  System.out.println("You are a member of Blue Team.");
		  } else {
			  System.out.println("You are a member of Team Osiris.");
		  }
  }
}
