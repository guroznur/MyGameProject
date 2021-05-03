package day4hw3;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		if(gamer.getId()==1) {
			return true;
			//System.out.println("Kimlik doðrulama baþarýlý.");
			
		}else {
			
		
			//System.out.println("Kimlik doðrulama baþarýsýz!");
			return false;
		}
	}

}
