package policy;

public class SortPolicyFactory {
	public SortPolicy getPolicy(String name){
		if(name == "sort a la carte")
			return new SortALaCarte();
		if(name == "sort half meal")
			return new SortHalfMeal();
		return null;
	}
}
