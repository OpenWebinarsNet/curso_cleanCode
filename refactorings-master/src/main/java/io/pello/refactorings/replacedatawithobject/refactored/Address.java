package io.pello.refactorings.replacedatawithobject.refactored;

public class Address {
		private String street;
		private String po;
		private String city;
		
		public Address(String street, String po, String city) {
			this.street = street;
			this.po = po;
			this.city = city;
		}

		@Override
		public String toString() {
			return city;
		}

			
}
