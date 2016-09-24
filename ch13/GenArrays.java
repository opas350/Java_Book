// Generics and arrays.
class Gen< T extends Number > {
	T ob;

	T vals[]; // OK
	
	Gen(T o, T[] nums) {
		ob = o;

		// This statemnt is illegal.
		// vals = new T[10];  // cant create an array of T
		// But, this statement is OK.
		vals = nums; // Ok to assign reference to existing array
	}
}

class GenArrays {
	public static void main(String args[]) {
		Integer n[] = { 1, 2 ,3, 4, 5 };

		Gen<Integer> iOb = new Gen<Integer>(50, n);

		// Cant create an array of type-specific generic references.
		// Gen<Integer> gens[] = new Gen<Integer>[10]; // Error
		//
		// This is OK.
		Gen<?> gens[] = new Gen<?>[10]; // OK
	}
}
