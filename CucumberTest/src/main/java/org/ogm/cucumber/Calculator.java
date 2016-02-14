package org.ogm.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	List<Integer> args = new ArrayList<Integer>();
	public Calculator add(Integer num1){
		args.add(num1);
		return this;
	}
	
	public Integer sum(){
		Integer result = new Integer(0);
		for (Integer integer : args) {
			result+=integer;
		}
		
		return result;
	}
	
	public Integer sub(){
		Integer result = new Integer(args.get(0));
		for (int index= args.size() - 1 ; index > 0 ; index--) {
			result-=args.get(index);
		}
		
		return result;
	}
}
